package com.baiyangdian.mapper;

import com.baiyangdian.pojo.XxSeo;
import com.baiyangdian.pojo.XxSeoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxSeoMapper {
    int countByExample(XxSeoExample example);

    int deleteByExample(XxSeoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XxSeo record);

    int insertSelective(XxSeo record);

    List<XxSeo> selectByExample(XxSeoExample example);

    XxSeo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XxSeo record, @Param("example") XxSeoExample example);

    int updateByExample(@Param("record") XxSeo record, @Param("example") XxSeoExample example);

    int updateByPrimaryKeySelective(XxSeo record);

    int updateByPrimaryKey(XxSeo record);
}