package com.example.yogi_project.reservationInfo.dao;

import com.example.yogi_project.reservationInfo.domain.RoomReservationInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomReservationInfoDao {

    List<RoomReservationInfoVO> getReservationInfos(RoomReservationInfoVO param);



}
