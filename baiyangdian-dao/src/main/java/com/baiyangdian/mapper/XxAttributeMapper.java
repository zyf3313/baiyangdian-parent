package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxAttribute;
import com.baiyangdian.pojo.XxAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAttributeMapper {
    int countByExample(XxAttributeExample example);

    int deleteByExample(XxAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxAttribute record);

    int insertSelective(XxAttribute record);

    List<XxAttribute> selectByExample(XxAttributeExample example);

    XxAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxAttribute record, @Param("example") XxAttributeExample example);

    int updateByExample(@Param("record") XxAttribute record, @Param("example") XxAttributeExample example);

    int updateByPrimaryKeySelective(XxAttribute record);

    int updateByPrimaryKey(XxAttribute record);
}