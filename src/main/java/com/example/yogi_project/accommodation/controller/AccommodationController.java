package com.example.yogi_project.accommodation.controller;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stay")
@RequiredArgsConstructor
public class AccommodationController {

    @Autowired
    private AccommodationDao accommodationDao;
    @Autowired
    private AccommodationService accommodationService;

    @GetMapping
    public String getAccmmodations(Model model, AccommodationVO param){
        List<AccommodationVO> accommodations = accommodationService.getAccommodations(param);
        model.addAttribute("accommodations", accommodations);
        return null;
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
