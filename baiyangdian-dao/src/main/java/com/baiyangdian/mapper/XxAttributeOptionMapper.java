package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxAttributeOption;
import com.baiyangdian.pojo.XxAttributeOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAttributeOptionMapper {
    int countByExample(XxAttributeOptionExample example);

    int deleteByExample(XxAttributeOptionExample example);

    int insert(XxAttributeOption record);

    int insertSelective(XxAttributeOption record);

    List<XxAttributeOption> selectByExample(XxAttributeOptionExample example);

    int updateByExampleSelective(@Param("record") XxAttributeOption record, @Param("example") XxAttributeOptionExample example);

    int updateByExample(@Param("record") XxAttributeOption record, @Param("example") XxAttributeOptionExample example);
}