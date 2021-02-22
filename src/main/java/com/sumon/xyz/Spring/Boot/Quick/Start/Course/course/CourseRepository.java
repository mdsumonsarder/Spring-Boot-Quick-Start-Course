package com.sumon.xyz.Spring.Boot.Quick.Start.Course.course;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);

}
