// UBICACIÓN: C:\Users\ADRU\Desktop\Actividad 6\Act6\src\business
package business;

import business.estrategia.ValidationStrategy;
import data.model.User;

public class UserValidator {
    private ValidationStrategy strategy;

    public void setValidationStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(User user) {
        return strategy.validate(user);
    }
}