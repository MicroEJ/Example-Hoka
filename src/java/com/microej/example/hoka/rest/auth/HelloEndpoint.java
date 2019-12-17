/*
 * Java
 *
 * Copyright 2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
package com.microej.example.hoka.rest.auth;

import java.util.Map;

import ej.hoka.http.HTTPConstants;
import ej.hoka.http.HTTPRequest;
import ej.hoka.http.HTTPResponse;
import ej.hoka.http.support.MIMEUtils;
import ej.hoka.rest.RestEndpoint;

public class HelloEndpoint extends RestEndpoint {

	public HelloEndpoint(String uri) {
		super(uri);
	}

	@Override
	public HTTPResponse get(HTTPRequest request, Map<String, String> attributes) {
		HTTPResponse response = new HTTPResponse("Hello " + attributes.get("username") + " !");
		response.setMimeType(MIMEUtils.MIME_PLAINTEXT);
		response.setStatus(HTTPConstants.HTTP_STATUS_OK);
		return response;
	}

}
