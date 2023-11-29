package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name",length = 50)
    private String firstName;
    @Column(name = "middle_name",length = 50)
    private String middleName;
    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column(length = 50)
    private String email;
    @Column(length = 15)
    private String mobile;
    @Column(columnDefinition = "text")
    private String intro;
    @Column(columnDefinition = "text")
    private String profile;
    @Column(name = "password_hash",length = 64, nullable = false)
    private String passwordHash;
    @Column(name = "registerd_at",nullable = false)
    private Instant registeredAt;
    @Column(name = "last_login",nullable = false)
    private Instant lastLogin;
    @OneToMany(mappedBy = "author")
    @ToString.Exclude
    private Set<Post> posts = new LinkedHashSet<>();
    @OneToMany(mappedBy = "user")
    @ToString.Exclude
    private Set<PostComment> comments = new LinkedHashSet<>();
}
