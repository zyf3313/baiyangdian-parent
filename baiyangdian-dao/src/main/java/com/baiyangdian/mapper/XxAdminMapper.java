package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxAdmin;
import com.baiyangdian.pojo.XxAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxAdminMapper {
    int countByExample(XxAdminExample example);

    int deleteByExample(XxAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxAdmin record);

    int insertSelective(XxAdmin record);

    List<XxAdmin> selectByExample(XxAdminExample example);

    XxAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxAdmin record, @Param("example") XxAdminExample example);

    int updateByExample(@Param("record") XxAdmin record, @Param("example") XxAdminExample example);

    int updateByPrimaryKeySelective(XxAdmin record);

    int updateByPrimaryKey(XxAdmin record);
}