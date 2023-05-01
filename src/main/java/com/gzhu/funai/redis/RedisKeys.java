package com.gzhu.funai.redis;

/**
 * @Author: huangpenglong
 * @Date: 2023/3/17 15:21
 */
public class RedisKeys {

    /**
     * 用户验证码
     * register:code: [手机号]
     */
    public static final String USER_REGISTER_CODE = "register:code:%s";

    /**
     * 用户当前在聊天上的次数
     * chat:normal:limit: [用户ID]
     */
    public static final String USER_CHAT_DAILY_LIMIT = "chat:normal:limit:%s";

    /**
     * 用户当天文件上传的次数
     * chat:file:limit: [用户ID]
     */
    public static final String USER_FILE_UPLOAD_DAILY_LIMIT = "chat:file:limit:%s";

    private RedisKeys(){}
}
