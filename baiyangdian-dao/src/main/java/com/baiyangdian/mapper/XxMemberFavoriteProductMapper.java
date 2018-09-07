package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxMemberFavoriteProductExample;
import com.baiyangdian.pojo.XxMemberFavoriteProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxMemberFavoriteProductMapper {
    int countByExample(XxMemberFavoriteProductExample example);

    int deleteByExample(XxMemberFavoriteProductExample example);

    int deleteByPrimaryKey(XxMemberFavoriteProductKey key);

    int insert(XxMemberFavoriteProductKey record);

    int insertSelective(XxMemberFavoriteProductKey record);

    List<XxMemberFavoriteProductKey> selectByExample(XxMemberFavoriteProductExample example);

    int updateByExampleSelective(@Param("record") XxMemberFavoriteProductKey record, @Param("example") XxMemberFavoriteProductExample example);

    int updateByExample(@Param("record") XxMemberFavoriteProductKey record, @Param("example") XxMemberFavoriteProductExample example);
}