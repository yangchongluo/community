package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     * 分页查询帖子
     *
     * @param userId 查询ID
     * @param offset 开始索引
     * @param limit 一页多少条记录
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 查询用户的帖子
     * @Param注解用于给定参数取别名
     * 如果只有一个参数，并且在<if></if>里面使用，则必须加别名
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
