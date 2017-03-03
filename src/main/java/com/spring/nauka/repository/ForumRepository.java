package com.spring.nauka.repository;



import com.spring.nauka.domain.Forum;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ForumRepository extends MongoRepository<Forum,String >  {
    public Forum findById(String id);
}
