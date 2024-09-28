package com.example.yogi_project.accommodation.service;

import com.example.yogi_project.accommodation.dao.AccommodationDao;
import com.example.yogi_project.accommodation.domain.AccommodationVO;
import com.example.yogi_project.example.domain.ExampleVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class AccommodationService {

    @Autowired
    private AccommodationDao accommodationDao;

    public List<AccommodationVO> getAccommodations(AccommodationVO param){
        return accommodationDao.getAccommodations(param);
    }

    public void newAccommodation(AccommodationVO param, MultipartFile file) throws Exception{
        String path = saveFile(file);

        param.setImageTitle(file.getOriginalFilename());
        param.setStandardCapacity(1);
        accommodationDao.newAccommodation(param);
    }

    public void putAccommodation(AccommodationVO param, MultipartFile file) throws Exception{
        String path = saveFile(file);
        param.setImageTitle(file.getOriginalFilename().toString());
        param.setStandardCapacity(1);
        accommodationDao.putAccommodation(param);

    }

    public void delAccommodation(AccommodationVO param){
        accommodationDao.delAccommodation(param);
    }

    private String saveFile(MultipartFile file) throws Exception {
        if (file.getOriginalFilename() == null) throw new Exception("파일이 첨부되지 않았습니다");
        String projectPath = "";
        try{
            UUID uuid = UUID.randomUUID();
            String fileName = uuid + "_" + file.getOriginalFilename();
            projectPath = "/Users/jayden/Downloads/yogi_project/src/main/resources/static" + fileName;

            File saveFile = new File(projectPath, fileName);
            file.transferTo(saveFile);
        } catch (Exception e){
            e.printStackTrace();
        }


        return projectPath;
    }
    public Page<AccommodationVO> getAccommodationPaging(Pageable pageable,AccommodationVO param){
        List<AccommodationVO> postByPageNumber = accommodationDao.getAccommodationPaging(pageable.getPageSize(),pageable.getOffset(),param);

        Integer totalPost = accommodationDao.getAccommodationsTotalCnt();

        return new PageImpl<>(postByPageNumber, pageable, totalPost);
    }

}
