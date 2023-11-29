package vn.edu.iuh.fit.www_week6_tranbaotruc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostCommentRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.UserRepository;

import java.time.Instant;
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
        };
    }

}
