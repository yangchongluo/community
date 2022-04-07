package com.nowcoder.community.dao.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


// 这里为什么是Repository
// 因为把elasticsearch看成是一个数据库
// Repository是Spring提供的针对数据访问层的注解，mapper是Mybatis特有的
@Repository
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost, Integer> {

}

// 需要定义泛型；<接口处理的实体类，实体类主键类型>