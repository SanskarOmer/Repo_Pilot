package repoPilot.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID uuid;

    @Column(name ="github_id",nullable=false,unique=true)
    private long githubId;

    @Column(name="github_username")
    private String githubUsername;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "avatar_url",length = 500)
    private String avatarUrl;

    @Column(name ="access_token",nullable=false,columnDefinition = "Text")
    private String accessToken;

    @Column(name ="token_scope",length = 500)
    private String tokenScopes;

    @Column(name = "created_at",nullable=false,updatable = false)
    private Instant createdAt;

    @PrePersist
     void createOn() {
        if (this.createdAt == null) {
            this.createdAt = Instant.now();
        }
    }

    public UUID getId() {
        return this.uuid;
    }
}
