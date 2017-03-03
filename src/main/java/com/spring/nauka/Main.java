package com.spring.nauka;


import com.spring.nauka.domain.Forum;
import com.spring.nauka.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
@EnableAutoConfiguration
public class Main{

  /*  @Autowired
    private ForumRepository forumRepository;

    @Override
    public void run(String... args) throws Exception {

        Forum f1 = new Forum("co zrobic ?","co mam zrobic ?",new Date());
        Forum f2 = new Forum("jak to zrobic ?","Jak mam to zrobić?",new Date());
        Forum f3 = new Forum("gdzie to znalesc ?","w ktorym miejscu ?",new Date());

        forumRepository.save(f1);
        forumRepository.save(f2);
        forumRepository.save(f3);

    }*/

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);}
}
