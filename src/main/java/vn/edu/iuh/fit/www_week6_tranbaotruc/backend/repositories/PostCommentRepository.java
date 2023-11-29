package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.PostComment;

public interface PostCommentRepository extends JpaRepository<PostComment,Long> {
}
