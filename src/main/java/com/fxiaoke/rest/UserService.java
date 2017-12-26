package com.fxiaoke.rest;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    /**
     * 初始化四个用户
     */
   private static Map<Integer, Object> map = new HashMap<>();

    static {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        map.put(1, user1);
        map.put(2, user2);
        map.put(3, user3);
        map.put(4, user4);
    }
}
