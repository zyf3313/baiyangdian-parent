package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxSpecificationValue;
import com.baiyangdian.pojo.XxSpecificationValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxSpecificationValueMapper {
    int countByExample(XxSpecificationValueExample example);

    int deleteByExample(XxSpecificationValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxSpecificationValue record);

    int insertSelective(XxSpecificationValue record);

    List<XxSpecificationValue> selectByExample(XxSpecificationValueExample example);

    XxSpecificationValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxSpecificationValue record, @Param("example") XxSpecificationValueExample example);

    int updateByExample(@Param("record") XxSpecificationValue record, @Param("example") XxSpecificationValueExample example);

    int updateByPrimaryKeySelective(XxSpecificationValue record);

    int updateByPrimaryKey(XxSpecificationValue record);
}