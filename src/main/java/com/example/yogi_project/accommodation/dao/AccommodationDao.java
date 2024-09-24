package com.example.yogi_project.accommodation.dao;

import com.example.yogi_project.accommodation.domain.AccommodationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccommodationDao {

    List<AccommodationVO>   getAccommodations(AccommodationVO param);
    void                    newAccommodation(AccommodationVO param);
    void                    putAccommodation(AccommodationVO param);
    void                    delAccommodation(AccommodationVO param);
}
