package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxSn;
import com.baiyangdian.pojo.XxSnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxSnMapper {
    int countByExample(XxSnExample example);

    int deleteByExample(XxSnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxSn record);

    int insertSelective(XxSn record);

    List<XxSn> selectByExample(XxSnExample example);

    XxSn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxSn record, @Param("example") XxSnExample example);

    int updateByExample(@Param("record") XxSn record, @Param("example") XxSnExample example);

    int updateByPrimaryKeySelective(XxSn record);

    int updateByPrimaryKey(XxSn record);
}