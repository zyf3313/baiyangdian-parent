package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPayment;
import com.baiyangdian.pojo.XxPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPaymentMapper {
    int countByExample(XxPaymentExample example);

    int deleteByExample(XxPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxPayment record);

    int insertSelective(XxPayment record);

    List<XxPayment> selectByExample(XxPaymentExample example);

    XxPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxPayment record, @Param("example") XxPaymentExample example);

    int updateByExample(@Param("record") XxPayment record, @Param("example") XxPaymentExample example);

    int updateByPrimaryKeySelective(XxPayment record);

    int updateByPrimaryKey(XxPayment record);
}