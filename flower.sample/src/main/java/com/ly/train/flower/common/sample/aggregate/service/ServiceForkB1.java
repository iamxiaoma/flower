/**
 * Copyright © 2019 同程艺龙 (zhihui.li@ly.com)
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
package com.ly.train.flower.common.sample.aggregate.service;

import com.ly.train.flower.common.annotation.FlowerService;
import com.ly.train.flower.core.service.Service;
import com.ly.train.flower.core.service.container.ServiceContext;

/**
 * @author: fengyu.zhang
 */
@FlowerService
public class ServiceForkB1 implements Service<Integer, Integer> {
  // @Autowired
  // private FlowerFactory flowerFactory;
  @Override
  public Integer process(Integer message, ServiceContext context) throws Throwable {
    // ServiceMeta serviceMeta =
    // flowerFactory.getServiceFactory().getServiceLoader().loadServiceMeta("ServiceForkA1");
    // ClassLoader classLoader = this.getClass().getClassLoader();
    // Class<?> serviceClass =
    // classLoader.loadClass(serviceMeta.getServiceClassName());
    // String param = serviceMeta.getConfig(1);
    // ServiceForkA1 forkA1 = null;
    // if (param != null) {
    // Constructor<?> constructor = serviceClass.getConstructor(String.class);
    // forkA1 = (ServiceForkA1) constructor.newInstance(param);
    // } else {
    // forkA1 = (ServiceForkA1) serviceClass.newInstance();
    // }
    Integer result = message + 1;
    System.out.println("ForkB1:已处理,结果:" + result);
    return result;
  }
}
