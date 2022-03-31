package com.nowcoder.community.util;

public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity"; // 前缀

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


}
