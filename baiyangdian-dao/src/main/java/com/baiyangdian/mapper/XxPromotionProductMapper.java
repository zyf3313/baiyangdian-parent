package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPromotionProductExample;
import com.baiyangdian.pojo.XxPromotionProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPromotionProductMapper {
    int countByExample(XxPromotionProductExample example);

    int deleteByExample(XxPromotionProductExample example);

    int deleteByPrimaryKey(XxPromotionProductKey key);

    int insert(XxPromotionProductKey record);

    int insertSelective(XxPromotionProductKey record);

    List<XxPromotionProductKey> selectByExample(XxPromotionProductExample example);

    int updateByExampleSelective(@Param("record") XxPromotionProductKey record, @Param("example") XxPromotionProductExample example);

    int updateByExample(@Param("record") XxPromotionProductKey record, @Param("example") XxPromotionProductExample example);
}