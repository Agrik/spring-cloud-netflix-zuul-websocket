/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.mthizo247.cloud.netflix.zuul.web.run;

import com.github.mthizo247.cloud.netflix.zuul.web.socket.ZuulWebSocketProperties;

import java.net.URI;

/**
 * Strategy to resolve zuul proxy target
 *
 * @author Ronald Mthombeni
 * @author Salman Noor
 */
public interface ProxyTargetResolver {
    URI resolveTarget(ZuulWebSocketProperties.WsBrokerage wsBrokerage);
}