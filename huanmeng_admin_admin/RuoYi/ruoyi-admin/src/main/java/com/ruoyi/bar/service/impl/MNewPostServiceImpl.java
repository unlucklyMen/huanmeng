package com.ruoyi.bar.service.impl;

import com.ruoyi.bar.mapper.MNewPostMapper;
import com.ruoyi.bar.service.IMNewPostService;
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
public class MNewPostServiceImpl implements IMNewPostService
{
    @Autowired
    private MNewPostMapper mNewPostMapper;


    @Override
    public Integer getMonthAllPostNum(Integer month,Integer year) {
        return mNewPostMapper.getMonthAllPostNum(month,year);
    }

    @Override
    public List<Map> getMonthByDayForList(Integer month, Integer year){
        return mNewPostMapper.getMonthByDayForList(month,year);
    }
}
