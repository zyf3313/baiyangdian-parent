package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxMessage;
import com.baiyangdian.pojo.XxMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxMessageMapper {
    int countByExample(XxMessageExample example);

    int deleteByExample(XxMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxMessage record);

    int insertSelective(XxMessage record);

    List<XxMessage> selectByExampleWithBLOBs(XxMessageExample example);

    List<XxMessage> selectByExample(XxMessageExample example);

    XxMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxMessage record, @Param("example") XxMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") XxMessage record, @Param("example") XxMessageExample example);

    int updateByExample(@Param("record") XxMessage record, @Param("example") XxMessageExample example);

    int updateByPrimaryKeySelective(XxMessage record);

    int updateByPrimaryKeyWithBLOBs(XxMessage record);

    int updateByPrimaryKey(XxMessage record);
}