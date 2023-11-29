package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.PostComment;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostCommentRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories.PostRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;

    public void addPostComment(PostComment postComment) {
        postCommentRepository.save(postComment);
    }


//    public List<PostComment> findPostCommentsByPost(Post post) {
//        return postCommentRepository.findPostCommentsByPost(post);
//    }

    public List<PostComment> findPostCommentsByPost(Post post) {
        return postCommentRepository.findPostCommentsByPostAndParent(post,null);
    }

    public Optional<PostComment> findById(long id) {
        return postCommentRepository.findById(id);
    }

//    public List<Post> findAllByAuthorAndPublished(User author, boolean published) {
//        return postRepository.findAllByAuthorAndPublished(author, published);
//
//    }
//
//    public List<Post> findAllByAuthor(User author) {
//        return postRepository.findAllByAuthor(author);
//
//    }
//
//    public Optional<Post> findById(long id) {
//        return postRepository.findById(id);
//    }

//    public List<Post> findAllSort() {
//        return postRepository.findPostsByPublished(true, Sort.by(Sort.Direction.DESC, "publishedAt"));
//
//    }

//    public Page<Post> findAllAndSort(int pageNumber, int pageSize, String sortBy, String sortDirection) {
//        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
//        return postRepository.findPostsByPublished(true, pageable);
//    }

//    public Page<Post> findAllAndSort(int pageNumber, int pageSize, String sortBy, String sortDirection) {
//
//        Sort sort = Sort.by(Sort.Direction.DESC, sortBy);
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);
//        return  postRepository.findPostsByPublishedPage(true, pageable);
//    }
//    public Page<Post> findPaginated(Pageable pageable) {
//        int pageSize = pageable.getPageSize();
//        int currentPage = pageable.getPageNumber();
//        int startItem = currentPage * pageSize;
//        List<Post> list;
//        List<Post> post = postRepository.findPostsByPublished(true,Sort.by(Sort.Direction.DESC, "publishedAt"));
//        if (post.size() < startItem) {
//            list = Collections.emptyList();
//        } else {
//            int toIndex = Math.min(startItem + pageSize, post.size());
//            list = post.subList(startItem, toIndex);
//        }
//        Page<Post> postPage
//                = new PageImpl<>(list, PageRequest.of(currentPage, pageSize),
//                post.size());
//        return postPage;
//    }


}
