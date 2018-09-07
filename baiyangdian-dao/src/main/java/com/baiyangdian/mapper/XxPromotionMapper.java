package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxPromotion;
import com.baiyangdian.pojo.XxPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxPromotionMapper {
    int countByExample(XxPromotionExample example);

    int deleteByExample(XxPromotionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxPromotion record);

    int insertSelective(XxPromotion record);

    List<XxPromotion> selectByExampleWithBLOBs(XxPromotionExample example);

    List<XxPromotion> selectByExample(XxPromotionExample example);

    XxPromotion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxPromotion record, @Param("example") XxPromotionExample example);

    int updateByExampleWithBLOBs(@Param("record") XxPromotion record, @Param("example") XxPromotionExample example);

    int updateByExample(@Param("record") XxPromotion record, @Param("example") XxPromotionExample example);

    int updateByPrimaryKeySelective(XxPromotion record);

    int updateByPrimaryKeyWithBLOBs(XxPromotion record);

    int updateByPrimaryKey(XxPromotion record);
}