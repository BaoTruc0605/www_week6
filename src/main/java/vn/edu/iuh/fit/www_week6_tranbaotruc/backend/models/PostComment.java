package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
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
    @OneToMany(mappedBy = "parent")
    @ToString.Exclude
    private Set<PostComment> postComments;

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
}
