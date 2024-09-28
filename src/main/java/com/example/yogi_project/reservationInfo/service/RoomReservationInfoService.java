package com.example.yogi_project.reservationInfo.service;

import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.reservationInfo.dao.RoomReservationInfoDao;
import com.example.yogi_project.reservationInfo.domain.RoomReservationInfoVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomReservationInfoService {

    private final RoomReservationInfoDao roomReservationInfoDao;

    public List<RoomReservationInfoVO> getReservationInfos(RoomReservationInfoVO param){
        return roomReservationInfoDao.getReservationInfos(param);
    }

}
