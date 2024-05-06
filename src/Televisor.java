
public class Televisor extends Producto {
    //La clase Televisor tambien hereda atributos y metodos de la clase Producto y su atributo propio sera marca.
    private String marca;

    // Se crea el constructor de Televisor con sus atributos heredados y su atributo propio.
    public Televisor(String marca, String fechaIngreso, long precioVenta, int Stock, String DistribucionEnTienda) {
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
    //Sobreescribimos los metodos heredados tomando en cuenta las caracteristicas porpias de la clase televisor.
    public void promocion(){
        System.out.println("Por la compra de 2 Televisores recibes un mueble totalmente gratis.");

    }
    public void almacenamiento(){
        System.out.println("Almacenar en una caja envuelta con hicopor para evitar daños al producto.");

    }

}
