package com.example.yogi_project.review.controller;

import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.reservation.service.ReservationService;
import com.example.yogi_project.review.domain.ReviewVO;
import com.example.yogi_project.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/review")
@RequiredArgsConstructor
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public String getReviews(Model model, ReviewVO param){
        List<ReviewVO> reviews = reviewService.getReviews(param);
        model.addAttribute("reviews", reviews);
        return null;
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
