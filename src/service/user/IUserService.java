package service.user;

import model.User;
import service.IGenerateService;

public interface IUserService extends IGenerateService<User> {
    boolean existedByUsername(String username);
    boolean existedByEmail(String email);
    boolean checkLogin(String username, String password);

    User getCurrentUser();

    void saveCurrentUser(User user);

    User findByUsername(String username);

}
