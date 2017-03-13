/*******************************************************************************
 * Copyright 2015-16 AutoCognite Testing Research Pvt Ltd
 * 
 * Website: www.AutoCognite.com
 * Email: support [at] autocognite.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.autocognite.ex.ddt05.datagenerator;

import java.util.Iterator;

import com.autocognite.arjuna.bases.DefaultDataRecordContainer;
import com.autocognite.arjuna.exceptions.DataSourceFinishedException;
import com.autocognite.arjuna.interfaces.DataSource;
import com.autocognite.arjuna.interfaces.DataRecord;
import com.autocognite.arjuna.interfaces.DataRecordContainer;

/*
 * It's greedy. All values are loaded in memory.
 * OK for small set of data.
 * (Optional) Notice that we are providing header values. This makes it useful for all test signatures.
 */
//
public class NonAnnotatedGreedyDG implements DataSource {
	DataRecordContainer container = null;
	Iterator<DataRecord> iter = null;
	
	public NonAnnotatedGreedyDG(){
		container = new DefaultDataRecordContainer();
		// Create headers and assign to container
		String[] names = {"left", "right", "expected"};
		container.setHeaders(names);
		//Rest is same
		Object[][] records = {
				{1,2,"1::2"},
				{1,2,"1::5"},
		};
		container.addAll(records);
		iter = container.iterator();
	}

	@Override
	public synchronized DataRecord next() throws DataSourceFinishedException {
		//This code is fully under your control as well.
		if(iter.hasNext()){
			return iter.next();
		} else {
			throw new DataSourceFinishedException("Done");
		}
	}

}
