package vn.edu.iuh.fit.www_week6_tranbaotruc.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user")
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
    @Column(name = "registerd_at")
    @NonNull
    private Instant registeredAt;
    @Column(name = "last_login")
    @NonNull
    private Instant lastLogin;
    @OneToMany(mappedBy = "author" , fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Post> posts = new LinkedHashSet<>();
    @OneToMany(mappedBy = "user" , fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<PostComment> comments = new LinkedHashSet<>();

    public User(String firstName, String middleName, String lastName, String email, String mobile, String intro, String profile, String passwordHash) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.intro = intro;
        this.profile = profile;
        this.passwordHash = passwordHash;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", intro='" + intro + '\'' +
                ", profile='" + profile + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", registeredAt=" + registeredAt +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
