package com.ruoyi.bar.service;

import java.util.List;
import java.util.Map;

/**
 * 帖子Service接口
 * 
 * @author ruoyi
 * @date 2020-01-28
 */
public interface IMNewPostService
{
    /**
     * 获取输入月份的新帖子总数
     * @param month
     * @return
     */
    public Integer getMonthAllPostNum(Integer month,Integer year);

    /**
     * 获取当月每天的新贴数
     * @param month
     * @param year
     * @return
     */
    public List<Map> getMonthByDayForList(Integer month, Integer year);
}
