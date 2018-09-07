package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxProductMemberPrice;
import com.baiyangdian.pojo.XxProductMemberPriceExample;
import com.baiyangdian.pojo.XxProductMemberPriceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxProductMemberPriceMapper {
    int countByExample(XxProductMemberPriceExample example);

    int deleteByExample(XxProductMemberPriceExample example);

    int deleteByPrimaryKey(XxProductMemberPriceKey key);

    int insert(XxProductMemberPrice record);

    int insertSelective(XxProductMemberPrice record);

    List<XxProductMemberPrice> selectByExample(XxProductMemberPriceExample example);

    XxProductMemberPrice selectByPrimaryKey(XxProductMemberPriceKey key);

    int updateByExampleSelective(@Param("record") XxProductMemberPrice record, @Param("example") XxProductMemberPriceExample example);

    int updateByExample(@Param("record") XxProductMemberPrice record, @Param("example") XxProductMemberPriceExample example);

    int updateByPrimaryKeySelective(XxProductMemberPrice record);

    int updateByPrimaryKey(XxProductMemberPrice record);
}