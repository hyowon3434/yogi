package com.example.yogi_project.example.service;

import com.example.yogi_project.example.domain.ExampleVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ExampleService {

    Page<ExampleVO> ExampleMybatisPaging(Pageable pageable);
}
