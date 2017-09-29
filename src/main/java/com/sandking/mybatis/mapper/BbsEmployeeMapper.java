package com.sandking.mybatis.mapper;

import com.sandking.mybatis.pojo.BbsEmployee;
import com.sandking.mybatis.pojo.BbsEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsEmployeeMapper {
    int countByExample(BbsEmployeeExample example);

    int deleteByExample(BbsEmployeeExample example);

    int deleteByPrimaryKey(String username);

    int insert(BbsEmployee record);

    int insertSelective(BbsEmployee record);

    List<BbsEmployee> selectByExample(BbsEmployeeExample example);

    BbsEmployee selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") BbsEmployee record, @Param("example") BbsEmployeeExample example);

    int updateByExample(@Param("record") BbsEmployee record, @Param("example") BbsEmployeeExample example);

    int updateByPrimaryKeySelective(BbsEmployee record);

    int updateByPrimaryKey(BbsEmployee record);
}