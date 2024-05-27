PASOS PARA CORRER EL PROYECTO 
1.- Clonar el repositorio, copiar "https://github.com/adruRR/Actividad_6.git"
2.- Hacer correr de la clase Main.java

Resumen de caso de uso y funcionalidades.

Módulo de gestión de usuarios como caso de uso y lo implementaremos en Java siguiendo una arquitectura de 3 capas, respetando los principios SOLID y aplicando patrones de diseño creacionales, estructurales y de comportamiento.

•	Arquitectura de Tres Capas.
	*Capa de Presentación (Presentation Layer): Interactúa con el usuario. En este caso, será una interfaz de terminal simple.
	*Capa de Lógica de Negocios (Business Logic Layer): Contiene la lógica de negocio. Implementaremos aquí los principios SOLID y los patrones de diseño.
	*Capa de Acceso a Datos (Data Access Layer): Simula la base de datos en memoria.
•	Principios SOLID
	*Single Responsibility Principle (SRP): Cada clase debe tener una única responsabilidad.
	*Open/Closed Principle (OCP): Las clases deben estar abiertas para extensión, pero cerradas para modificación.
	*Liskov Substitution Principle (LSP): Los objetos de una clase derivada deben poder sustituir a los objetos de su clase base.
	*Interface Segregation Principle (ISP): Los clientes no deben estar obligados a depender de interfaces que no usan.
	*Dependency Inversion Principle (DIP): Las clases deben depender de abstracciones, no de concreciones.
•	Patrones de Diseño
	*Creacional: Utilizaremos el patrón Singleton para la gestión de la instancia del DAO.
	*Estructural: Aplicaremos el patrón Facade para simplificar la interacción con la capa de negocio desde la capa de presentación.
	*De Comportamiento: Usaremos el patrón Estrategia para la validación de usuarios.

Resumen de cumplimiento de SOLID, Patrones y Arquitectura.
Arquitectura de Tres Capas: La estructura de carpetas refleja la separación entre las capas de presentación, lógica de negocio y acceso a datos.
Principios SOLID:
•	SRP: Cada clase tiene una única responsabilidad (`UserService` se encarga de la lógica de     negocio relacionada con usuarios).
•	OCP: Las clases como `UserValidator` y `UserService` son abiertas para extensión mediante estrategias y nuevas implementaciones.
•	LSP: Las clases derivadas de `ValidationStrategy` pueden sustituirla sin romper la funcionalidad.
•	ISP: Las interfaces están bien definidas y segmentadas (e.g., `ValidationStrategy`).
•	DIP: Las clases dependen de abstracciones (`ValidationStrategy` en lugar de una clase concreta).
Patrones de Diseño:
•	Singleton: [UserDao] asegura una única instancia de la base de datos simulada.
•	Facade: [UserService] simplifica la interacción entre la capa de presentación y la capa de datos.
•	Strategy: [UserValidator] utiliza estrategias de validación que pueden ser intercambiadas dinámicamente.

 Tecnologías usadas.
•	Lenguaje: Java
•	IDE: IntelliJ IDEA,VisualStudio (o cualquier otro IDE de Java)

