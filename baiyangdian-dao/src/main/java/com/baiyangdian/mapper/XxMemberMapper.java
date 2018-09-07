package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxMember;
import com.baiyangdian.pojo.XxMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxMemberMapper {
    int countByExample(XxMemberExample example);

    int deleteByExample(XxMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxMember record);

    int insertSelective(XxMember record);

    List<XxMember> selectByExample(XxMemberExample example);

    XxMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxMember record, @Param("example") XxMemberExample example);

    int updateByExample(@Param("record") XxMember record, @Param("example") XxMemberExample example);

    int updateByPrimaryKeySelective(XxMember record);

    int updateByPrimaryKey(XxMember record);
}