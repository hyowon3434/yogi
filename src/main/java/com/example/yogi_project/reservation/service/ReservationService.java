package com.example.yogi_project.reservation.service;

import com.example.yogi_project.reservation.dao.ReservationDao;
import com.example.yogi_project.reservation.domain.ReservationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationDao reservationDao;

    public List<ReservationVO> getReservations(ReservationVO param){
        return reservationDao.getReservations(param);
    }

    public void newReservation(ReservationVO param){
        reservationDao.newReservation(param);
    }

    public void putReservation(ReservationVO param){
        reservationDao.putReservation(param);
    }

    public void delReservation(ReservationVO param){
        reservationDao.delReservation(param);
    }
}
