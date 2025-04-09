package sk.posam.fsa.repo;

import sk.posam.fsa.model.User;

public interface UserRepo {
    User get(long id);

    User get(String email);

    void create(User user);
}
