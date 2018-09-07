package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPaymentShippingMethodExample;
import com.baiyangdian.pojo.XxPaymentShippingMethodKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPaymentShippingMethodMapper {
    int countByExample(XxPaymentShippingMethodExample example);

    int deleteByExample(XxPaymentShippingMethodExample example);

    int deleteByPrimaryKey(XxPaymentShippingMethodKey key);

    int insert(XxPaymentShippingMethodKey record);

    int insertSelective(XxPaymentShippingMethodKey record);

    List<XxPaymentShippingMethodKey> selectByExample(XxPaymentShippingMethodExample example);

    int updateByExampleSelective(@Param("record") XxPaymentShippingMethodKey record, @Param("example") XxPaymentShippingMethodExample example);

    int updateByExample(@Param("record") XxPaymentShippingMethodKey record, @Param("example") XxPaymentShippingMethodExample example);
}