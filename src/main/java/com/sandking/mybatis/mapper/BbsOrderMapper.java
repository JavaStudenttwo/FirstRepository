package com.sandking.mybatis.mapper;

import com.sandking.mybatis.pojo.BbsOrder;
import com.sandking.mybatis.pojo.BbsOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsOrderMapper {
    int countByExample(BbsOrderExample example);

    int deleteByExample(BbsOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsOrder record);

    int insertSelective(BbsOrder record);

    List<BbsOrder> selectByExample(BbsOrderExample example);

    BbsOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsOrder record, @Param("example") BbsOrderExample example);

    int updateByExample(@Param("record") BbsOrder record, @Param("example") BbsOrderExample example);

    int updateByPrimaryKeySelective(BbsOrder record);

    int updateByPrimaryKey(BbsOrder record);
}