package com.sandking.mybatis.mapper;

import com.sandking.mybatis.pojo.BbsAddr;
import com.sandking.mybatis.pojo.BbsAddrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsAddrMapper {
    int countByExample(BbsAddrExample example);

    int deleteByExample(BbsAddrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsAddr record);

    int insertSelective(BbsAddr record);

    List<BbsAddr> selectByExample(BbsAddrExample example);

    BbsAddr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsAddr record, @Param("example") BbsAddrExample example);

    int updateByExample(@Param("record") BbsAddr record, @Param("example") BbsAddrExample example);

    int updateByPrimaryKeySelective(BbsAddr record);

    int updateByPrimaryKey(BbsAddr record);
}