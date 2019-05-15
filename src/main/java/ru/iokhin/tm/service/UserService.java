package ru.iokhin.tm.service;

import ru.iokhin.tm.RoleType;
import ru.iokhin.tm.entity.User;
import ru.iokhin.tm.repository.UserRepository;

public class UserService implements UserServiceInterface {

    UserRepository ur;

    public UserService(UserRepository ur) {
        this.ur = ur;
    }


    @Override
    public void addUser(RoleType roleType, String login, String password) {
        ur.add(new User(roleType, login, password));
    }

    @Override
    public void listUser() {
        ur.list();
    }

    @Override
    public void removeUser(String userId) {
        for (User user : ur.userMap.values()) {
            if (user.getUserId().equals(userId)) {
                ur.delete(userId);
                return;
            }
        }
    }

    @Override
    public void clearUser() {
        ur.clear();
    }

    @Override
    public void editUser(RoleType roleType, String userId, String newLogin, String newPasswordHash) {
        for (User user : ur.userMap.values()) {
            if (user.getUserId().equals(userId)) {
                User newUser = new User(roleType, newLogin, newPasswordHash);
                ur.merge(newUser);
                return;
            }
        }
    }
}
