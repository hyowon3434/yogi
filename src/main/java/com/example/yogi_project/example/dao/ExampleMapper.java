package com.example.yogi_project.example.dao;


import com.example.yogi_project.example.domain.AccommodationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleMapper {

    List<AccommodationVO> ExampleMybatis();



}
