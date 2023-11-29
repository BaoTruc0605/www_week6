package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "post_comment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(length = 100,nullable = false)
    private String title;
    @Column(nullable = false)
    private Boolean published;
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "published_at")
    private Instant publishedAt;
    @Column(name = "created_at")
    private Instant createdAt;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent;
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<PostComment> postComments  = new LinkedHashSet<>();

    public PostComment(Post post, User user, String title, Boolean published, String content, Instant publishedAt, Instant createdAt, PostComment parent) {
        this.post = post;
        this.user = user;
        this.title = title;
        this.published = published;
        this.content = content;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.parent = parent;
    }


    @Override
    public String toString() {
        return "PostComment{" +
                "id=" + id +
                ", post=" + post +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", published=" + published +
                ", content='" + content + '\'' +
                ", publishedAt=" + publishedAt +
                ", createdAt=" + createdAt +
                ", parent=" + parent +
                '}';
    }
    public Set<PostComment> getAllDescendants() {
        Set<PostComment> allDescendants = new LinkedHashSet<>();
        collectDescendants(this, allDescendants);
        return allDescendants;
    }

    private void collectDescendants(PostComment currentComment, Set<PostComment> allDescendants) {
        for (PostComment child : currentComment.getPostComments()) {
            allDescendants.add(child);
            // Đệ quy để lấy tất cả con của con
            collectDescendants(child, allDescendants);
        }
    }


}
