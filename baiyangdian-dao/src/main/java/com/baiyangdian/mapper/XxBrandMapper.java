package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxBrand;
import com.baiyangdian.pojo.XxBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxBrandMapper {
    int countByExample(XxBrandExample example);

    int deleteByExample(XxBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxBrand record);

    int insertSelective(XxBrand record);

    List<XxBrand> selectByExampleWithBLOBs(XxBrandExample example);

    List<XxBrand> selectByExample(XxBrandExample example);

    XxBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxBrand record, @Param("example") XxBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") XxBrand record, @Param("example") XxBrandExample example);

    int updateByExample(@Param("record") XxBrand record, @Param("example") XxBrandExample example);

    int updateByPrimaryKeySelective(XxBrand record);

    int updateByPrimaryKeyWithBLOBs(XxBrand record);

    int updateByPrimaryKey(XxBrand record);
}