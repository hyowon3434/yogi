package com.example.yogi_project.review.dao;

import com.example.yogi_project.reservation.domain.ReservationVO;
import com.example.yogi_project.review.domain.ReviewVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDao {

    List<ReviewVO>          getReviews(ReviewVO param);
    void                    newReview(ReviewVO param);
    void                    putReview(ReviewVO param);
    void                    delReview(ReviewVO param);
}
