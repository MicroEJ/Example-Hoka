# Overview

This example shows how to enable HTTPS on the Hoka web server.

[HTTPSServer](src/java/com/microej/example/hoka/HTTPSServer.java) is similar to the [SimpleServer](../SimpleExample/README.md) example but with HTTPS enabled.

# Usage

1. Run the application with following configuration :
   - Runtime > Memory > Heaps > Immortal heap size (in bytes) : provide enough space for the key and the certificates (tested with 6000).
2. The URL https://localhost:8443 now serves the Java resource "/hoka/index.html".

# Requirements

This example has been tested on

- MicroEJ SDK 5.1
- With a ESP ESP32WROVER platform that contains :
    - EDC-1.3
    - NET-1.1
    - SSL-2.1

# Dependencies

*All dependencies are retrieved transitively by Ivy resolver*.

# Source

N.A.

# Restrictions

None.

---
_Copyright 2019-2020 MicroEJ Corp. All rights reserved._
_Use of this source code is governed by a BSD-style license that can be found with this software._