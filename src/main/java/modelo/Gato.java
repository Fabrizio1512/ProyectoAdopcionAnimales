package modelo;

public class Gato extends Animal {
    public Gato(int idAnimal, String nombre, int edad, int idAdoptante, String rutaImagen) {
        super(idAnimal, nombre, edad, idAdoptante, rutaImagen);
    }

    @Override
    public String mostrarDetallesAdopcion() {
        return "Gato: " + getNombre() + " (Edad: " + getEdad() + ")";
    }
}