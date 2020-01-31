package com.ruoyi.bar.service;

import java.util.List;
import java.util.Map;

/**
 * 楼层Service接口
 * 
 * @author ruoyi
 * @date 2020-01-28
 */
public interface IMNewFloorService
{
    /**
     * 获取输入月份的活跃人数
     * @param month 需要获取活跃人数的月份
     * @param year 定位月份的年份
     * @return 输入月份的活跃人数
     */
    public Integer getAllActiveUserByMonth(Integer month, Integer year);

    /**
     * 获取输入月份的活跃人数（按日期分组）
     * @param month 需要获取活跃人数的月份
     * @param year 定位月份的年份
     * @return 输入月份的活跃人数按日期分组
     */
    public List<Map> getAllActiveUserByMonthForList(Integer month, Integer year);
}
