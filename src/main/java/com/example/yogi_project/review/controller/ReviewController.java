package com.example.yogi_project.review.controller;

import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.accommodation.service.AccommodationService;
import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.reservation.service.ReservationService;
import com.example.yogi_project.review.domain.ReviewVO;
import com.example.yogi_project.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/review")
@RequiredArgsConstructor
@Slf4j
public class ReviewController {

    @Autowired
    private ReviewService reviewService;
    @Autowired
    private AccommodationService accommodationService;
  
    // 해당 숙소의 리뷰 조회(query-string 숙소고유번호값(accommodationId))
    @GetMapping
    public String getReviews(Model model, ReviewVO param) throws Exception {
        AccommodationVO accommodationVO = new AccommodationVO();
        accommodationVO.setAccommodationId(param.getAccommodationId());

        List<ReviewVO> reviews = reviewService.getReviews(param);
        List<AccommodationVO> accommodations = accommodationService.getAccommodations(accommodationVO);

        if (accommodations == null) {
            throw new Exception("존재하지 않는 숙소입니다.");
        }
        model.addAttribute("reviews", reviews);
        model.addAttribute("accommodations", accommodations);

        log.warn(accommodations.toString());
        return "review";
    }

    @PostMapping
    public String newReview(@RequestBody ReviewVO param){
        reviewService.newReview(param);
        return null;
    }

    @PutMapping
    public String putReview(@RequestBody ReviewVO param){
        reviewService.putReview(param);
        return null;
    }

    @DeleteMapping
    public String delReview(@RequestBody ReviewVO param){
        reviewService.delReview(param);
        return null;
    }
}
