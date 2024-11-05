package com.codelevate.crudhexagonal.infrastructure.adapter;

import com.codelevate.crudhexagonal.domain.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    default List<User> findAll() {
        return findAll();
    }

    @Override
    default Optional<User> findById(Long id) {
        return findById(id);
    }

    @Override
    default User save(User user) {
        return save(user);
    }

    @Override
    default void deleteById(Long id) {
        deleteById(id);
    }
}
