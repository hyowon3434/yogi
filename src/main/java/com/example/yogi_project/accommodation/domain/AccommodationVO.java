package com.example.yogi_project.accommodation.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("AccommodationVO")
@ToString
@NoArgsConstructor
public class AccommodationVO {
    private Integer accommodationId;
    private String name;
    private String address;
    private String description;
    private String type;
    private Integer price;
    private String imageTitle;
    private Integer standardCapacity;
    private String hotelImage2;
    private String hotelImage3;
    private String hotelImage4;
    private String hotelImage5;
    private String hotelHost;
}
