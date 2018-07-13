package com.test.services;

import org.springframework.stereotype.Service;

import com.test.extras.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("Keshav", "Sharma", "YO"),
        new Topic("Madhav", "Sharma", "YOYO"),
        new Topic("Arjun", "Sharma", "Y")
    ));

    public List<Topic> getAllTopics()
    {

        return topics;
    }

    public Topic getTopic(String id)
    {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic)
    {
        for(int i= 0; i < topics.size(); i++)
        {
            if(topics.get(i).getId().equals(id))
            {
                topics.set(i, topic);

            }
        }
    }
}
