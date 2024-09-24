package com.example.yogi_project.example.controller;

import com.example.yogi_project.example.dao.ExampleMapper;
import com.example.yogi_project.example.domain.ExampleVO;
import com.example.yogi_project.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/ex")
@RequiredArgsConstructor
@Slf4j
public class ExampleController {

    private final ExampleMapper exampleMapper;
    private final ExampleService exampleService;

    @GetMapping("/01")
    public List<ExampleVO> getEx(){
        List<ExampleVO> ExampList = exampleMapper.ExampleMybatis();
        log.info(ExampList.get(0).getAddress());
        log.info(ExampList.get(0).getAddress());

        return ExampList;
    }

    @GetMapping("/paging")
    public ResponseEntity<Map<String, Object>> getExPaging(@PageableDefault(size=1,page=1) Pageable pageable){
       Page<ExampleVO> postByPageNumber = exampleService.ExampleMybatisPaging(pageable);

       Map<String,Object> response = new HashMap<>();
       response.put("posts",postByPageNumber.getContent());
       response.put("prev",pageable.previousOrFirst().getPageNumber() + 1);
       response.put("next",pageable.next().getPageNumber() + 1);
       response.put("hasPrev",pageable.hasPrevious());
       response.put("hasNext",postByPageNumber.hasNext());
       response.put("totalPageCount", IntStream.rangeClosed(1,postByPageNumber.getTotalPages())
               .boxed()
               .collect(Collectors.toList()));

        return ResponseEntity.ok(response);
    }


}
