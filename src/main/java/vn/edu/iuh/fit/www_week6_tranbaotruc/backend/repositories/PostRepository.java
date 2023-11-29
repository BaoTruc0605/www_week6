package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.Post;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllByAuthorAndPublished(User author, boolean published);
    List<Post> findAllByAuthor(User author);

    List<Post> findPostsByPublished(boolean published, Sort sort);
//   Page<Post> findPostsByPublishedPage(boolean published, Pageable pageable);
}
