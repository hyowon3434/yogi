package com.example.yogi_project.review.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@Alias("ReviewVO")
@ToString
public class ReviewVO {
    private Integer reviewId;
    private Integer accommodationId;
    private Integer reviewUserId;
    private String reviewContent;
    private String createdDttm;
    private String updatedDttm;
}
