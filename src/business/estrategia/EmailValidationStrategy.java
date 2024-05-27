// UBICACIÓN: C:\Users\ADRU\Desktop\Actividad 6\Act6\src\business\estrategia
package business.estrategia;

import data.model.User;

public class EmailValidationStrategy implements ValidationStrategy {
    @Override
    public boolean validate(User user) {
        return user.getEmail().contains("@");
    }
}