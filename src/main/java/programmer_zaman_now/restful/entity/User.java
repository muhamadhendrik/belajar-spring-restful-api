package programmer_zaman_now.restful.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")

public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String token;

    @Column(name = "token_expired_at")
    private long tokenExpirredAt;

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts;

}
