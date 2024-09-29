package com.example.yogi_project.reservation.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@NoArgsConstructor
@Alias("ReservationVO")
@ToString
public class ReservationVO {
    private Integer reservationId;
    private String email;
    private String chkInDttm;
    private String chkOutDttm;
    private Integer numberOfGuests;
    private Integer totalPrice;
    private String accommodationName;
}
