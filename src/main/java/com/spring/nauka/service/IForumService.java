package com.spring.nauka.service;

import com.spring.nauka.domain.Forum;

import java.util.List;

/**
 * Created by Admin on 2017-02-08.
 */
public interface IForumService {

    public Forum savePost(Forum forum);
    public List<Forum> getPosts();
    public Forum getPostById(String id);

}
