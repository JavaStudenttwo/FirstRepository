package com.sandking.mybatis.mapper;

import com.sandking.mybatis.pojo.BbsColor;
import com.sandking.mybatis.pojo.BbsColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsColorMapper {
    int countByExample(BbsColorExample example);

    int deleteByExample(BbsColorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsColor record);

    int insertSelective(BbsColor record);

    List<BbsColor> selectByExample(BbsColorExample example);

    BbsColor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsColor record, @Param("example") BbsColorExample example);

    int updateByExample(@Param("record") BbsColor record, @Param("example") BbsColorExample example);

    int updateByPrimaryKeySelective(BbsColor record);

    int updateByPrimaryKey(BbsColor record);
}