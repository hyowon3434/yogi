package com.example.yogi_project.reservation.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@Alias("ReservationVO")
public class ReservationVO {
    private String reservationId;
    private String email;
    private String chkInDttm;
    private String chkOutDttm;
    private Integer numberOfGuests;
    private Integer totalPrice;
    private String accommodationName;
}
