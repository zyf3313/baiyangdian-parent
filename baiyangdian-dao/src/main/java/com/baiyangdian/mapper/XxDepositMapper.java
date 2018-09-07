package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxDeposit;
import com.baiyangdian.pojo.XxDepositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxDepositMapper {
    int countByExample(XxDepositExample example);

    int deleteByExample(XxDepositExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxDeposit record);

    int insertSelective(XxDeposit record);

    List<XxDeposit> selectByExample(XxDepositExample example);

    XxDeposit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxDeposit record, @Param("example") XxDepositExample example);

    int updateByExample(@Param("record") XxDeposit record, @Param("example") XxDepositExample example);

    int updateByPrimaryKeySelective(XxDeposit record);

    int updateByPrimaryKey(XxDeposit record);
}