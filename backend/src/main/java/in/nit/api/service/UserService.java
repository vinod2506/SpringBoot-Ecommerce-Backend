package in.nit.api.service;


import java.util.Collection;

import in.nit.api.entity.User;

/**
 * Created By Zhu Lin on 3/13/2018.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
