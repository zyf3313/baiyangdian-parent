package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxMemberAttributeOption;
import com.baiyangdian.pojo.XxMemberAttributeOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxMemberAttributeOptionMapper {
    int countByExample(XxMemberAttributeOptionExample example);

    int deleteByExample(XxMemberAttributeOptionExample example);

    int insert(XxMemberAttributeOption record);

    int insertSelective(XxMemberAttributeOption record);

    List<XxMemberAttributeOption> selectByExample(XxMemberAttributeOptionExample example);

    int updateByExampleSelective(@Param("record") XxMemberAttributeOption record, @Param("example") XxMemberAttributeOptionExample example);

    int updateByExample(@Param("record") XxMemberAttributeOption record, @Param("example") XxMemberAttributeOptionExample example);
}