package com.ruoyi.post.mapper;

import com.ruoyi.post.domain.MPost;
import java.util.List;

/**
 * 帖子Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-23
 */
public interface MPostMapper 
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
     * 删除帖子
     * 
     * @param postId 帖子ID
     * @return 结果
     */
    public int deleteMPostById(Long postId);

    /**
     * 批量删除帖子
     * 
     * @param postIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMPostByIds(String[] postIds);
}
