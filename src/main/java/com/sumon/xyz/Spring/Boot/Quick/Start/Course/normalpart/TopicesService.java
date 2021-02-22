package com.sumon.xyz.Spring.Boot.Quick.Start.Course.normalpart;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicesService {


    private List<Topics> topics = new ArrayList<>( Arrays.asList(
            new Topics("1","Sumon Sarder","Software Engineer"),
            new Topics("2","Khair","Software Engineer"),
            new Topics("3","Sujit","Software Engineer"),
            new Topics("4","Sumon Sarder","Software Engineer"),
            new Topics("5","Khair","Software Engineer"),
            new Topics("6","Sujit","Software Engineer")
    ));


    //Get Topics;
    public List<Topics> getAllTopics() {

        return topics;
    }


    //Get Topic;
    public Topics getTopic(String id) {

        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    //Post Topic;
    public void addTopic(Topics topic) {

       topics.add(topic);
    }


    //Put Topic;
    public void updateTopic(String id, Topics topic) {

        for (int i=0;i<topics.size();i++)
        {
            Topics t = topics.get(i);
            if (t.getId().equals(id))
            {
                topics.set(i,topic);
                return;
            }
        }

    }


    //Delete Topic;
    public void deleteTopic(String id) {

      topics.removeIf(t->t.getId().equals(id));
    }
}
