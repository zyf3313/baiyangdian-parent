package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxAdPosition;
import com.baiyangdian.pojo.XxAdPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAdPositionMapper {
    int countByExample(XxAdPositionExample example);

    int deleteByExample(XxAdPositionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxAdPosition record);

    int insertSelective(XxAdPosition record);

    List<XxAdPosition> selectByExampleWithBLOBs(XxAdPositionExample example);

    List<XxAdPosition> selectByExample(XxAdPositionExample example);

    XxAdPosition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxAdPosition record, @Param("example") XxAdPositionExample example);

    int updateByExampleWithBLOBs(@Param("record") XxAdPosition record, @Param("example") XxAdPositionExample example);

    int updateByExample(@Param("record") XxAdPosition record, @Param("example") XxAdPositionExample example);

    int updateByPrimaryKeySelective(XxAdPosition record);

    int updateByPrimaryKeyWithBLOBs(XxAdPosition record);

    int updateByPrimaryKey(XxAdPosition record);
}