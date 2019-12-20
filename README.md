# Overview

This project contains examples using the Hoka HTTP Server :

- [SimpleExample](SimpleExample/README.md) : a minimal example of the Hoka webserver.
- [HttpsExample](HttpsExample/README.md) : similar to **SimpleExample** but using HTTPS.
- [RestExample](RestExample/README.md) : an example with a REST service.
- [AccessControlExample](AccessControlExample/README.md) : an example with REST services to setup a minimal application with authentication and authorization.
- [SlowNetworkExample](SlowNetworkExample/README.md) : an example to setup a webserver optimized for slow networks using compression and caching techniques.

# Usage

The examples can be run either on the simulator or on the device using following procedures.

## Run on MicroEJ Simulator

1. Right Click on the project to run
2. Select **Run as -> MicroEJ Application**
3. Select your platform
4. Press **Ok**

## Run on device

### Build

1. Right Click on the example to build
2. Select **Run as -> Run Configuration**
3. Select **MicroEJ Application** configuration kind
4. Click on **New launch configuration** icon
5. In **Execution** tab

   1. In **Target** frame, in **Platform** field, select a relevant
      platform (but not a virtual device)
   2. In **Execution** frame

      1. Select **Execute on Device**
      2. In **Settings** field, select **Build & Deploy**

6. Press **Apply**
7. Press **Run**
8. Copy the generated ``.out`` file path

### Flash

1. Use the appropriate flashing tool.

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