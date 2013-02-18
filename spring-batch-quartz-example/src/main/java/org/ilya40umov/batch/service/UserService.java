/*
 * Copyright 2013 the original author or authors.
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
package org.ilya40umov.batch.service;

import org.ilya40umov.batch.domain.User;

import java.util.List;

/**
 * @author ilya40umov
 */
public interface UserService
{
    List<User> findAllUsers();

    /**
     * returns sessionId
     */
    String login(String login);

    void logout(String sessionId);

    void goWalking(String sessionId);

    void goChatting(String sessionId);

    void goDancing(String sessionId);

    void goIdle(String sessionId);
}
