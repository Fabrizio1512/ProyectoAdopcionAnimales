package modelo;

public abstract class Animal {
    private int idAnimal;
    private String nombre;
    private int edad;
    private int idAdoptante; 
    private String rutaImagen; // Atributo para cargar la foto en la Vista

    public Animal(int idAnimal, String nombre, int edad, int idAdoptante, String rutaImagen) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.edad = edad;
        this.idAdoptante = idAdoptante;
        this.rutaImagen = rutaImagen;
    }

    // Método abstracto para aplicar Polimorfismo
    public abstract String mostrarDetallesAdopcion();

    // Getters y Setters
    public int getIdAnimal() { return idAnimal; }
    public void setIdAnimal(int idAnimal) { this.idAnimal = idAnimal; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int getIdAdoptante() { return idAdoptante; }
    public void setIdAdoptante(int idAdoptante) { this.idAdoptante = idAdoptante; }
    public String getRutaImagen() { return rutaImagen; }
    public void setRutaImagen(String rutaImagen) { this.rutaImagen = rutaImagen; }
}