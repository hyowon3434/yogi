package com.example.yogi_project.example.service;

import com.example.yogi_project.example.dao.ExampleMapper;
import com.example.yogi_project.example.domain.AccommodationVO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService{

    private final ExampleMapper exampleMapper;
    @Override
    public Page<AccommodationVO> ExampleMybatisPaging(Pageable pageable) {
        List<AccommodationVO> postByPageNumber = exampleMapper.ExampleMybatisPaging(pageable.getPageSize(),pageable.getOffset());

        Integer totalPost = exampleMapper.ExampleMyBatisPagingCountAll();

        return new PageImpl<>(postByPageNumber,pageable,totalPost);
    }
}
