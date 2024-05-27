// UBICACIÓN: C:\Users\ADRU\Desktop\Actividad 6\Act6\src\presentacion
package presentacion;

import business.UserService;
import business.UserValidator;
import business.estrategia.EmailValidationStrategy;
import data.model.User;

import java.util.Scanner;

public class UserInterface {
    private UserService userService;

    public UserInterface() {
        UserValidator validator = new UserValidator();
        validator.setValidationStrategy(new EmailValidationStrategy());
        this.userService = new UserService(validator);
    }

    public void start() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        User user = new User(username, email);
        boolean isValid = userService.addUser(user);

        if (isValid) {
            System.out.println("User added successfully!");
        } else {
            System.out.println("User validation failed.");
        }
    }
}
