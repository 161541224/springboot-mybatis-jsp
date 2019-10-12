package com.t87.springboot.service;

import com.t87.springboot.pojo.ReplyDetail;

import java.util.List;

/**
 * 帖子回复
 */
public interface ReplyDetailService {

    /**
     * 查看回复
     */
    public List<ReplyDetail> getReplyDetails(Integer id);

    /**
     * 添加回复
     */
    public boolean saveReply(ReplyDetail replyDetail);

}
