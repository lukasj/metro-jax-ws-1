/*
 * Copyright (c) 2012, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.sdo.test;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.sun.xml.ws.sdo.test.AddNumbersPortType")

public class AddNumbersServiceImpl implements AddNumbersPortType {


    public AddNumbersServiceImpl() {
    }

    public int addNumbers(int arg0, int arg1) {
        return arg1 + arg0;
    }
}
