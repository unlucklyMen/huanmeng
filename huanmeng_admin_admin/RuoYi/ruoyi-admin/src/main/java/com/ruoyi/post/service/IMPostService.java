package com.ruoyi.post.service;

import com.ruoyi.post.domain.MPost;
import java.util.List;

/**
 * 帖子Service接口
 * 
 * @author ruoyi
 * @date 2020-01-23
 */
public interface IMPostService 
{
    /**
     * 查询帖子
     * 
     * @param postId 帖子ID
     * @return 帖子
     */
    public MPost selectMPostById(Long postId);

    /**
     * 查询帖子列表
     * 
     * @param mPost 帖子
     * @return 帖子集合
     */
    public List<MPost> selectMPostList(MPost mPost);

    /**
     * 新增帖子
     * 
     * @param mPost 帖子
     * @return 结果
     */
    public int insertMPost(MPost mPost);

    /**
     * 修改帖子
     * 
     * @param mPost 帖子
     * @return 结果
     */
    public int updateMPost(MPost mPost);

    /**
     * 批量删除帖子
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMPostByIds(String ids);

    /**
     * 删除帖子信息
     * 
     * @param postId 帖子ID
     * @return 结果
     */
    public int deleteMPostById(Long postId);

    /**
     * 查询输入月份的新帖子数量
     * @param month 月份
     * @return 新帖子数量
     */
    public int selectPostNumByMonth(Integer month);
}
