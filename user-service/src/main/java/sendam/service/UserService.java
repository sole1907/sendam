package sendam.service;

import sendam.user.User;

/**
 * Created by ayansolaakanmu on 24/12/2017.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
