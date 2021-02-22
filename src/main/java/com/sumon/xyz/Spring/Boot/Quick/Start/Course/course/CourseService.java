package com.sumon.xyz.Spring.Boot.Quick.Start.Course.course;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import com.sumon.xyz.Spring.Boot.Quick.Start.Course.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;



    //Get Method;
    public List<Course> getAllCourse(String topicId)
    {

        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;

    }


     //Get Course;
    public Course getCourse(String id)
    {

        return courseRepository.findById(id).get();

    }


    //Post Method;
    public void addCourse(Course course) {

        courseRepository.save(course);
    }


    //PUT Method;
    public void updateCourse(Course course) {

        courseRepository.save(course);

    }


    //Delete Method;
    public void deleteCourse(String id) {

        courseRepository.deleteById(id);
    }
}
