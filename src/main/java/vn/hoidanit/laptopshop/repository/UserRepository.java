package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    List<User> findAll();

    List<User> findByEmailAndAddress(String email, String address);

    List<User> findByEmail(String email);

    User getUserById(long id);

    User deleteById(long id);

    // User update(Long id, User user);
}
