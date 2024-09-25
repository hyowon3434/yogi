package com.example.yogi_project.accommodation.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("AccommodationVO")
@NoArgsConstructor
public class AccommodationVO {
    private Integer accommodationId;
    private String name;
    private String address;
    private String description;
    private String type;
    private Integer price;
    private String imageTitle;
    private String standardCapacity;
}
