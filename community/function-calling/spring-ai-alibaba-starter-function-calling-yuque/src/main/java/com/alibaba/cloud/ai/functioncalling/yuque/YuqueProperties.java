/*
 * Copyright 2024-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.functioncalling.yuque;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 北极星
 */
@ConfigurationProperties(prefix = "spring.ai.alibaba.functioncalling.yuque")
public class YuqueProperties {

    public static String BASE_URL = "https://www.yuque.com/api/v2/repo";

    private String authToken;

    public String getAuthToken () {
        return authToken;
    }

    public YuqueProperties setAuthToken (String authToken) {
        this.authToken = authToken;
        return this;
    }
}