package com.ruoyi.bar.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 楼层对象 m_floor
 * 
 * @author ruoyi
 * @date 2020-01-31
 */
public class MFloor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long floorId;

    /** 楼层相关用户 */
    @Excel(name = "楼层相关用户")
    private Long floorUser;

    /** 楼层内容 */
    @Excel(name = "楼层内容")
    private String floorText;

    /** 楼层归属帖子表 */
    @Excel(name = "楼层归属帖子表")
    private Long floorPost;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 楼层状态（1：正常，2：删除） */
    @Excel(name = "楼层状态", readConverterExp = "1=：正常，2：删除")
    private Integer floorFlag;

    /** 楼中楼回复的用户id */
    @Excel(name = "楼中楼回复的用户id")
    private Long floorFloorUserId;

    /** 楼中楼关联楼层id */
    @Excel(name = "楼中楼关联楼层id")
    private Long floorFloorId;

    /** 楼层状态（1：普通楼层，2：楼中楼） */
    @Excel(name = "楼层状态", readConverterExp = "1=：普通楼层，2：楼中楼")
    private Integer floorIndex;

    public void setFloorId(Long floorId) 
    {
        this.floorId = floorId;
    }

    public Long getFloorId() 
    {
        return floorId;
    }
    public void setFloorUser(Long floorUser) 
    {
        this.floorUser = floorUser;
    }

    public Long getFloorUser() 
    {
        return floorUser;
    }
    public void setFloorText(String floorText) 
    {
        this.floorText = floorText;
    }

    public String getFloorText() 
    {
        return floorText;
    }
    public void setFloorPost(Long floorPost) 
    {
        this.floorPost = floorPost;
    }

    public Long getFloorPost() 
    {
        return floorPost;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setFloorFlag(Integer floorFlag) 
    {
        this.floorFlag = floorFlag;
    }

    public Integer getFloorFlag() 
    {
        return floorFlag;
    }
    public void setFloorFloorUserId(Long floorFloorUserId) 
    {
        this.floorFloorUserId = floorFloorUserId;
    }

    public Long getFloorFloorUserId() 
    {
        return floorFloorUserId;
    }
    public void setFloorFloorId(Long floorFloorId) 
    {
        this.floorFloorId = floorFloorId;
    }

    public Long getFloorFloorId() 
    {
        return floorFloorId;
    }
    public void setFloorIndex(Integer floorIndex) 
    {
        this.floorIndex = floorIndex;
    }

    public Integer getFloorIndex() 
    {
        return floorIndex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("floorId", getFloorId())
            .append("floorUser", getFloorUser())
            .append("floorText", getFloorText())
            .append("floorPost", getFloorPost())
            .append("creatTime", getCreatTime())
            .append("floorFlag", getFloorFlag())
            .append("floorFloorUserId", getFloorFloorUserId())
            .append("floorFloorId", getFloorFloorId())
            .append("floorIndex", getFloorIndex())
            .toString();
    }
}
