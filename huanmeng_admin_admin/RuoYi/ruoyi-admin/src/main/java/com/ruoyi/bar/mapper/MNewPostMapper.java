package com.ruoyi.bar.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 帖子Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-28
 */
public interface MNewPostMapper
{
    /**
     * 获取输入月份的新帖子总数
     * @param month
     * @return
     */
    public Integer getMonthAllPostNum(@Param("month")Integer month, @Param("year")Integer year);

    /**
     * 获取当月每天的新贴数
     * @param month
     * @param year
     * @return
     */
    public List<Map> getMonthByDayForList(@Param("month")Integer month, @Param("year")Integer year);
}
