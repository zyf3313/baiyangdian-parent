package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxAd;
import com.baiyangdian.pojo.XxAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAdMapper {
    int countByExample(XxAdExample example);

    int deleteByExample(XxAdExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxAd record);

    int insertSelective(XxAd record);

    List<XxAd> selectByExampleWithBLOBs(XxAdExample example);

    List<XxAd> selectByExample(XxAdExample example);

    XxAd selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxAd record, @Param("example") XxAdExample example);

    int updateByExampleWithBLOBs(@Param("record") XxAd record, @Param("example") XxAdExample example);

    int updateByExample(@Param("record") XxAd record, @Param("example") XxAdExample example);

    int updateByPrimaryKeySelective(XxAd record);

    int updateByPrimaryKeyWithBLOBs(XxAd record);

    int updateByPrimaryKey(XxAd record);
}