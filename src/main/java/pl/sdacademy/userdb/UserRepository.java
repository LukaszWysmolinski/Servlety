package pl.sdacademy.userdb;

import java.util.List;

public interface UserRepository {

    void save(User user);

    List<User> getUsers();

}
