/*
 * Java
 *
 * Copyright 2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
package com.microej.example.hoka;

import java.util.Map;

import ej.hoka.http.HTTPRequest;
import ej.hoka.http.HTTPResponse;
import ej.hoka.http.requesthandler.RequestHandlerComposite;
import ej.hoka.http.support.MIMEUtils;

public class CacheHandler extends RequestHandlerComposite {

	private static final String FIELD_CACHE_CONTROL = "Cache-Control";
	private static final String FIELD_CACHE_CONTROL_VALUE_IMMUTABLE = "public, max-age=31536000, immutable";
	private static final String MIME_TYPE_IMAGE = "image/";

	// List the MIME type to consider as immutable.
	private static final String[] immutableMimeTypes = new String[] { MIMEUtils.MIME_CSS, MIMEUtils.MIME_JS,
			MIME_TYPE_IMAGE };

	@Override
	public HTTPResponse process(HTTPRequest request, Map<String, String> attributes) {
		HTTPResponse response = super.process(request, attributes);
		if (response != null) {
			String mimeType = response.getMimeType();
			if (mimeType != null && isImmutable(mimeType)) {
				response.addHeaderField(FIELD_CACHE_CONTROL, FIELD_CACHE_CONTROL_VALUE_IMMUTABLE);
			}
		}
		return response;
	}

	private boolean isImmutable(String mimeType) {
		for (String immutableMimeType : immutableMimeTypes) {
			if (mimeType.startsWith(immutableMimeType)) {
				return true;
			}
		}
		return false;
	}

}
