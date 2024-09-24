package com.example.yogi_project.example.dao;


import com.example.yogi_project.example.domain.ExampleVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExampleMapper {

    List<ExampleVO> ExampleMybatis();

    List<ExampleVO> ExampleMybatisPaging(@Param("pageSize") int pageSize, @Param("offset") Long offset);

    Integer ExampleMyBatisPagingCountAll();

}
