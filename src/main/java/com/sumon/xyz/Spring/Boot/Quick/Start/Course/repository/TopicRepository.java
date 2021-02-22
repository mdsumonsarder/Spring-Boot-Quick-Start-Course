package com.sumon.xyz.Spring.Boot.Quick.Start.Course.repository;

import com.sumon.xyz.Spring.Boot.Quick.Start.Course.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TopicRepository extends CrudRepository<Topic,String> {


}
