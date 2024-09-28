package com.example.yogi_project.reservationInfo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RooomReservationDetailDTO {

    private int seq;
    private int hotelId;
    private double MRPrice;
    private String MRavailableHour;
    private String MRimage;
    private double SRprice;
    private String SRenterTime;
    private String SRexitTime;
    private String SRimage;
}
