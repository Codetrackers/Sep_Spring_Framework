package com.sep;

import com.sep.model.Comment;
import com.sep.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SepApplication {


    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");
        ApplicationContext context = SpringApplication.run(SepApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);


    }

}
