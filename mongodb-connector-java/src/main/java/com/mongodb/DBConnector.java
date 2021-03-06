// DBConnector.java

/**
 *      Copyright (C) 2008 10gen Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.mongodb;

public interface DBConnector {

	public void requestStart();

	public void requestDone();

	public void requestEnsureConnection();

	public WriteResult say(String namespace, OutMessage m, WriteConcern concern)
			throws MongoException;

	public Response call(String namespace, OutMessage m) throws MongoException;

	public Response call(String namespace, OutMessage m, int retries)
			throws MongoException;
}
