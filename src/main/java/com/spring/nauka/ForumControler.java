package com.spring.nauka;

import com.spring.nauka.domain.Forum;
import com.spring.nauka.repository.ForumRepository;
import com.spring.nauka.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Admin on 2017-01-23.
 */

@RestController
@RequestMapping("api/v2/")
public class ForumControler {

    @Autowired
    private ForumService forumService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Forum save (@RequestBody Forum forum){

        return forumService.savePost(forum);
    }

    @RequestMapping(method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<Forum> getForum (){

        return forumService.getPosts();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Forum findPostById(@PathVariable("id") String id){
        Forum forum = forumService.getPostById(id);

        return forum;
    }


}

