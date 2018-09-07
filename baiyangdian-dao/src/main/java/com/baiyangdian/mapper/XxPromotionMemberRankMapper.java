package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPromotionMemberRankExample;
import com.baiyangdian.pojo.XxPromotionMemberRankKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPromotionMemberRankMapper {
    int countByExample(XxPromotionMemberRankExample example);

    int deleteByExample(XxPromotionMemberRankExample example);

    int deleteByPrimaryKey(XxPromotionMemberRankKey key);

    int insert(XxPromotionMemberRankKey record);

    int insertSelective(XxPromotionMemberRankKey record);

    List<XxPromotionMemberRankKey> selectByExample(XxPromotionMemberRankExample example);

    int updateByExampleSelective(@Param("record") XxPromotionMemberRankKey record, @Param("example") XxPromotionMemberRankExample example);

    int updateByExample(@Param("record") XxPromotionMemberRankKey record, @Param("example") XxPromotionMemberRankExample example);
}