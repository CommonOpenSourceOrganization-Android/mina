/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.mina.statemachine.transition;

/**
 * {@link RuntimeException} equivalent of {@link java.lang.NoSuchMethodException}.
 * Thrown by the constructors in {@link MethodTransition} if no method by 
 * the specifed name can be found. 
 *
 * @author The Apache MINA Project (dev@mina.apache.org)
 * @version $Rev$, $Date$
 */
public class NoSuchMethodException extends RuntimeException {

    /**
     * Creates a new instance using the specified method name as message.
     * 
     * @param methodName the name of the method.
     */
    public NoSuchMethodException(String methodName) {
        super(methodName);
    }
    
}
