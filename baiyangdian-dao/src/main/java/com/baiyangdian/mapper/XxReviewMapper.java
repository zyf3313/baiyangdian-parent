package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxReview;
import com.baiyangdian.pojo.XxReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxReviewMapper {
    int countByExample(XxReviewExample example);

    int deleteByExample(XxReviewExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxReview record);

    int insertSelective(XxReview record);

    List<XxReview> selectByExample(XxReviewExample example);

    XxReview selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxReview record, @Param("example") XxReviewExample example);

    int updateByExample(@Param("record") XxReview record, @Param("example") XxReviewExample example);

    int updateByPrimaryKeySelective(XxReview record);

    int updateByPrimaryKey(XxReview record);
}