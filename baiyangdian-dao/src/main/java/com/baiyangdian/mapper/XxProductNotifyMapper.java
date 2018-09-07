package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxProductNotify;
import com.baiyangdian.pojo.XxProductNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxProductNotifyMapper {
    int countByExample(XxProductNotifyExample example);

    int deleteByExample(XxProductNotifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxProductNotify record);

    int insertSelective(XxProductNotify record);

    List<XxProductNotify> selectByExample(XxProductNotifyExample example);

    XxProductNotify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxProductNotify record, @Param("example") XxProductNotifyExample example);

    int updateByExample(@Param("record") XxProductNotify record, @Param("example") XxProductNotifyExample example);

    int updateByPrimaryKeySelective(XxProductNotify record);

    int updateByPrimaryKey(XxProductNotify record);
}