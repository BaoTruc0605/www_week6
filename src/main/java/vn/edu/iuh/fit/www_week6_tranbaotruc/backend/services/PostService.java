package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void addPost(Post post){
        postRepository.save(post);
    }

    public List<Post> findAllByAuthorAndPublished(User author, boolean published){
        return postRepository.findAllByAuthorAndPublished(author,published);

    }
    public List<Post> findAllByAuthor(User author){
        return postRepository.findAllByAuthor(author);

    }
    public Optional<Post> findById(long id){
        return postRepository.findById(id);
    }




}
