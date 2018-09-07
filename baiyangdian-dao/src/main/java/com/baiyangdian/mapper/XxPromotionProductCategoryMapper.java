package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPromotionProductCategoryExample;
import com.baiyangdian.pojo.XxPromotionProductCategoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPromotionProductCategoryMapper {
    int countByExample(XxPromotionProductCategoryExample example);

    int deleteByExample(XxPromotionProductCategoryExample example);

    int deleteByPrimaryKey(XxPromotionProductCategoryKey key);

    int insert(XxPromotionProductCategoryKey record);

    int insertSelective(XxPromotionProductCategoryKey record);

    List<XxPromotionProductCategoryKey> selectByExample(XxPromotionProductCategoryExample example);

    int updateByExampleSelective(@Param("record") XxPromotionProductCategoryKey record, @Param("example") XxPromotionProductCategoryExample example);

    int updateByExample(@Param("record") XxPromotionProductCategoryKey record, @Param("example") XxPromotionProductCategoryExample example);
}