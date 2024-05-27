// UBICACIÓN: C:\Users\ADRU\Desktop\Actividad 6\Act6\src\business\estrategia
package business.estrategia;

import data.model.User;

public interface ValidationStrategy {
    boolean validate(User user);
}