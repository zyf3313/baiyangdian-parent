package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxProductSpecificationValueExample;
import com.baiyangdian.pojo.XxProductSpecificationValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxProductSpecificationValueMapper {
    int countByExample(XxProductSpecificationValueExample example);

    int deleteByExample(XxProductSpecificationValueExample example);

    int deleteByPrimaryKey(XxProductSpecificationValueKey key);

    int insert(XxProductSpecificationValueKey record);

    int insertSelective(XxProductSpecificationValueKey record);

    List<XxProductSpecificationValueKey> selectByExample(XxProductSpecificationValueExample example);

    int updateByExampleSelective(@Param("record") XxProductSpecificationValueKey record, @Param("example") XxProductSpecificationValueExample example);

    int updateByExample(@Param("record") XxProductSpecificationValueKey record, @Param("example") XxProductSpecificationValueExample example);
}