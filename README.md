# Pilares

#Abstraccion
#La abstracción es un principio fundamental de la programación orientada a objetos que permite simplificar y organizar
el código al definir clases y métodos que representan conceptos generales.
#Resultado--
![image](https://github.com/arianacatani2009/Pilares/assets/134402331/7d7eed66-d4ad-4ad8-bebe-5c41031a85e5)
#Cree una abstracción para representar diferentes tipos de vehículos, como automóviles y motocicletas. 
Utilizaremos una clase abstracta llamada Vehiculo y una interfaz llamada Motorizado para demostrar la abstracción.
#En este ejemplo, la clase abstracta Vehiculo define un conjunto de métodos y propiedades comunes para todos los vehículos, 
mientras que las clases concretas Automovil y Motocicleta extienden la clase Vehiculo y proporcionan implementaciones 
específicas para el método abstracto acelerar(). La interfaz Motorizado define los métodos encender() y apagar(), que son 
implementados por todas las clases.
#Esta estructura de clases e interfaces permite una abstracción efectiva al definir un conjunto de comportamientos comunes y especializados 
para diferentes tipos de vehículos.

#Encapsulamiento
#El encapsulamiento es uno de los principios fundamentales de la programación orientada a objetos, que implica ocultar los detalles 
internos de una clase y proporcionar acceso controlado a sus propiedades y métodos.
#Resultado--
![image](https://github.com/arianacatani2009/Pilares/assets/134402331/820d1ea8-8c68-407f-88bb-4ea25eb523b0)
#Crear una clase llamada Persona con propiedades privadas y métodos públicos 
para acceder y modificar esas propiedades de manera controlada a través de los métodos públicos.
#En este ejemplo, la clase Persona encapsula las propiedades nombre y edad al hacerlas privadas. 
Luego, proporciona métodos públicos (getNombre(), setNombre(), getEdad() y setEdad()) para acceder y modificar 
estas propiedades de manera controlada. El método setEdad() incluye una validación para asegurarse de que la edad no sea negativa.
#Este enfoque de encapsulamiento permite que los datos internos de la clase sean protegidos y solo puedan ser accedidos o modificados 
a través de métodos específicos, lo que facilita el mantenimiento, la validación y el control de la clase.
