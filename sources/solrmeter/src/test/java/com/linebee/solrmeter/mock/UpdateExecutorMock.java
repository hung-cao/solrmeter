/**
 * Copyright Linebee LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linebee.solrmeter.mock;

import java.net.MalformedURLException;

import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

import com.linebee.solrmeter.model.UpdateExecutor;


public class UpdateExecutorMock extends UpdateExecutor {
	
	private SolrServerMock server;
	
	public synchronized CommonsHttpSolrServer getSolrServer() {
		if(server == null) {
			try {
				server = new SolrServerMock();
			} catch (MalformedURLException e) {
				throw new RuntimeException(e);
			}
		}
		return server;
	}
	
	
	public SolrInputDocument getNextDocument() {
		return new SolrInputDocument();
	}

	@Override
	public void notifyAddedDocument(UpdateResponse response) {
		// TODO Auto-generated method stub
//		super.notifyAddedDocument(response);
	}


	@Override
	public void notifyCommitSuccessfull(UpdateResponse response) {
		// TODO Auto-generated method stub
//		super.notifyCommit(response);
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
//		super.start();
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	
}
