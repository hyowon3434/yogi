package com.example.yogi_project.review.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@Alias("ReviewVO")
public class ReviewVO {
    private Integer reviewId;
    private String accommodationId;
    private String reviewUserId;
    private String reviewContent;
    private String createdDttm;
    private String updatedDttm;
}
