package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.services.*;
import com.test.extras.*;
import java.util.List;



@RestController
public class TopicController
{
   @Autowired //Specifies that TopicService class needs dependency injection
   private TopicService topicService;



    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {

        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping( value = "/topics")
    public void add(@RequestBody Topic topic)
    {
        topicService.addTopic(topic);
    }

    @PutMapping(value = "/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic)
    {
        topicService.updateTopic(id, topic);

    }

}
