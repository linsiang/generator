package com.qf.manager.dao;

import com.qf.manager.pojo.po.Poetry;
import com.qf.manager.pojo.po.PoetryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryMapper {
    int countByExample(PoetryExample example);

    int deleteByExample(PoetryExample example);

    int deleteByPrimaryKey(Integer poetryId);

    int insert(Poetry record);

    int insertSelective(Poetry record);

    List<Poetry> selectByExample(PoetryExample example);

    Poetry selectByPrimaryKey(Integer poetryId);

    int updateByExampleSelective(@Param("record") Poetry record, @Param("example") PoetryExample example);

    int updateByExample(@Param("record") Poetry record, @Param("example") PoetryExample example);

    int updateByPrimaryKeySelective(Poetry record);

    int updateByPrimaryKey(Poetry record);
}