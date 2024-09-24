package com.example.yogi_project.reservation.dao;

import com.example.yogi_project.reservation.domain.ReservationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReservationDao {

    List<ReservationVO>   getReservations(ReservationVO param);
    void                    newReservation(ReservationVO param);
    void                    putReservation(ReservationVO param);
    void                    delReservation(ReservationVO param);
}
