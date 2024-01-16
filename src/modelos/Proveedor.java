package modelos;

public class Proveedor
{
    private int ID;
    private String cif,nombre,direccion,localidad,provincia;

    public Proveedor()
    {

    }

    public Proveedor(java.lang.String cif, java.lang.String nombre)
    {
        this.cif = cif;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "ID=" + ID +
                ", cif='" + cif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public java.lang.String getCif() {
        return cif;
    }
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }
    public java.lang.String getNombre() {
        return nombre;
    }
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }
    public java.lang.String getDireccion() {
        return direccion;
    }
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }
    public java.lang.String getLocalida() {
        return localidad;
    }
    public void setLocalidad(java.lang.String localida) {
        this.localidad = localida;
    }
    public java.lang.String getProvincia() {
        return provincia;
    }
    public void setProvincia(java.lang.String provincia) {
        this.provincia = provincia;
    }
}
