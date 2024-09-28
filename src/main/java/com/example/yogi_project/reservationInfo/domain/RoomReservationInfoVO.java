package com.example.yogi_project.reservationInfo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@Alias("RoomReservationInfoVO")
public class RoomReservationInfoVO {

    private Integer hotelId; // 기본 키 (Primary Key)
    private String name;
    private String address;
    private String description;
    private String type;
    private Integer price;
    private String imageTitle;
    private String standardCapacity;
    private String hotelImage2;
    private String hotelImage3;
    private String hotelImage4;
    private String hotelImage5;
    private String hotelHost;
}
