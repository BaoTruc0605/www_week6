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

//    @GetMapping("/insertPostComment")
//    public String insertPost(Model model, @RequestParam("id") Long id) {
//
//        List<Post> post = postService.findAllByAuthorAndPublished(userService.findById(id).get(),true);
//        model.addAttribute("posts",post);
//        model.addAttribute("user",userService.findById(id).get());
//        return "post/addPost";
//    }
//
//    @PostMapping("/addPostComment")
//    public String addPost(Model model, RedirectAttributes redirectAttributes,
//                          @RequestParam("userId") long userId, @RequestParam("metaTitle") String metaTitle,
//                          @RequestParam("title") String title,
//                          @RequestParam("content") String content,
//                          @RequestParam("summary") String summary,
//                          @RequestParam("parent") String parentId){
//        if(parentId.equals("")){
//            Post post = new Post(title,true,content,metaTitle,summary,  Instant.now(), Instant.now(), null,userService.findById(userId).get(),null);
//            postService.addPost(post);
//        }else{
//        Post post = new Post(title,true,content,metaTitle,summary,  Instant.now(), Instant.now(), null,userService.findById(userId).get(),postService.findById(Long.parseLong(parentId)).get());
//        postService.addPost(post);}
//
////        redirectAttributes.addAttribute("id", companyId);
////
////        return "redirect:/listJobByCompany";
//        return "index";
//    }







}
