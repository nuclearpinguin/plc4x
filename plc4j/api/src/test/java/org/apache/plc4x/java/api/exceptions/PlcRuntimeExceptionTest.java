/*
 Licensed to the Apache Software Foundation (ASF) under one
 or more contributor license agreements.  See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership.  The ASF licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package org.apache.plc4x.java.api.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PlcRuntimeExceptionTest {

    @Test
    public void simpleStringConstructor() {
        assertThrows(PlcRuntimeException.class,() -> {
            throw new PlcRuntimeException("Foo");
        });
    }

    @Test
    public void simpleThrowableConstructor() {
        assertThrows(PlcRuntimeException.class,() -> {
            throw new PlcRuntimeException(new IllegalArgumentException("bar"));
        });
    }

    @Test
    public void simpleStringAndThrowableConstructor() {
        assertThrows(PlcRuntimeException.class,() -> {
            throw new PlcRuntimeException("foo", new IllegalArgumentException("bar"));
        });
    }

    @Test
    public void complexStringAndThrowableConstructor() {
        assertThrows(PlcRuntimeException.class,() -> {
            throw new PlcRuntimeException("foo", new IllegalArgumentException("bar"), false, false);
        });
    }

}