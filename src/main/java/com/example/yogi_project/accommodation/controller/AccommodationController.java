package com.example.yogi_project.accommodation.controller;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import com.example.yogi_project.example.domain.ExampleVO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequiredArgsConstructor
@RequestMapping("/stay")
@Slf4j
public class AccommodationController {

    @Autowired
    private AccommodationDao accommodationDao;
    @Autowired
    private AccommodationService accommodationService;
    //숙소 전체 조회 페이징 처리
    @GetMapping
    public String getExPaging(@PageableDefault(size=12) Pageable pageable,Model model,AccommodationVO param){
        Page<AccommodationVO> postByPageNumber = accommodationService.getAccommodationPaging(pageable);

        log.info("posts : {}", postByPageNumber.getContent().get(0).getAccommodationId());
        log.info("prev: {}", pageable.previousOrFirst().getPageNumber() + 1);
        log.info("next: {}", pageable.next().getPageNumber() + 1);
        log.info("hasPrev: {}", pageable.hasPrevious());
        log.info("hasNext: {}", postByPageNumber.hasNext());
        log.info("totalPageCount: {}", IntStream.rangeClosed(1, postByPageNumber.getTotalPages())
                .boxed()
                .collect(Collectors.toList()));

        model.addAttribute("postByPageNumber",postByPageNumber);

        return "main";
    }

    // 숙소 전체 조회
//    @GetMapping
//    public String getAccmmodations(Model model, AccommodationVO param){
//        List<AccommodationVO> accommodations = accommodationService.getAccommodations(param);
//        model.addAttribute("accommodations", accommodations);
//
//        return "main";
//    }

    // 숙소 필터링 검색
    @GetMapping("/search")
    public String getAccommodation(Model model, AccommodationVO param,@RequestParam("query") String query){
        log.info("검색 데이터: {}", query);
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

    @GetMapping("/modal")
    public String getModal(){
        return "commonModal";
    }

}
