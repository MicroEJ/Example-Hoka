/*
 * Java
 *
 * Copyright 2019-2020 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
package com.microej.example.hoka;

import java.util.Map;

import ej.authz.acl.AccessControlList;
import ej.hoka.http.HTTPConstants;
import ej.hoka.http.HTTPRequest;
import ej.hoka.http.HTTPResponse;
import ej.hoka.http.support.MIMEUtils;
import ej.hoka.rest.RestEndpoint;

public class HelloEndpoint extends RestEndpoint {

	private static final HTTPResponse ACCESS_FORBIDDEN = new HTTPResponse(HTTPConstants.HTTP_STATUS_FORBIDDEN,
			MIMEUtils.MIME_PLAINTEXT, "Access Forbidden.");

	private final AccessControlList acl;

	public HelloEndpoint(String uri, AccessControlList acl) {
		super(uri);

		this.acl = acl;
	}

	@Override
	public HTTPResponse get(HTTPRequest request, Map<String, String> attributes) {
		String username = attributes.get("username");

		if (!acl.isAuthorized(username, "get", this)) {
			return ACCESS_FORBIDDEN;
		}

		HTTPResponse response = new HTTPResponse("Hello " + username + " !");
		response.setMimeType(MIMEUtils.MIME_PLAINTEXT);
		response.setStatus(HTTPConstants.HTTP_STATUS_OK);
		return response;
	}

}
