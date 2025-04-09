package sk.posam.fsa.service;

import sk.posam.fsa.model.User;
import sk.posam.fsa.repo.UserRepo;

public class UserSerice implements UserFacade{
    private final UserRepo userRepo;

    public UserSerice(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User get(long id) {
        return userRepo.get(id);
    }

    @Override
    public User get(String email) {
        return userRepo.get(email);
    }

    @Override
    public void create(User user) {
          userRepo.create(user);
    }
}
