package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxAdminRoleExample;
import com.baiyangdian.pojo.XxAdminRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAdminRoleMapper {
    int countByExample(XxAdminRoleExample example);

    int deleteByExample(XxAdminRoleExample example);

    int deleteByPrimaryKey(XxAdminRoleKey key);

    int insert(XxAdminRoleKey record);

    int insertSelective(XxAdminRoleKey record);

    List<XxAdminRoleKey> selectByExample(XxAdminRoleExample example);

    int updateByExampleSelective(@Param("record") XxAdminRoleKey record, @Param("example") XxAdminRoleExample example);

    int updateByExample(@Param("record") XxAdminRoleKey record, @Param("example") XxAdminRoleExample example);
}