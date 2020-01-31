package com.ruoyi.bar.service.impl;

import com.ruoyi.bar.mapper.MNewFloorMapper;
import com.ruoyi.bar.service.IMNewFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 帖子Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-28
 */
@Service
public class MNewFloorServiceImpl implements IMNewFloorService
{
    @Autowired
    private MNewFloorMapper mNewFloorMapper;

    @Override
    public Integer getAllActiveUserByMonth(Integer month, Integer year) {
        return mNewFloorMapper.getAllActiveUserByMonth(month,year);
    }

    @Override
    public List<Map> getAllActiveUserByMonthForList(Integer month, Integer year) {
        return mNewFloorMapper.getAllActiveUserByMonthForList(month,year);
    }
}
