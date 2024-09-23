package com.example.yogi_project.example.domain;

import lombok.Getter;
import org.apache.ibatis.type.Alias;

@Getter
@Alias("AccommodationVO")
public class AccommodationVO {
    private Long accommodationId; // 숙소 고유 ID
    private String name; // 숙소 이름
    private String address; // 숙소 주소
    private String description; // 숙소 설명
    private String type; // 숙소 유형 (호텔, 모텔, 펜션 등)
    private Integer price; // 숙소 가격
    private String mainImages; // 숙소 이미지 주소값
    private String images1; // 숙소 이미지 주소값
    private String images2; // 숙소 이미지 주소값
    private Integer reviewCount; // 숙소 리뷰 개수
}
