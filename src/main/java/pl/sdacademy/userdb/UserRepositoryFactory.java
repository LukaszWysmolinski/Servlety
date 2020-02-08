package pl.sdacademy.userdb;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryFactory {

    private static List<User> users = new ArrayList<>();

    public static UserRepository getInstance() {
        return new UserRepository() {
            @Override
            public void save(User user) {
                users.add(user);
            }

            @Override
            public List<User> getUsers() {
                return users;
            }
        };
    }
}
