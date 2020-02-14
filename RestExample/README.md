# Overview

This [RestServer](src/java/com/microej/example/hoka/RestServer.java) example uses a REST handler with a "Hello" endpoint. The example also has a dump handler that dumps the request in the output stream of the application in case the request is out of the REST scope.

# Usage

1.  Run the example.
2.  Go to [/](http://localhost:8080/), you should see the decompressed html content of [index.html.gz](src/resources/hoka/index.html.gz).
3.  Go to [/hello/world](http://localhost:8080/hello/world), you should receive a text starting with \"REPLY /hello/world\".
4.  Go to [/not/a/valid/endpoint](http://localhost:8080/not/a/valid/endpoint), you should receive a textual dump of the request you sent.

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
_Copyright 2019 MicroEJ Corp. All rights reserved._
_Use of this source code is governed by a BSD-style license that can be found with this software._