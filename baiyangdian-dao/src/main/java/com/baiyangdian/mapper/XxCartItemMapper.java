package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxCartItem;
import com.baiyangdian.pojo.XxCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxCartItemMapper {
    int countByExample(XxCartItemExample example);

    int deleteByExample(XxCartItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxCartItem record);

    int insertSelective(XxCartItem record);

    List<XxCartItem> selectByExample(XxCartItemExample example);

    XxCartItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxCartItem record, @Param("example") XxCartItemExample example);

    int updateByExample(@Param("record") XxCartItem record, @Param("example") XxCartItemExample example);

    int updateByPrimaryKeySelective(XxCartItem record);

    int updateByPrimaryKey(XxCartItem record);
}