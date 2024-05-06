
public class Muebles extends Producto {
    //La clase Muebles tambien hereda atributos y metodos de la clase Producto y su atributo propio sera marca.
    private String marca;

    // Se crea el constructor de Muebles con sus atributos heredados y su atributo propio.
    public Muebles(String marca, String fechaIngreso, long precioVenta, int Stock, String DistribucionEnTienda) {
        super(fechaIngreso, precioVenta, Stock, DistribucionEnTienda);
        this.marca = marca;
    }

    //Se Generan sus respectivos Getters y Setters de Marca.
    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }


    //Sobreescribimos los metodos heredados tomando en cuenta las caracteristicas porpias de la clase Muebles.
    public void promocion(){
        System.out.println("Por la compra de 2 muebles te llevas un jean.");

    }
    public void almacenamiento(){
        System.out.println("Debe ser en cajas de cartón o plástico si se quieren conservar los muebles en buen estado.");

    }
}
