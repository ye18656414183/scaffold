/*
 * Copyright 2019 Yangkai.Shen
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.xkcoding.scaffold.notification.config;

import com.xkcoding.scaffold.notification.props.DingTalkProperties;
import com.xkcoding.scaffold.notification.props.EmailProperties;
import com.xkcoding.scaffold.notification.props.SmsAliyunProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 通知自动装配
 * </p>
 *
 * @package: com.xkcoding.scaffold.notification.config
 * @description: 通知自动装配
 * @author: yangkai.shen
 * @date: Created in 2019-03-18 14:15
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Configuration
@EnableConfigurationProperties({DingTalkProperties.class, SmsAliyunProperties.class, EmailProperties.class})
public class ScaffoldNotificationAutoConfiguration {
}
