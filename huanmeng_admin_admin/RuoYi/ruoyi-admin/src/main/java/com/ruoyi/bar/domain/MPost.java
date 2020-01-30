package com.ruoyi.bar.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 帖子对象 m_post
 * 
 * @author ruoyi
 * @date 2020-01-28
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

    /** 帖子权限（1：所有人可见可评论，2：仅全吧会员可评论，3：仅全吧会员可见，4：仅本吧会员可评论，5：仅本吧会员可见） */
    @Excel(name = "帖子权限", readConverterExp = "1=：所有人可见可评论，2：仅全吧会员可评论，3：仅全吧会员可见，4：仅本吧会员可评论，5：仅本吧会员可见")
    private Integer postJurisdiction;

    /** 帖子状态（1：正常，2：封禁） */
    @Excel(name = "帖子状态", readConverterExp = "1=：正常，2：封禁")
    private Integer postFlag;

    /** 是否推荐（1：是，2：否） */
    @Excel(name = "是否推荐", readConverterExp = "1=：是，2：否")
    private Integer isRecommend;

    /** 是否贴吧精华贴（1：是，2：否） */
    @Excel(name = "是否贴吧精华贴", readConverterExp = "1=：是，2：否")
    private Integer isImportanceBar;

    /** 是否全吧精华贴（1：是，2：否） */
    @Excel(name = "是否全吧精华贴", readConverterExp = "1=：是，2：否")
    private Integer isImportanceAll;

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
    public void setPostJurisdiction(Integer postJurisdiction) 
    {
        this.postJurisdiction = postJurisdiction;
    }

    public Integer getPostJurisdiction() 
    {
        return postJurisdiction;
    }
    public void setPostFlag(Integer postFlag) 
    {
        this.postFlag = postFlag;
    }

    public Integer getPostFlag() 
    {
        return postFlag;
    }
    public void setIsRecommend(Integer isRecommend) 
    {
        this.isRecommend = isRecommend;
    }

    public Integer getIsRecommend() 
    {
        return isRecommend;
    }
    public void setIsImportanceBar(Integer isImportanceBar) 
    {
        this.isImportanceBar = isImportanceBar;
    }

    public Integer getIsImportanceBar() 
    {
        return isImportanceBar;
    }
    public void setIsImportanceAll(Integer isImportanceAll) 
    {
        this.isImportanceAll = isImportanceAll;
    }

    public Integer getIsImportanceAll() 
    {
        return isImportanceAll;
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
            .append("postFlag", getPostFlag())
            .append("isRecommend", getIsRecommend())
            .append("isImportanceBar", getIsImportanceBar())
            .append("isImportanceAll", getIsImportanceAll())
            .toString();
    }
}
