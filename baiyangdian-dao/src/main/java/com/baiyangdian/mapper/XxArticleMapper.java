package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxArticle;
import com.baiyangdian.pojo.XxArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxArticleMapper {
    int countByExample(XxArticleExample example);

    int deleteByExample(XxArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxArticle record);

    int insertSelective(XxArticle record);

    List<XxArticle> selectByExampleWithBLOBs(XxArticleExample example);

    List<XxArticle> selectByExample(XxArticleExample example);

    XxArticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxArticle record, @Param("example") XxArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") XxArticle record, @Param("example") XxArticleExample example);

    int updateByExample(@Param("record") XxArticle record, @Param("example") XxArticleExample example);

    int updateByPrimaryKeySelective(XxArticle record);

    int updateByPrimaryKeyWithBLOBs(XxArticle record);

    int updateByPrimaryKey(XxArticle record);
}