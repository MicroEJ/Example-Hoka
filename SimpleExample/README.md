# Overview

This is the minimum example of the Hoka library.

The example [SimpleServer](src/java/com/microej/example/hoka/SimpleServer.java) shows a basic instantiation of `HTTPServer`.

It uses the `ResourceRequestHandler`. Each time a URL is requested by a client, a match is done between this URL and resource in the [src/resources/hoka](src/resources/hoka) folder.

# Usage

1. Run the application.
2. The URL http://localhost:8080 now serves the Java resource [/hoka/index.html](src/resources/hoka/index.html).

# Requirements

This example has been tested on

- MicroEJ SDK 5.1
- With a ST STM32F746G-DISCO platform that contains :
    - EDC-1.3
    - NET-1.1

# Dependencies

*All dependencies are retrieved transitively by Ivy resolver*.

# Source

N.A.

# Restrictions

None.

---
_Copyright 2019-2020 MicroEJ Corp. All rights reserved._
_Use of this source code is governed by a BSD-style license that can be found with this software._