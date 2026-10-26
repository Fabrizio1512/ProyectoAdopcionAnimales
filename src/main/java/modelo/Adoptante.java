package modelo;

public class Adoptante {
    private int idAdoptante;
    private String nombre;
    private String telefono;

    public Adoptante(int idAdoptante, String nombre, String telefono) {
        this.idAdoptante = idAdoptante;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters (Encapsulamiento)
    public int getIdAdoptante() { return idAdoptante; }
    public void setIdAdoptante(int idAdoptante) { this.idAdoptante = idAdoptante; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}