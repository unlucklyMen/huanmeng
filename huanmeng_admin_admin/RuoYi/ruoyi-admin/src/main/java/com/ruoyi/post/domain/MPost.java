package com.ruoyi.post.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 帖子对象 m_post
 * 
 * @author ruoyi
 * @date 2020-01-23
 */
public class MPost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long postId;

    /** 发帖人id */
    @Excel(name = "发帖人id")
    private Long postUserIs;

    /** 帖子标题 */
    @Excel(name = "帖子标题")
    private String postSpan;

    /** 正文 */
    @Excel(name = "正文")
    private String postText;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 归属贴吧id */
    @Excel(name = "归属贴吧id")
    private Long barId;

    /** 帖子权限 */
    @Excel(name = "帖子权限")
    private Long postJurisdiction;

    public void setPostId(Long postId) 
    {
        this.postId = postId;
    }

    public Long getPostId() 
    {
        return postId;
    }
    public void setPostUserIs(Long postUserIs) 
    {
        this.postUserIs = postUserIs;
    }

    public Long getPostUserIs() 
    {
        return postUserIs;
    }
    public void setPostSpan(String postSpan) 
    {
        this.postSpan = postSpan;
    }

    public String getPostSpan() 
    {
        return postSpan;
    }
    public void setPostText(String postText) 
    {
        this.postText = postText;
    }

    public String getPostText() 
    {
        return postText;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setBarId(Long barId) 
    {
        this.barId = barId;
    }

    public Long getBarId() 
    {
        return barId;
    }
    public void setPostJurisdiction(Long postJurisdiction) 
    {
        this.postJurisdiction = postJurisdiction;
    }

    public Long getPostJurisdiction() 
    {
        return postJurisdiction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("postId", getPostId())
            .append("postUserIs", getPostUserIs())
            .append("postSpan", getPostSpan())
            .append("postText", getPostText())
            .append("creatTime", getCreatTime())
            .append("barId", getBarId())
            .append("postJurisdiction", getPostJurisdiction())
            .toString();
    }
}
