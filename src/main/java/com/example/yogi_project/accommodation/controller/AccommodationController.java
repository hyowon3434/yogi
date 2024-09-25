package com.example.yogi_project.accommodation.controller;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class AccommodationController {

    @Autowired
    private AccommodationDao accommodationDao;
    @Autowired
    private AccommodationService accommodationService;

    @GetMapping("/main")
    public String getAccmmodations(Model model, AccommodationVO param){
        List<AccommodationVO> accommodations = accommodationService.getAccommodations(param);
        model.addAttribute("accommodations", accommodations);
        log.info(accommodations.get(0).getImageTitle());
        return "main";
    }

    @PostMapping
    public String newAccmmodation(@RequestBody AccommodationVO param){
        accommodationService.newAccommodation(param);
        return null;
    }

    @PutMapping
    public String putAccmmodation(@RequestBody AccommodationVO param){
        accommodationService.putAccommodation(param);
        return null;
    }

    @DeleteMapping
    public String delAccmmodation(@RequestBody AccommodationVO param){
        accommodationService.delAccommodation(param);
        return null;
    }
}
