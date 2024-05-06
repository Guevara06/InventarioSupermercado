public class Cliente {

    //Creamos nuestra clase Cliente para guaradar a nuestros clientes registados en cada supermercado con sus atributos nombre y ID.
    private String nombre;
    private long ID;

    // craeamos el contructor con los atributos.
    public Cliente(String nombre ,long ID) {
        this.nombre = nombre;
        this.ID = ID;

    }
    //Generamos los respetivos getter y setters para sus atributos.

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
