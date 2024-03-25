public class Clothing
{
    private String descripcion;
    private double precio;
    private String talle="M";

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
}
