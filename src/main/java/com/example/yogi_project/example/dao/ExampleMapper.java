package com.example.yogi_project.example.dao;


import com.example.yogi_project.example.domain.AccommodationVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Mapper
public interface ExampleMapper {

    List<AccommodationVO> ExampleMybatis();

    List<AccommodationVO> ExampleMybatisPaging(@Param("pageSize") int pageSize,@Param("offset") Long offset);

    Integer ExampleMyBatisPagingCountAll();

}
