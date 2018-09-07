package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxRefunds;
import com.baiyangdian.pojo.XxRefundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxRefundsMapper {
    int countByExample(XxRefundsExample example);

    int deleteByExample(XxRefundsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxRefunds record);

    int insertSelective(XxRefunds record);

    List<XxRefunds> selectByExample(XxRefundsExample example);

    XxRefunds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxRefunds record, @Param("example") XxRefundsExample example);

    int updateByExample(@Param("record") XxRefunds record, @Param("example") XxRefundsExample example);

    int updateByPrimaryKeySelective(XxRefunds record);

    int updateByPrimaryKey(XxRefunds record);
}