package com.baiyangdian.show.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.container.page.PageHandler;
import com.baiyangdian.entity.PageResult;
import com.baiyangdian.mapper.XxAdMapper;
import com.baiyangdian.pojo.XxAd;
import com.baiyangdian.show.service.ShowService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @创建人 yangfan zhang
 * @创建时间 2018/9/10 10:15
 * @描述
 */
@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    private XxAdMapper adMapper;


    @Override
    public List test() {
        PageHelper.startPage(1,10);
        Page<XxAd> p = (Page<XxAd>) adMapper.selectByExample(null);
        return p.getResult();
    }
}
