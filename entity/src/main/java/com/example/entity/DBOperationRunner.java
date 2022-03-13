package com.example.entity;


import com.example.entity.entities.*;
import com.example.entity.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBOperationRunner implements CommandLineRunner {

    @Autowired
    TestRepository testRepository;
/*
    Manuel constructor  injection
    final private TestRepository testRepositoryManuel;

    public DBOperationRunner(TestRepository testRepositoryManuel){
        this.testRepositoryManuel = testRepositoryManuel;
        }
*/

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostCommentsRepository postCommentsRepository;

    @Autowired
    TagRepository tagRepository;

    @Autowired
    PostTagsRepository postTagsRepository;

    @Override
    public void run(String... args) throws Exception {

        //for test purpose
        final Test test = Test.builder()
                .name("no2")
                .build();
        testRepository.save(test);

        // add fake data to user table using user entity
//        final User user = User.builder()
//                .username("ali")
//                .password("12345")
//                .version(1)
//                .createdBy(111L)
//                .build();
//        userRepository.save(user);

        // add fake data to post table using user entity
        final Post post = Post.builder()
                .content("fine content fine")
                .version(1)
                .build();
        postRepository.save(post);



        //// add fake data to post_comments table with user_id
        User userComment = userRepository.getById(16l);

        final PostComments postComments = PostComments.builder()
                .user(userComment)
                .version(1)
                .commentText("cok guzel bir post olmus")
                .build();
        postCommentsRepository.save(postComments);


        //// add fake data to tag table
        final Tag tag = Tag.builder()
                .version(1)
                .tagName("#araba")
                .build();
        tagRepository.save(tag);

        Post postId = postRepository.getById(24l);
        Tag tagId = tagRepository.getById(29l);

        final PostTags postTags = PostTags.builder()
                .post(postId)
                .tag(tagId)
                .build();

        postTagsRepository.save(postTags);


        System.out.println("----------All Data saved into Database----------------------");
    }

}

