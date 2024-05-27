// UBICACIÓN: C:\Users\ADRU\Desktop\Actividad 6\Act6\src\business
package business;

import data.UserDao;
import data.model.User;

public class UserService {
    private UserDao userDao;
    private UserValidator validator;

    public UserService(UserValidator validator) {
        this.userDao = UserDao.getInstance();
        this.validator = validator;
    }

    public boolean addUser(User user) {
        if (validator.validate(user)) {
            userDao.saveUser(user);
            return true;
        }
        return false;
    }
}