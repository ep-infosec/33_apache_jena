/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.atlas.web;

/** Authorization scheme */
public enum AuthScheme {
    BASIC,
    DIGEST,
    BEARER,
    UNKNOWN;

    public static String basicStr  = "Basic";
    public static String digestStr = "Digest";
    public static String bearerStr = "Bearer";

    public static AuthScheme scheme(String name) {
        if ( name == null )
            return null;
        name = name.toLowerCase();
        switch(name) {
            case "basic":   return BASIC;
            case "digest":  return DIGEST;
            case "bearer":  return BEARER;
            default:        return UNKNOWN;
        }
    }

    @Override
    public String toString() {
        switch(this) {
            case BASIC :    return basicStr;
            case DIGEST :   return digestStr;
            case BEARER :   return bearerStr;
            case UNKNOWN :  return "Unknown";
            default:        return null;
        }
    }
}
