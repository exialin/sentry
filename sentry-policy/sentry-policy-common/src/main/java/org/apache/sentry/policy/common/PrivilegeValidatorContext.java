/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sentry.policy.common;

import javax.annotation.Nullable;

// 保存验证权限时需要的上下文信息，即数据库名和权限
public class PrivilegeValidatorContext {
  private final String database;
  private final String privilege;
  public PrivilegeValidatorContext(String privilege) {
    this(null, privilege);
  }
  public PrivilegeValidatorContext(@Nullable String database, String privilege) {
    super();
    this.database = database;
    this.privilege = privilege;
  }
  public @Nullable String getDatabase() {
    return database;
  }
  public String getPrivilege() {
    return privilege;
  }
}
