package modelo;

public class Perro extends Animal {
    public Perro(int idAnimal, String nombre, int edad, int idAdoptante, String rutaImagen) {
        super(idAnimal, nombre, edad, idAdoptante, rutaImagen);
    }

    @Override
    public String mostrarDetallesAdopcion() {
        return "Perro: " + getNombre() + " (Edad: " + getEdad() + ")";
    }
}