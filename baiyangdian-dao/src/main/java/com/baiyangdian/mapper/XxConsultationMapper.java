package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxConsultation;
import com.baiyangdian.pojo.XxConsultationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxConsultationMapper {
    int countByExample(XxConsultationExample example);

    int deleteByExample(XxConsultationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxConsultation record);

    int insertSelective(XxConsultation record);

    List<XxConsultation> selectByExample(XxConsultationExample example);

    XxConsultation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxConsultation record, @Param("example") XxConsultationExample example);

    int updateByExample(@Param("record") XxConsultation record, @Param("example") XxConsultationExample example);

    int updateByPrimaryKeySelective(XxConsultation record);

    int updateByPrimaryKey(XxConsultation record);
}