// Definición de la interfaz Motorizado
interface Motorizado {
    void encender();
    void apagar();
}

// Clase abstracta Vehiculo que implementa la interfaz Motorizado
abstract class Vehiculo implements Motorizado {
    protected String marca;
    protected String modelo;
    protected boolean encendido;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }

    public void encender() {
        if (!encendido) {
            System.out.println("El vehículo está encendido.");
            encendido = true;
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            System.out.println("El vehículo está apagado.");
            encendido = false;
        } else {
            System.out.println("El vehículo ya está apagado.");
        }
    }

    // Método abstracto para acelerar el vehículo
    abstract void acelerar();
}

// Clase concreta que extiende la clase Vehiculo
class Automovil extends Vehiculo {
    public Automovil(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void acelerar() {
        if (encendido) {
            System.out.println("El automóvil está acelerando.");
        } else {
            System.out.println("No se puede acelerar, el automóvil está apagado.");
        }
    }
}

// Clase concreta que extiende la clase Vehiculo
class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void acelerar() {
        if (encendido) {
            System.out.println("La motocicleta está acelerando.");
        } else {
            System.out.println("No se puede acelerar, la motocicleta está apagada.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", "Corolla");
        Motocicleta moto = new Motocicleta("Honda", "CBR");

        auto.encender();
        auto.acelerar();
        auto.apagar();

        moto.encender();
        moto.acelerar();
        moto.apagar();
    }
}
