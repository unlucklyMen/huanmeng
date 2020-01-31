package com.ruoyi.bar.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 楼层Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-28
 */
public interface MNewFloorMapper
{
    /**
     * 获取输入月份的活跃人数
     * @param month 需要获取活跃人数的月份
     * @param year 定位月份的年份
     * @return 输入月份的活跃人数
     */
    public Integer getAllActiveUserByMonth(@Param("month")Integer month, @Param("year")Integer year);

    /**
     * 获取输入月份的活跃人数（按日期分组）
     * @param month 需要获取活跃人数的月份
     * @param year 定位月份的年份
     * @return 输入月份的活跃人数按日期分组
     */
    public List<Map> getAllActiveUserByMonthForList(@Param("month")Integer month, @Param("year")Integer year);

}
