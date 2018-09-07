package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxDeliveryCenter;
import com.baiyangdian.pojo.XxDeliveryCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxDeliveryCenterMapper {
    int countByExample(XxDeliveryCenterExample example);

    int deleteByExample(XxDeliveryCenterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxDeliveryCenter record);

    int insertSelective(XxDeliveryCenter record);

    List<XxDeliveryCenter> selectByExample(XxDeliveryCenterExample example);

    XxDeliveryCenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxDeliveryCenter record, @Param("example") XxDeliveryCenterExample example);

    int updateByExample(@Param("record") XxDeliveryCenter record, @Param("example") XxDeliveryCenterExample example);

    int updateByPrimaryKeySelective(XxDeliveryCenter record);

    int updateByPrimaryKey(XxDeliveryCenter record);
}