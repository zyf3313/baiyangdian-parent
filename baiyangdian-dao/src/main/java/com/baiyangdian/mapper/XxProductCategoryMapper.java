package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxProductCategory;
import com.baiyangdian.pojo.XxProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxProductCategoryMapper {
    int countByExample(XxProductCategoryExample example);

    int deleteByExample(XxProductCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxProductCategory record);

    int insertSelective(XxProductCategory record);

    List<XxProductCategory> selectByExample(XxProductCategoryExample example);

    XxProductCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxProductCategory record, @Param("example") XxProductCategoryExample example);

    int updateByExample(@Param("record") XxProductCategory record, @Param("example") XxProductCategoryExample example);

    int updateByPrimaryKeySelective(XxProductCategory record);

    int updateByPrimaryKey(XxProductCategory record);
}