package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxOrderItem;
import com.baiyangdian.pojo.XxOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxOrderItemMapper {
    int countByExample(XxOrderItemExample example);

    int deleteByExample(XxOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxOrderItem record);

    int insertSelective(XxOrderItem record);

    List<XxOrderItem> selectByExample(XxOrderItemExample example);

    XxOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxOrderItem record, @Param("example") XxOrderItemExample example);

    int updateByExample(@Param("record") XxOrderItem record, @Param("example") XxOrderItemExample example);

    int updateByPrimaryKeySelective(XxOrderItem record);

    int updateByPrimaryKey(XxOrderItem record);
}