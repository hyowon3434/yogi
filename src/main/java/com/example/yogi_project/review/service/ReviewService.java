package com.example.yogi_project.review.service;

import com.example.yogi_project.reservation.dao.ReservationDao;
import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.review.dao.ReviewDao;
import com.example.yogi_project.review.domain.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewDao reviewDao;

    public List<ReviewVO> getReviews(ReviewVO param){
        return reviewDao.getReviews(param);
    }

    public void newReview(ReviewVO param){
        reviewDao.newReview(param);
    }

    public void putReview(ReviewVO param){
        reviewDao.putReview(param);
    }

    public void delReview(ReviewVO param){
        reviewDao.delReview(param);
    }
}
