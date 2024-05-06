

public class Jeans extends Producto {
    //La clase Jeans tambien hereda atributos y metodos de la clase Producto y su atributo propio sera marca.
    private String Marca;

    //Se crea el constructor de Televisor con sus atributos heredados y su atributo propio.
    public Jeans(String marca,String fechaIngreso, long precioVenta, int Stock, String DistribucionEnTienda) {
        super(fechaIngreso, precioVenta, Stock, DistribucionEnTienda);
        this.Marca = marca;
    }

    //Se Generan sus respectivos Getters y Setters de Marca.
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    //Sobreescribimos los metodos heredados tomando en cuenta las caracteristicas porpias de la clase Jeans.
    public void promocion(){
        System.out.println("Por la compra de 3 jeans se descuentan 30% al total");

    }
    public void almacenamiento(){
        System.out.println("Los Jeans en su almacenamiento deben ser envueltos en plástico para su protección y seguridad.");

    }

}
