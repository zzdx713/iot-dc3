/*
 * Copyright 2019 Pnoker. All Rights Reserved.
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

package com.github.pnoker.center.manager.service;

import com.github.pnoker.common.base.Service;
import com.github.pnoker.common.dto.DriverDto;
import com.github.pnoker.common.model.Driver;

/**
 * <p>Driver Interface
 *
 * @author pnoker
 */
public interface DriverService extends Service<Driver, DriverDto> {
    /**
     * 根据驱动 SERVICE NAME 查询
     *
     * @param serviceName
     * @return
     */
    Driver selectByServiceName(String serviceName);

    /**
     * 根据驱动 HOST & PORT 查询
     *
     * @param host
     * @param port
     * @return
     */
    Driver selectByHostPort(String host, Integer port);
}
