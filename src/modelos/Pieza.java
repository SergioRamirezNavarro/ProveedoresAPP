package modelos;

public class Pieza
{
    private int ID;
    private String nombre,color;
    private Double precio;
    private Categoria categoria;

    public Pieza(String nombre, String color, Double precio)
    {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
}
