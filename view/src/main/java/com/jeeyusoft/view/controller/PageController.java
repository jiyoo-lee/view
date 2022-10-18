package com.jeeyusoft.view.controller;

import com.jeeyusoft.view.domain.SampleVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class PageController {

    @GetMapping("/")
    public String main2(Model model){

        Map<String, Object> map= new HashMap<>();
        map.put("language","Java11");
        map.put("Framework","Spring Boot");
        map.put("WAS","Tomcat");
        map.put("IDE","IntelliJ");
        map.put("Build Tool","Gradle");
        map.put("Database","MySQL");

        //view에 데이터 전달
        model.addAttribute("map",map);

        List<String> list = new ArrayList<>();
        list.add("back end dev");
        list.add("front end dev");
        list.add("operator");
        list.add("DBA");
        list.add("Data Analysis");
        list.add("Visualization Artist");
        list.add("Big Data");
        list.add("AI");
        list.add("Cloud - DevOps, MLOps, CI/CD");

        model.addAttribute("list",list);

        // 뷰 이름 리턴
        return "main";
    }

    //요청을 처리하는 메서드가 아무것도 리턴하지 않으면
    //view이름은 요청url이 됩니다.
    @GetMapping("/ex1")
    public void ex12(){

    }

    @GetMapping("/ex2")
    public void ex2 (Model model){
        List<SampleVO> list = IntStream.rangeClosed(1,20)
                .asLongStream()
                .mapToObj(i ->{
                    SampleVO vo = SampleVO.builder()
                        .sno(1L)
                        .first("First.."+i)
                        .last("Last.."+i)
                        .regTime(LocalDateTime.now())
                        .build();
                    return vo;
                }).collect(Collectors.toList());

        model.addAttribute("list",list);
    }
}
