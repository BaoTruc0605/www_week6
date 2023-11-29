package vn.edu.iuh.fit.www_week6_tranbaotruc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.PostComment;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostCommentRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.UserRepository;

import java.time.Instant;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class WwwWeek6TranBaoTrucApplication {

    public static void main(String[] args) {
        SpringApplication.run(WwwWeek6TranBaoTrucApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PostCommentRepository postCommentRepository;


    @Bean
    CommandLineRunner initData() {
        return args -> {
            Random rnd = new Random();
//
//            this.post = post;
//            this.user = user;
//            this.title = title;
//            this.published = published;
//            this.content = content;
//            this.publishedAt = publishedAt;
//            this.createdAt = createdAt;
//            this.parent = parent;

//            for (long i = 1; i < 15; i++) {
//                PostComment postComment = new PostComment(postRepository.findById(i).get(), userRepository.findById(i).get(),"Oke", true,"Haha, let’s do it right now. I have so much more to catch up with you " ,
//                        Instant.now(),Instant.now(),null );
//
//                System.out.println(postComment);
//                postCommentRepository.save(postComment);
//
//            }

//            for (long i = 1; i < 15; i++) {
//                User user = new User("Diep","Lam","Vy "+i, "email_" + i + "@gmail.com",rnd.nextLong(1111111111L, 9999999999L) + "",
//                        "intro "+i, "profile "+i,"abc123");
//                System.out.println(user);
//                userRepository.save(user);
////
////            System.out.println(userRepository.findUserByEmailAndPasswordHash("email_10@gmail.com", "abc123").get());
//
//                Post post = new Post("title"+i,true,"content "+i,"metaTile "+i,"summary " +i,  Instant.now(), Instant.now(), null,userRepository.findById(i).get(),null);
//                System.out.println(post);
//                postRepository.save(post);
//            }
//        List<Post> posts = postRepository.findAll(Sort.by(Sort.Direction.DESC, "publishedAt"));
//            for (Post p: posts
//                 ) {
//                System.out.println(p.getId());
//            }
//

//            List<Post> posts = postRepository.findPostsByPublished(true,Sort.by(Sort.Direction.DESC, "publishedAt"));
//            for (Post p: posts
//                 ) {
//                System.out.println(p.getId());
//            }
        };
    }

}
