package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxCart;
import com.baiyangdian.pojo.XxCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxCartMapper {
    int countByExample(XxCartExample example);

    int deleteByExample(XxCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxCart record);

    int insertSelective(XxCart record);

    List<XxCart> selectByExample(XxCartExample example);

    XxCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxCart record, @Param("example") XxCartExample example);

    int updateByExample(@Param("record") XxCart record, @Param("example") XxCartExample example);

    int updateByPrimaryKeySelective(XxCart record);

    int updateByPrimaryKey(XxCart record);
}