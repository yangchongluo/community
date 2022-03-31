package com.nowcoder.community.util;

public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity"; // 前缀
    private static final String PREFIX_USER_LIKE = "like:user";

    /**
     * 某个实体的赞
     *
     * @param entityType 实体类型 评论 ？帖子
     * @param entityId   实体id
     * @return redisKey                   -> redisValue
     * like:entity:entityType:entityId -> set(userId)  谁给实体点赞了 ，就存到set中
     */
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENTITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }

    /**
     * 某个用户的赞
     * @param userId
     * @return
     * like:user:userId -> int
     */
    public static String getUserLikeKey(int userId) {
        return PREFIX_USER_LIKE + SPLIT + userId;
    }


}
