/*
 * Java
 *
 * Copyright 2015-2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 */
package com.microej.example.hoka;

import java.io.IOException;

import ej.hoka.http.HTTPServer;

/*
 * This simple server exposes resources from the src/resources/hoka folder.
 */
public class SimpleServer {

	private static final int PORT = 8080;

	public static void main(String[] args) {
		// Create the HTTP server with the default resource request handler
		HTTPServer server = new HTTPServer(PORT, 10, 3);
		// Above instantiation of HTTPServer is equivalent to :
		// new HTTPServer(PORT, 10, 3, new ResourceRequestHandler("/hoka/"))

		// Send the stack trace to the client when an exception is thrown
		server.sendStackTraceOnException(true);

		// Once started, the server is accessible on http://localhost:8080
		try {
			server.start();
		} catch (IOException e) {
			throw new RuntimeException("Port " + PORT + " already in use", e);
		}
	}

}
