package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxShipping;
import com.baiyangdian.pojo.XxShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxShippingMapper {
    int countByExample(XxShippingExample example);

    int deleteByExample(XxShippingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxShipping record);

    int insertSelective(XxShipping record);

    List<XxShipping> selectByExample(XxShippingExample example);

    XxShipping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxShipping record, @Param("example") XxShippingExample example);

    int updateByExample(@Param("record") XxShipping record, @Param("example") XxShippingExample example);

    int updateByPrimaryKeySelective(XxShipping record);

    int updateByPrimaryKey(XxShipping record);
}