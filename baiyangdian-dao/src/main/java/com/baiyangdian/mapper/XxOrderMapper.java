package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxOrder;
import com.baiyangdian.pojo.XxOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxOrderMapper {
    int countByExample(XxOrderExample example);

    int deleteByExample(XxOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxOrder record);

    int insertSelective(XxOrder record);

    List<XxOrder> selectByExample(XxOrderExample example);

    XxOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxOrder record, @Param("example") XxOrderExample example);

    int updateByExample(@Param("record") XxOrder record, @Param("example") XxOrderExample example);

    int updateByPrimaryKeySelective(XxOrder record);

    int updateByPrimaryKey(XxOrder record);
}