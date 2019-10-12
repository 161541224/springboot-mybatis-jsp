package com.t87.springboot.mapper;

import com.t87.springboot.pojo.ReplyDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 帖子回复
 */
//@Mapper
public interface ReplyDetailMapper {

    /**
     * 查看回复
     */
    public List<ReplyDetail> getReplyDetails(@Param("id") Integer id);

    /**
     * 添加回复
     */
    public int saveReply(ReplyDetail replyDetail);

    /**
     * 删除回复
     */
    public int deleteReplyDetail(@Param("id") Integer id);

}
