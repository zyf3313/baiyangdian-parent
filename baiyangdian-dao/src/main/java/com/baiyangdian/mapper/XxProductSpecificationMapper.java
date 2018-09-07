package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxProductSpecificationExample;
import com.baiyangdian.pojo.XxProductSpecificationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxProductSpecificationMapper {
    int countByExample(XxProductSpecificationExample example);

    int deleteByExample(XxProductSpecificationExample example);

    int deleteByPrimaryKey(XxProductSpecificationKey key);

    int insert(XxProductSpecificationKey record);

    int insertSelective(XxProductSpecificationKey record);

    List<XxProductSpecificationKey> selectByExample(XxProductSpecificationExample example);

    int updateByExampleSelective(@Param("record") XxProductSpecificationKey record, @Param("example") XxProductSpecificationExample example);

    int updateByExample(@Param("record") XxProductSpecificationKey record, @Param("example") XxProductSpecificationExample example);
}