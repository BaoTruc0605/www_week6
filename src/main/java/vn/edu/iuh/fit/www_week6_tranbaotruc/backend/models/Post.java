package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models;


import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models.User;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "post")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 75, nullable = false)
    private String title;
    @Column(nullable = false)
    private Boolean published;
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "meta_title",length = 100)
    private String metaTitle;
    @Column(columnDefinition = "text")
    private String summary;
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "published_at")
    private Instant publishedAt;
    @Column(name = "updated_at")
    private Instant updatedAt;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    @NonNull
    private Post parent;
    @OneToMany(mappedBy = "parent")
    @ToString.Exclude
    private Set<Post> posts = new LinkedHashSet<>();
    @OneToMany(mappedBy = "post")
    @ToString.Exclude
    private Set<PostComment> postComments = new LinkedHashSet<>();

    public Post(String title, Boolean published, String content, String metaTitle, String summary, Instant createdAt, Instant publishedAt, Instant updatedAt, User author, Post parent) {
        this.title = title;
        this.published = published;
        this.content = content;
        this.metaTitle = metaTitle;
        this.summary = summary;
        this.createdAt = createdAt;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.author = author;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", published=" + published +
                ", content='" + content + '\'' +
                ", metaTitle='" + metaTitle + '\'' +
                ", summary='" + summary + '\'' +
                ", createdAt=" + createdAt +
                ", publishedAt=" + publishedAt +
                ", updatedAt=" + updatedAt +
                ", author=" + author +
                ", parent=" + parent +
                '}';
    }
}
