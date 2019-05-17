package ru.iokhin.tm.repository;

import org.jetbrains.annotations.NotNull;
import ru.iokhin.tm.api.IUserRepository;
import ru.iokhin.tm.entity.User;

import java.util.HashMap;
import java.util.Map;

public final class UserRepository implements IUserRepository {

    @NotNull
    public Map<String, User> userMap = new HashMap<>(0);

    @Override
    public void add(@NotNull User user) {
        userMap.put(user.getUserId(), user);
    }

    @Override
    public void list() {

        @NotNull
        int i = 0;

        for (@NotNull User user : userMap.values()) {
            System.out.println(++i + ". " + user.getLogin() + ", " + user.getUserId());
        }
    }

    @Override
    public void merge(@NotNull User user) {
        userMap.put(user.getUserId(), user);
    }

    @Override
    public void delete(@NotNull String id) {
        userMap.remove(id);
    }

    @Override
    public void clear() {
        userMap.clear();
    }

    @NotNull
    public Map<String, User> getUserMap() {
        return userMap;
    }
}