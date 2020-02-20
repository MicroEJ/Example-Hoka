/*
 * Java
 *
 * Copyright 2017-2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
package com.microej.example.hoka;

import java.util.Map;

import ej.hoka.http.HTTPConstants;
import ej.hoka.http.HTTPRequest;
import ej.hoka.http.HTTPResponse;
import ej.hoka.rest.RestEndpoint;

public class HelloEndPoint extends RestEndpoint {

	private static final String END_POINT = "/hello/*";

	public HelloEndPoint() throws IllegalArgumentException {
		super(END_POINT);
	}

	@Override
	public HTTPResponse delete(HTTPRequest request, Map<String, String> attributes) {
		HTTPResponse response = new HTTPResponse("REPLY " + request.getURI() + " | DELETE");
		response.setStatus(HTTPConstants.HTTP_STATUS_OK);
		response.addHeaderField(HTTPConstants.FIELD_CONNECTION, HTTPConstants.FIELD_CONNECTION_VALUE_CLOSE);
		return response;
	}

	@Override
	public HTTPResponse post(HTTPRequest request, Map<String, String> attributes) {
		HTTPResponse response = new HTTPResponse("REPLY " + request.getURI() + " | POST");
		response.setStatus(HTTPConstants.HTTP_STATUS_OK);
		response.addHeaderField(HTTPConstants.FIELD_CONNECTION, HTTPConstants.FIELD_CONNECTION_VALUE_CLOSE);
		return response;
	}

	@Override
	public HTTPResponse get(HTTPRequest request, Map<String, String> attributes) {
		HTTPResponse response = new HTTPResponse("REPLY " + request.getURI() + " | GET");
		response.setStatus(HTTPConstants.HTTP_STATUS_OK);
		response.addHeaderField(HTTPConstants.FIELD_CONNECTION, HTTPConstants.FIELD_CONNECTION_VALUE_CLOSE);
		return response;
	}

	@Override
	public HTTPResponse put(HTTPRequest request, Map<String, String> attributes) {
		HTTPResponse response = new HTTPResponse("REPLY " + request.getURI() + " | PUT");
		response.setStatus(HTTPConstants.HTTP_STATUS_OK);
		response.addHeaderField(HTTPConstants.FIELD_CONNECTION, HTTPConstants.FIELD_CONNECTION_VALUE_CLOSE);
		return response;
	}

}
