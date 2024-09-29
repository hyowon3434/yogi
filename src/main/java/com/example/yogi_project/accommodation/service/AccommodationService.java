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

    public void newAccommodation(AccommodationVO param,
                                 MultipartFile imageTitle,
                                 List<MultipartFile> hotelImages) throws Exception{
        saveFile(imageTitle, hotelImages);
        param.setImageTitle(imageTitle.getOriginalFilename());
        param.setHotelImage2(hotelImages.get(0).getOriginalFilename());
        param.setHotelImage3(hotelImages.get(1).getOriginalFilename());
        param.setHotelImage4(hotelImages.get(2).getOriginalFilename());
        param.setHotelImage5(hotelImages.get(3).getOriginalFilename());
        param.setHotelHost("홍길동");
        param.setStandardCapacity(1);
        accommodationDao.newAccommodation(param);
    }

    public void putAccommodation(AccommodationVO param,
                                 MultipartFile imageTitle,
                                 List<MultipartFile> hotelImages) throws Exception{
        saveFile(imageTitle, hotelImages);
        param.setImageTitle(imageTitle.getOriginalFilename());
        param.setHotelImage2(hotelImages.get(0).getOriginalFilename());
        param.setHotelImage3(hotelImages.get(1).getOriginalFilename());
        param.setHotelImage4(hotelImages.get(2).getOriginalFilename());
        param.setHotelImage5(hotelImages.get(3).getOriginalFilename());
        param.setHotelHost("홍길동");
        param.setStandardCapacity(1);
        accommodationDao.putAccommodation(param);

    }

    public void delAccommodation(AccommodationVO param){
        accommodationDao.delAccommodation(param);
    }

    private void saveFile(MultipartFile file,
                          List<MultipartFile> files) throws Exception {
        if (file.getOriginalFilename() == null || files.size() == 0) throw new Exception("파일이 첨부되지 않았습니다");

        String projectPath = "/Users/jayden/Downloads/yogi_project/src/main/resources/static";
        try{
            UUID uuid = UUID.randomUUID();
            String fileName = uuid + "_" + file.getOriginalFilename();
            projectPath += fileName;

            File saveFile = new File(projectPath, fileName);
            file.transferTo(saveFile);


            for (MultipartFile image : files) {
                UUID hotelUuid = UUID.randomUUID();
                String imgFileName = hotelUuid + "_" + image.getOriginalFilename();
                projectPath += imgFileName;

                File saveImg = new File(projectPath, fileName);
                file.transferTo(saveImg);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public Page<AccommodationVO> getAccommodationPaging(Pageable pageable,String name){
        List<AccommodationVO> postByPageNumber = accommodationDao.getAccommodationPaging(pageable.getPageSize(),pageable.getOffset(),name);

        Integer totalPost = accommodationDao.getAccommodationsTotalCnt(name);

        return new PageImpl<>(postByPageNumber, pageable, totalPost);
    }

}
