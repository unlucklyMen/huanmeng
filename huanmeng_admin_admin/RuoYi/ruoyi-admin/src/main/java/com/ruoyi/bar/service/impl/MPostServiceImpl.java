package com.ruoyi.bar.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bar.mapper.MPostMapper;
import com.ruoyi.bar.domain.MPost;
import com.ruoyi.bar.service.IMPostService;
import com.ruoyi.common.core.text.Convert;

/**
 * 帖子Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-28
 */
@Service
public class MPostServiceImpl implements IMPostService 
{
    @Autowired
    private MPostMapper mPostMapper;

    /**
     * 查询帖子
     * 
     * @param postId 帖子ID
     * @return 帖子
     */
    @Override
    public MPost selectMPostById(Long postId)
    {
        return mPostMapper.selectMPostById(postId);
    }

    /**
     * 查询帖子列表
     * 
     * @param mPost 帖子
     * @return 帖子
     */
    @Override
    public List<MPost> selectMPostList(MPost mPost)
    {
        return mPostMapper.selectMPostList(mPost);
    }

    /**
     * 新增帖子
     * 
     * @param mPost 帖子
     * @return 结果
     */
    @Override
    public int insertMPost(MPost mPost)
    {
        return mPostMapper.insertMPost(mPost);
    }

    /**
     * 修改帖子
     * 
     * @param mPost 帖子
     * @return 结果
     */
    @Override
    public int updateMPost(MPost mPost)
    {
        return mPostMapper.updateMPost(mPost);
    }

    /**
     * 删除帖子对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMPostByIds(String ids)
    {
        return mPostMapper.deleteMPostByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除帖子信息
     * 
     * @param postId 帖子ID
     * @return 结果
     */
    @Override
    public int deleteMPostById(Long postId)
    {
        return mPostMapper.deleteMPostById(postId);
    }
}
