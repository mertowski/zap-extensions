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
package org.zaproxy.zap.extension.tokengen;

import org.zaproxy.zap.utils.ZapTextArea;

import com.fasteasytrade.JRandTest.IO.OutputDestination;


public class TokenAnalysisDetailsArea extends ZapTextArea implements OutputDestination {

	private static final long serialVersionUID = 1L;
	
	public TokenAnalysisDetailsArea() {
		super();
	}

	@Override
	public void printf(String s) {
		this.append(s);
	}

	@Override
	public void puts(String s) {
		this.append(s);
	}

}