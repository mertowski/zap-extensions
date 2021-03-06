/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
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
 */
package org.zaproxy.zap.extension.sse.db;

public class EventStreamPrimaryKey implements Comparable<EventStreamPrimaryKey> {

	private final Integer streamId;
	private final Integer eventId;
	
	public EventStreamPrimaryKey(Integer streamId, Integer eventId) {
		this.streamId = streamId;
		this.eventId = eventId;
	}
	
	public Integer getEventId() {
		return eventId;
	}
	
	public Integer getStreamId() {
		return streamId;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append('#').append(streamId).append('.');
		
		if (eventId != null) {
			strBuilder.append(eventId);
		} else {
			strBuilder.append('-');
		}
		
		return strBuilder.toString();
	}

	@Override
	public int compareTo(EventStreamPrimaryKey other) {
		int result = streamId.compareTo(other.getStreamId());
		
		if (result == 0) {
			result = eventId.compareTo(other.getEventId());
		}
		
		return result;
	}
}
