package vimal.springbootasync.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import vimal.springbootasync.domain.User;

import javax.persistence.Entity;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findAllByFirstName(String name);

    @Async
    public CompletableFuture<List<User>> findAllByLastName(String name);
}

