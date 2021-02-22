package com.sumon.xyz.Spring.Boot.Quick.Start.Course.normalpart;


import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {


    @Autowired
    TopicesService topicesService;


    //Get Topics;
    @RequestMapping("/topics")
    @ResponseBody
    public List<Topics> getTopics()
    {
        return topicesService.getAllTopics();
    }


    //Get Topic;
    @RequestMapping("/topics/{id}")
    @ResponseBody
    public Topics getTopic(@PathVariable String id)
    {

        return topicesService.getTopic(id);
    }


    //Post Topic;
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topics topics){

        topicesService.addTopic(topics);
    }

    //Put Topic;
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topics, @PathVariable String id)
    {

        topicesService.updateTopic(id,topics);
    }


   //Delete Topic;
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {

        topicesService.deleteTopic(id);
    }


}
