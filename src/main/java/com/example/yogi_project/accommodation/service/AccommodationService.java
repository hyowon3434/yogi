package com.example.yogi_project.accommodation.service;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationService {

    @Autowired
    private AccommodationDao accommodationDao;

    public List<AccommodationVO> getAccommodations(AccommodationVO param){
        return accommodationDao.getAccommodations(param);
    }

    public void newAccommodation(AccommodationVO param){
        accommodationDao.newAccommodation(param);
    }

    public void putAccommodation(AccommodationVO param){
        accommodationDao.putAccommodation(param);
    }

    public void delAccommodation(AccommodationVO param){
        accommodationDao.delAccommodation(param);
    }
}
