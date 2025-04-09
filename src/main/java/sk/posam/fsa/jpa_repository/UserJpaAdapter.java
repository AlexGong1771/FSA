package sk.posam.fsa.jpa_repository;

import sk.posam.fsa.model.User;
import sk.posam.fsa.repo.UserRepo;

import java.util.Optional;

public class UserJpaAdapter implements UserRepo {
    private final JpaUserRepo jpaUserRepo;

    public UserJpaAdapter(JpaUserRepo jpaUserRepo) {
        this.jpaUserRepo = jpaUserRepo;
    }

    @Override
    public User get(long id) {
        Optional<User> user = jpaUserRepo.findById(id);
        return user.orElse(null);
    }

    @Override
    public User get(String email) {
        Optional<User> user = jpaUserRepo.findByEmail(email);
        return user.orElse(null);
    }

    @Override
    public void create(User user) {
        jpaUserRepo.save(user);
    }
}
