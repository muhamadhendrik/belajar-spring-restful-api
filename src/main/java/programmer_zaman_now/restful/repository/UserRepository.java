package programmer_zaman_now.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import programmer_zaman_now.restful.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
}