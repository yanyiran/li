package com.example.li;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
public class BuyerProductController {

    @RequestMapping("/hi")
    public Map<String,Object> af(){
        Map<String,Object> map = new HashMap<>();
        map.put("name", "hanghang");
        map.put("age", "120");
        System.out.println("hinatappzhihang.zhioou...");
        return map;
    }

}
