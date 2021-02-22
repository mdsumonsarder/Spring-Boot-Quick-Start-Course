package com.sumon.xyz.Spring.Boot.Quick.Start.Course.normalpart;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicsController {


    //Get Method;
    @RequestMapping("/topics")
    @ResponseBody
    public List<Topics> sayHello()
    {
        return Arrays.asList(
                new Topics("1","Sumon Sarder","Software Engineer"),
                new Topics("2","Khair","Software Engineer"),
                new Topics("3","Sujit","Software Engineer")
        );
    }





}
