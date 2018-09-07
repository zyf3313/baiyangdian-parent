package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxReturns;
import com.baiyangdian.pojo.XxReturnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxReturnsMapper {
    int countByExample(XxReturnsExample example);

    int deleteByExample(XxReturnsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxReturns record);

    int insertSelective(XxReturns record);

    List<XxReturns> selectByExample(XxReturnsExample example);

    XxReturns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxReturns record, @Param("example") XxReturnsExample example);

    int updateByExample(@Param("record") XxReturns record, @Param("example") XxReturnsExample example);

    int updateByPrimaryKeySelective(XxReturns record);

    int updateByPrimaryKey(XxReturns record);
}