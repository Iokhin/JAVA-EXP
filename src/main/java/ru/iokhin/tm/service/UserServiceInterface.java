package ru.iokhin.tm.service;

import ru.iokhin.tm.RoleType;

public interface UserServiceInterface {

    void addUser(RoleType roleType, String login, String password);
    void listUser();
    void removeUser(String id);
    void clearUser();
    void editUser(RoleType roleType ,String userId, String newLogin,
                  String newPasswordHash);

}
