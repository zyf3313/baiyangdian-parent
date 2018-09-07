package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxArea;
import com.baiyangdian.pojo.XxAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAreaMapper {
    int countByExample(XxAreaExample example);

    int deleteByExample(XxAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxArea record);

    int insertSelective(XxArea record);

    List<XxArea> selectByExampleWithBLOBs(XxAreaExample example);

    List<XxArea> selectByExample(XxAreaExample example);

    XxArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxArea record, @Param("example") XxAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") XxArea record, @Param("example") XxAreaExample example);

    int updateByExample(@Param("record") XxArea record, @Param("example") XxAreaExample example);

    int updateByPrimaryKeySelective(XxArea record);

    int updateByPrimaryKeyWithBLOBs(XxArea record);

    int updateByPrimaryKey(XxArea record);
}