// UBICAIÓN: C:\Users\ADRU\Desktop\Actividad 6\Act6\src\data
package data;
import data.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static UserDao instance;
    private List<User> users;

    private UserDao() {
        this.users = new ArrayList<>();
    }

    public static UserDao getInstance() {
        if (instance == null) {
            instance = new UserDao();
        }
        return instance;
    }

    public void saveUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}