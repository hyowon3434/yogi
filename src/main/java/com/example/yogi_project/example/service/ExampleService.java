package com.example.yogi_project.example.service;

import com.example.yogi_project.example.domain.AccommodationVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ExampleService {

    Page<AccommodationVO> ExampleMybatisPaging(Pageable pageable);
}
