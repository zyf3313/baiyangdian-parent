package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPluginConfig;
import com.baiyangdian.pojo.XxPluginConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPluginConfigMapper {
    int countByExample(XxPluginConfigExample example);

    int deleteByExample(XxPluginConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxPluginConfig record);

    int insertSelective(XxPluginConfig record);

    List<XxPluginConfig> selectByExample(XxPluginConfigExample example);

    XxPluginConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxPluginConfig record, @Param("example") XxPluginConfigExample example);

    int updateByExample(@Param("record") XxPluginConfig record, @Param("example") XxPluginConfigExample example);

    int updateByPrimaryKeySelective(XxPluginConfig record);

    int updateByPrimaryKey(XxPluginConfig record);
}