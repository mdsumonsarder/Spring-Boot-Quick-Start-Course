package com.sumon.xyz.Spring.Boot.Quick.Start.Course.controller;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import com.sumon.xyz.Spring.Boot.Quick.Start.Course.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;


    //Get Topics;
    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }


    //Get Topic;
    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }


    //Post Method;
    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }



    //PUT Method;
    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
    {
        topicService.updateTopic(id,topic);
    }


    //DELETE Method;
    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }



}
