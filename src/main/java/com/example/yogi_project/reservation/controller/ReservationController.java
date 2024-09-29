package com.example.yogi_project.reservation.controller;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public String getReservations(Model model, ReservationVO param){
        List<ReservationVO> reservations = reservationService.getReservations(param);
        model.addAttribute("reservations", reservations);
        return null;
    }

    @GetMapping("/new")
    public String newReservation(@ModelAttribute ReservationVO param,
                                 @RequestParam("accommodationId") Integer accommodationId){
        reservationService.newReservation(param, accommodationId);
        return "main";
    }

    @PutMapping
    public String putReservation(@RequestBody ReservationVO param){
        reservationService.putReservation(param);
        return null;
    }

    @DeleteMapping
    public String delReservation(@RequestBody ReservationVO param){
        reservationService.delReservation(param);
        return null;
    }

    @GetMapping("/reservationModal")
    public String getReservation(){
        return "reservation-modal";
    }
}
