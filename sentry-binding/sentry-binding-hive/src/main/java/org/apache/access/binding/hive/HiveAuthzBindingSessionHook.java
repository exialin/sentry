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
package org.apache.access.binding.hive;

import org.apache.hive.service.cli.HiveSQLException;
import org.apache.hive.service.cli.session.HiveSessionHookContext;

/**
 * The session hook wrapper for backward compatibility
 * 为了兼容性，封装org.apache.sentry.binding.hive.HiveAuthzBindingSessionHook
 */
public class HiveAuthzBindingSessionHook
    implements org.apache.hive.service.cli.session.HiveSessionHook {

  private org.apache.sentry.binding.hive.HiveAuthzBindingSessionHook underlyingHook;
  public HiveAuthzBindingSessionHook() {
    underlyingHook = new org.apache.sentry.binding.hive.HiveAuthzBindingSessionHook();
  }
  @Override
  public void run(HiveSessionHookContext sessionHookContext) throws HiveSQLException {
    underlyingHook.run(sessionHookContext);
  }

}
