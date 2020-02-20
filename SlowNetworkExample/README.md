# Overview

The [SlowNetworkServer](src/java/com/microej/example/hoka/SlowNetworkServer.java) is designed for a slow network :

-   Resources are sent in a compressed form when available if supported by the client.
-   Also, immutable resources are cached in the user\'s browser.

# Usage

1.  Run the example.
2.  Go to [localhost:8080](http://localhost:8080), you should see the
    [microej.v1.png](filesystem/hoka/png/microej.v1.png) image.
3.  Refresh the page by pressing `ENTER` in the URL bar (refresh button
    will disable the cache for the request) and look at the Hoka logs :
    the image is not requested again (because it was cached by the
    browser).
4.  Edit the file [index.html](filesystem/hoka/index.html) and change
    the image source to `png/microej.v2.png`.
5.  Go to [localhost:8080](http://localhost:8080) again, you should see
    the [microej.v2.png](filesystem/hoka/png/microej.v2.png) image.
6.  Refresh the page by pressing `ENTER` in the URL bar (refresh button
    will disable the cache for the request) and look at the Hoka logs :
    the image is not requested again (because it was cached by the
    browser).

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