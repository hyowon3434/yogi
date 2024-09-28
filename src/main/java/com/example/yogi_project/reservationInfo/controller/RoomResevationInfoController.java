package com.example.yogi_project.reservationInfo.controller;

import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.reservationInfo.dao.RoomReservationInfoDao;
import com.example.yogi_project.reservationInfo.domain.RoomReservationInfoVO;
import com.example.yogi_project.reservationInfo.service.RoomReservationInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@Slf4j
public class RoomResevationInfoController {

    private final RoomReservationInfoService roomReservationInfoService;


    @GetMapping("/testReview/{hotelId}")
    public String getDetailRoomReservationInfos(Model model, RoomReservationInfoVO param, @PathVariable Integer hotelId) {
        System.out.println("hotel id : "+hotelId);
        param.setHotelId(hotelId);
        List<RoomReservationInfoVO> roomReservations = roomReservationInfoService.getReservationInfos(param);
        model.addAttribute("roomReservations", roomReservations);

        System.out.println(roomReservations);
        log.info(roomReservations.get(0).getName());
        log.info(roomReservations.get(0).getImageTitle());
        return "review";
    }

    @GetMapping("/testMain")
    public String getMain(Model model, RoomReservationInfoVO param) {

        List<RoomReservationInfoVO> roomReservations = roomReservationInfoService.getReservationInfos(param);
        model.addAttribute("accommodations", roomReservations);

        System.out.println(roomReservations);
        log.info(roomReservations.get(0).getName());
        log.info(roomReservations.get(0).getImageTitle());
        log.info(roomReservations.get(0).getHotelId().toString());
        return "main";
    }



}
