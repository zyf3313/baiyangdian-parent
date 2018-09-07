package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxFriendLink;
import com.baiyangdian.pojo.XxFriendLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxFriendLinkMapper {
    int countByExample(XxFriendLinkExample example);

    int deleteByExample(XxFriendLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxFriendLink record);

    int insertSelective(XxFriendLink record);

    List<XxFriendLink> selectByExample(XxFriendLinkExample example);

    XxFriendLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxFriendLink record, @Param("example") XxFriendLinkExample example);

    int updateByExample(@Param("record") XxFriendLink record, @Param("example") XxFriendLinkExample example);

    int updateByPrimaryKeySelective(XxFriendLink record);

    int updateByPrimaryKey(XxFriendLink record);
}