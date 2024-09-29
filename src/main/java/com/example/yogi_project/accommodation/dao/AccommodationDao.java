package com.example.yogi_project.accommodation.dao;

import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.example.domain.ExampleVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccommodationDao {

    List<AccommodationVO>   getAccommodations(AccommodationVO param);
    void                    newAccommodation(AccommodationVO param);
    void                    putAccommodation(AccommodationVO param);
    void                    delAccommodation(AccommodationVO param);
    List<AccommodationVO> getAccommodationPaging(@Param("pageSize") int pageSize, @Param("offset") Long offset);
    Integer getAccommodationsTotalCnt();

}
