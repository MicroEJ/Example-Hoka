# Overview

This example [AccessControlExampleServer](src/java/com/microej/example/hoka/AccessControlExampleServer.java) use a public REST handler with a login endpoint, a logout endpoint and a *private* REST handler with a "Hello" endpoint that says hello to the authenticated user if he is authorized (username is "user" or "admin"). This example uses the default session-based authentication implementations in package ej.hoka.auth.session in the Hoka library and the ACL authorization implementation in the access-control library.

# Usage

1.  Run the example.
2.  Go to [/api/private](http://localhost:8080/api/private), you should receive a 401 Not authorized response.
3.  Go to [/api/login?username=admin](http://localhost:8080/api/login?username=admin) to login as "admin".
4.  Go back to [/api/private](http://localhost:8080/api/private), this time you should be able to pass the authentication (check cookies) and the authorization checks.
5.  Go to [/api/logout](http://localhost:8080/api/logout).
6.  Go back to [/api/private](http://localhost:8080/api/private), you are, again, not authenticated.
7.  Go to [/api/login?username=guest](http://localhost:8080/api/login?username=guest) to login as "guest".
8.  Go back to [/api/private](http://localhost:8080/api/private), this time you should be able to pass the authentication (check cookies) but not the authorization check (Error 403 Access Forbidden).

# Requirements

This library requires the following Foundation Libraries:

    @FOUNDATION_LIBRARIES_LIST@

# Dependencies

*All dependencies are retrieved transitively by Ivy resolver*.

# Source

N.A.

# Restrictions

None.

---
_Copyright 2019-2020 MicroEJ Corp. All rights reserved._
_Use of this source code is governed by a BSD-style license that can be found with this software._