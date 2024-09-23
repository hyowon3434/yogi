package com.example.yogi_project.example.controller;

import com.example.yogi_project.example.dao.ExampleMapper;
import com.example.yogi_project.example.domain.AccommodationVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ex")
@RequiredArgsConstructor
@Slf4j
public class ExampleController {

    private final ExampleMapper exampleMapper;

    @GetMapping("/01")
    public List<AccommodationVO> getEx(){
        List<AccommodationVO> ExampList = exampleMapper.ExampleMybatis();
        log.info(ExampList.get(0).getAddress());
        log.info(ExampList.get(0).getAddress());

        return ExampList;
    }

}
