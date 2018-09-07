package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPluginConfigAttribute;
import com.baiyangdian.pojo.XxPluginConfigAttributeExample;
import com.baiyangdian.pojo.XxPluginConfigAttributeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPluginConfigAttributeMapper {
    int countByExample(XxPluginConfigAttributeExample example);

    int deleteByExample(XxPluginConfigAttributeExample example);

    int deleteByPrimaryKey(XxPluginConfigAttributeKey key);

    int insert(XxPluginConfigAttribute record);

    int insertSelective(XxPluginConfigAttribute record);

    List<XxPluginConfigAttribute> selectByExample(XxPluginConfigAttributeExample example);

    XxPluginConfigAttribute selectByPrimaryKey(XxPluginConfigAttributeKey key);

    int updateByExampleSelective(@Param("record") XxPluginConfigAttribute record, @Param("example") XxPluginConfigAttributeExample example);

    int updateByExample(@Param("record") XxPluginConfigAttribute record, @Param("example") XxPluginConfigAttributeExample example);

    int updateByPrimaryKeySelective(XxPluginConfigAttribute record);

    int updateByPrimaryKey(XxPluginConfigAttribute record);
}