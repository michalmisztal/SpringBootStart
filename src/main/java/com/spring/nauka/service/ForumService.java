package com.spring.nauka.service;

import com.spring.nauka.domain.Forum;
import com.spring.nauka.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 2017-02-08.
 */
@Service
public class ForumService implements IForumService {

    @Autowired
    private ForumRepository forumRepository;


    @Override
    public Forum savePost(Forum forum) {
        return forumRepository.save(forum);
    }

    @Override
    public List<Forum> getPosts() {

        return Lists.newArrayList(forumRepository.findAll());

    }

    public Forum getPostById(String id){
        return forumRepository.findById(id);
    }
}
