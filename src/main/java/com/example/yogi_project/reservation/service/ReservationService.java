package com.example.yogi_project.reservation.service;

import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import com.example.yogi_project.reservation.dao.ReservationDao;
import com.example.yogi_project.reservation.domain.ReservationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationDao reservationDao;
    @Autowired
    private AccommodationService accommodationService;

    public List<ReservationVO> getReservations(ReservationVO param){
        return reservationDao.getReservations(param);
    }

    public void newReservation(ReservationVO param,
                               Integer accommodationId){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        AccommodationVO accommodationVO = new AccommodationVO();
        accommodationVO.setAccommodationId(accommodationId);

        List<AccommodationVO> accommodations = accommodationService.getAccommodations(accommodationVO);
        param.setEmail("hello@naver.com");
        param.setAccommodationName(accommodations.get(0).getName());
        param.setChkInDttm(LocalDateTime.now().format(formatter));
        param.setChkOutDttm(LocalDateTime.now().plusDays(10).format(formatter));
        param.setTotalPrice(230000);
        param.setNumberOfGuests(4);

        reservationDao.newReservation(param);
    }

    public void putReservation(ReservationVO param){
        reservationDao.putReservation(param);
    }

    public void delReservation(ReservationVO param){
        reservationDao.delReservation(param);
    }
}
