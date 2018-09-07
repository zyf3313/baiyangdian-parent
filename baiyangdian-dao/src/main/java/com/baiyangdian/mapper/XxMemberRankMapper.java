package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxMemberRank;
import com.baiyangdian.pojo.XxMemberRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxMemberRankMapper {
    int countByExample(XxMemberRankExample example);

    int deleteByExample(XxMemberRankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxMemberRank record);

    int insertSelective(XxMemberRank record);

    List<XxMemberRank> selectByExample(XxMemberRankExample example);

    XxMemberRank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxMemberRank record, @Param("example") XxMemberRankExample example);

    int updateByExample(@Param("record") XxMemberRank record, @Param("example") XxMemberRankExample example);

    int updateByPrimaryKeySelective(XxMemberRank record);

    int updateByPrimaryKey(XxMemberRank record);
}