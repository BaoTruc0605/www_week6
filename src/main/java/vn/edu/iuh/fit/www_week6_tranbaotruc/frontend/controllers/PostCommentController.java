package vn.edu.iuh.fit.www_week6_tranbaotruc.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.PostComment;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.services.PostCommentService;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.services.PostService;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.services.UserService;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class PostCommentController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;
    @Autowired
    private PostCommentService postCommentService;

//    @GetMapping("/insertPostComment")
//    public String insertPost(Model model, @RequestParam("id") Long id) {
//
//        List<Post> post = postService.findAllByAuthorAndPublished(userService.findById(id).get(),true);
//        model.addAttribute("posts",post);
//        model.addAttribute("user",userService.findById(id).get());
//        return "post/addPost";
//    }
//
    @PostMapping("/addPostComment")
    public String addPost(Model model, RedirectAttributes redirectAttributes,
                          @RequestParam("userId") String userId,
                          @RequestParam("postId") String postId,
                          @RequestParam("yourTitle") String yourTitle,
                          @RequestParam("yourComment") String yourComment){

        PostComment postComment = new PostComment(postService.findById(Long.parseLong(postId)).get(), userService.findById(Long.parseLong(userId)).get(),yourTitle, true,yourComment ,
                        Instant.now(),Instant.now(),null );
        postCommentService.addPostComment(postComment);
        redirectAttributes.addAttribute("id", Long.parseLong(postId));
        redirectAttributes.addAttribute("userId", Long.parseLong(userId));
        return "redirect:/viewPost";
    }
    @PostMapping("/replyPostComment")
    public String replyPostComment(Model model, RedirectAttributes redirectAttributes,
                          @RequestParam("userId") String userId,
                          @RequestParam("postId") String postId,
                                   @RequestParam("parentId") String parentId,
                          @RequestParam("yourTitle") String yourTitle,
                          @RequestParam("yourComment") String yourComment){

        PostComment postComment = new PostComment(postService.findById(Long.parseLong(postId)).get(), userService.findById(Long.parseLong(userId)).get(),yourTitle, true,yourComment ,
                Instant.now(),Instant.now(),postCommentService.findById(Long.parseLong(parentId)).get() );
        postCommentService.addPostComment(postComment);
        redirectAttributes.addAttribute("id", Long.parseLong(postId));
        redirectAttributes.addAttribute("userId", Long.parseLong(userId));
        return "redirect:/viewPost";
    }







}
