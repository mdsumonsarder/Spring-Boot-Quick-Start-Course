package com.sumon.xyz.Spring.Boot.Quick.Start.Course.course;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import com.sumon.xyz.Spring.Boot.Quick.Start.Course.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    //Get Topics;
    @RequestMapping("/topic/{id}/course")
    public List<Course> getAllTopics(@PathVariable String id){
        return courseService.getAllCourse(id);
    }


    //Get Topic;
    @RequestMapping("/topic/{topicId}/course/{id}")
    public Course getTopic(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }


    //Post Method;
    @RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/course")
    public void addTopic(@RequestBody Course course,@PathVariable String topicId)
    {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }



    //PUT Method;
    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/course/{id}")
    public void updateTopic(@RequestBody Course course, @PathVariable String topicId,@PathVariable String id)
    {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }


    //DELETE Method;
    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/course/{id}")
    public void deleteCourse(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }



}
