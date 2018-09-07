package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxParameterGroup;
import com.baiyangdian.pojo.XxParameterGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxParameterGroupMapper {
    int countByExample(XxParameterGroupExample example);

    int deleteByExample(XxParameterGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxParameterGroup record);

    int insertSelective(XxParameterGroup record);

    List<XxParameterGroup> selectByExample(XxParameterGroupExample example);

    XxParameterGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxParameterGroup record, @Param("example") XxParameterGroupExample example);

    int updateByExample(@Param("record") XxParameterGroup record, @Param("example") XxParameterGroupExample example);

    int updateByPrimaryKeySelective(XxParameterGroup record);

    int updateByPrimaryKey(XxParameterGroup record);
}