
package DATOS;

public class vproductos {
    private int idProductos;       //declaracion de las variables producto
    private String nombre;
    private String descripcion;
    private Double precio;

    public vproductos() {
    }

    public vproductos(int idProductos, String nombre, String descripcion, Double precio) {
        this.idProductos = idProductos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}

