package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxLog;
import com.baiyangdian.pojo.XxLogExample;
import com.baiyangdian.pojo.XxLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxLogMapper {
    int countByExample(XxLogExample example);

    int deleteByExample(XxLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxLogWithBLOBs record);

    int insertSelective(XxLogWithBLOBs record);

    List<XxLogWithBLOBs> selectByExampleWithBLOBs(XxLogExample example);

    List<XxLog> selectByExample(XxLogExample example);

    XxLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxLogWithBLOBs record, @Param("example") XxLogExample example);

    int updateByExampleWithBLOBs(@Param("record") XxLogWithBLOBs record, @Param("example") XxLogExample example);

    int updateByExample(@Param("record") XxLog record, @Param("example") XxLogExample example);

    int updateByPrimaryKeySelective(XxLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(XxLogWithBLOBs record);

    int updateByPrimaryKey(XxLog record);
}