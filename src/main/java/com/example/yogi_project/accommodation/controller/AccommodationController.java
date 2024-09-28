package com.example.yogi_project.accommodation.controller;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/stay")
@Slf4j
public class AccommodationController {

    @Autowired
    private AccommodationDao accommodationDao;
    @Autowired
    private AccommodationService accommodationService;

    // 숙소 전체 조회
    @GetMapping
    public String getAccmmodations(Model model, AccommodationVO param){
        List<AccommodationVO> accommodations = accommodationService.getAccommodations(param);
        model.addAttribute("accommodations", accommodations);
        log.info(accommodations.get(0).getImageTitle());
        return "main";
    }

    // 숙소 필터링 검색
    @GetMapping("/search")
    public String getAccommodation(Model model, AccommodationVO param){
        List<AccommodationVO> filteredAccommodation = accommodationService.getAccommodations(param);
        model.addAttribute("accommodations", filteredAccommodation);
        log.warn(filteredAccommodation.get(0).getDescription());

        return "main";
    }

    @PostMapping
    public String newAccmmodation(AccommodationVO param, MultipartFile file) throws Exception{
        log.warn(param.getAddress());
        accommodationService.newAccommodation(param, file);
        return "main";
    }

    @PutMapping
    public String putAccmmodation(@RequestBody AccommodationVO param, MultipartFile file) throws Exception{
        accommodationService.putAccommodation(param, file);
        return "main";
    }

    @DeleteMapping
    public String delAccmmodation(@RequestBody AccommodationVO param){
        accommodationService.delAccommodation(param);
        return null;
    }
}
