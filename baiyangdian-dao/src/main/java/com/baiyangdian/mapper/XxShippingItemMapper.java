package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxShippingItem;
import com.baiyangdian.pojo.XxShippingItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxShippingItemMapper {
    int countByExample(XxShippingItemExample example);

    int deleteByExample(XxShippingItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxShippingItem record);

    int insertSelective(XxShippingItem record);

    List<XxShippingItem> selectByExample(XxShippingItemExample example);

    XxShippingItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxShippingItem record, @Param("example") XxShippingItemExample example);

    int updateByExample(@Param("record") XxShippingItem record, @Param("example") XxShippingItemExample example);

    int updateByPrimaryKeySelective(XxShippingItem record);

    int updateByPrimaryKey(XxShippingItem record);
}