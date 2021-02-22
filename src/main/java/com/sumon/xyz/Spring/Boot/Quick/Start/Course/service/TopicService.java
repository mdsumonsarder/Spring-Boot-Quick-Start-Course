package com.sumon.xyz.Spring.Boot.Quick.Start.Course.service;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import com.sumon.xyz.Spring.Boot.Quick.Start.Course.normalpart.Topics;
import com.sumon.xyz.Spring.Boot.Quick.Start.Course.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;



    //Get Method;
    public List<Topic> getAllTopics()
    {

        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;

    }


    public Topic getTopic(String id)
    {

        /*Topic t = null;
        Optional<Topic> options = topicRepository.findById(id);
        if(options.isPresent()) {
            t = options.get();
        }*/

       //return t;

        return topicRepository.findById(id).get();

    }


    //Post Method;
    public void addTopic(Topic topic) {

        topicRepository.save(topic);
    }


    //PUT Method;
    public void updateTopic(String id,Topic topic) {

        topicRepository.save(topic);

    }


    //Delete Method;
    public void deleteTopic(String id) {

        topicRepository.deleteById(id);
    }
}
