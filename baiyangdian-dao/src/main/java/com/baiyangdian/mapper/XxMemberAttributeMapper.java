package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxMemberAttribute;
import com.baiyangdian.pojo.XxMemberAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxMemberAttributeMapper {
    int countByExample(XxMemberAttributeExample example);

    int deleteByExample(XxMemberAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxMemberAttribute record);

    int insertSelective(XxMemberAttribute record);

    List<XxMemberAttribute> selectByExample(XxMemberAttributeExample example);

    XxMemberAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxMemberAttribute record, @Param("example") XxMemberAttributeExample example);

    int updateByExample(@Param("record") XxMemberAttribute record, @Param("example") XxMemberAttributeExample example);

    int updateByPrimaryKeySelective(XxMemberAttribute record);

    int updateByPrimaryKey(XxMemberAttribute record);
}