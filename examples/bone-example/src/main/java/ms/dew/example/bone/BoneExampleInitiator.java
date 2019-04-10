/*
 * Copyright 2019. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ms.dew.example.bone;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 在根路径创建用于初始化数据/行为的类
 * <p>
 * 减少滥用PostConstruct造成的不可控因素
 */
@Component
public class BoneExampleInitiator {

    private static final Logger logger = LoggerFactory.getLogger(BoneExampleInitiator.class);

    @Autowired
    private BoneExampleConfig boneExampleConfig;

    @PostConstruct
    public void init() {
        // 在这里初始化
        logger.info(">>>> " + boneExampleConfig.getSomeProp());

    }

}