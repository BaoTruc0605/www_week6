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
import java.util.Set;

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
//            System.out.println(postCommentRepository.findById(24l).get().getAllDescendants().size());
//            for (PostComment postComment : postCommentRepository.findById(24l).get().getAllDescendants()) {
//                System.out.println("Title: " + postComment.getId());
//                System.out.println("Content: " + postComment.getContent());
//                System.out.println("User: " + postComment.getUser().getFirstName() + " " +
//                        postComment.getUser().getMiddleName() + " " +
//                        postComment.getUser().getLastName());
//            }

//            Set<PostComment> postComments = postCommentRepository.findById(10l).get().getPostComments();
//        System.out.println(postCommentRepository.findById(10l).get().getPostComments().size());
//            System.out.println(postCommentRepository.findById(16l).get().getPostComments().size());
//            for (PostComment postComment : postComments) {
//                System.out.println("Title: " + postComment.getTitle());
//                System.out.println("Content: " + postComment.getContent());
//                System.out.println("User: " + postComment.getUser().getFirstName() + " " +
//                        postComment.getUser().getMiddleName() + " " +
//                        postComment.getUser().getLastName());
//            }
//            for (int i = 0; i < postComments.size(); i++){
//                System.out.println(postComments.get(i).getId());
//            }

//            List<PostComment> postComments = postCommentRepository.findPostCommentsByParent(postCommentRepository.findById(10l).get());
//            for (int i = 0; i < postComments.size(); i++){
//                System.out.println(postComments.get(i).getId());
//            }






//            for (long i = 1; i < 15; i++) {
//                User user = new User("Diep","Lam","Vy "+i, "email_" + i + "@gmail.com",rnd.nextLong(1111111111L, 9999999999L) + "",
//                        "intro "+i, "profile "+i,"abc123");
//                System.out.println(user);
//                userRepository.save(user);
//                Post post = new Post("title"+i,true,"content "+i,"metaTile "+i,"summary " +i,  Instant.now(), Instant.now(), null,userRepository.findById(i).get(),null);
//                System.out.println(post);
//                postRepository.save(post);
//            }
//
//                        for (long i = 1; i < 15; i++) {
//                PostComment postComment = new PostComment(postRepository.findById(i).get(), userRepository.findById(i).get(),"Oke", true,"Haha, let’s do it right now. I have so much more to catch up with you " ,
//                        Instant.now(),Instant.now(),null );
//
//                System.out.println(postComment);
//                postCommentRepository.save(postComment);
//
//            }
//
//                        for (long i = 1; i < 10; i++){
//                PostComment postComment = new PostComment(postRepository.findById(i).get(), userRepository.findById(i).get(),"Oke", true,"Haha, let’s do it right now. I have so much more to catch up with you " ,
//                        Instant.now(),Instant.now(), postCommentRepository.findById(10l).get());
////                System.out.println(postComment.toString());
//                postCommentRepository.save(postComment);
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
