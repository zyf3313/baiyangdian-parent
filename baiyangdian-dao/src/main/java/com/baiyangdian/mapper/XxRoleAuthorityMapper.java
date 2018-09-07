package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxRoleAuthority;
import com.baiyangdian.pojo.XxRoleAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxRoleAuthorityMapper {
    int countByExample(XxRoleAuthorityExample example);

    int deleteByExample(XxRoleAuthorityExample example);

    int insert(XxRoleAuthority record);

    int insertSelective(XxRoleAuthority record);

    List<XxRoleAuthority> selectByExample(XxRoleAuthorityExample example);

    int updateByExampleSelective(@Param("record") XxRoleAuthority record, @Param("example") XxRoleAuthorityExample example);

    int updateByExample(@Param("record") XxRoleAuthority record, @Param("example") XxRoleAuthorityExample example);
}