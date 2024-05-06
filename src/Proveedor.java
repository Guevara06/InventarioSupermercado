public class Proveedor {

    //Creamos la clase proveedores para resgiatar a nuestros proveedores de cada supermercado con sus atributos nombre y numero de contacto.
    private String nombre;
    private long numeroContacto;

    // craeamos el contructor con los atributos.
    public Proveedor(String nombre, long numeroContacto) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
    }

    //Generamos los getters y setters respectivos de los atributos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Long numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
