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

package org.apache.jena.sparql.service;

import org.apache.jena.sparql.engine.QueryIterator;
import org.apache.jena.sparql.engine.main.iterator.QueryIterService;
import org.apache.jena.sparql.service.single.ServiceExecutor;

/**
 * Execution of a SERVICE clause in the context of {@link QueryIterService} applying an input binding.s
 * @see ServiceExecutor
 * @see ServiceExecutorRegistry
 *
 * @deprecated Deprecated in favor of QueryIterators that initialize lazily
 */
@Deprecated(since = "4.6.0")
public interface ServiceExecution {
    public QueryIterator exec();
}
