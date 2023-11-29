package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.PostComment;

import java.util.List;

public interface PostCommentRepository extends JpaRepository<PostComment,Long> {
    List<PostComment> findPostCommentsByPost(Post post);

    List<PostComment> findPostCommentsByParent(PostComment postComment);
    List<PostComment> findPostCommentsByPostAndParent(Post post, PostComment parent);

}
