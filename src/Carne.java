
public class Carne extends Producto {

    //Nuestra clase Carne que heredara y extedera todos los atributos y metodos de Porducto, tendra una atributo propio TipoCarne.
    private String tipoCarne;

    // Se crea el constructor de Carne con sus atributos heredados y su atributo propio
    public Carne(String tipoCarne,String fechaIngreso, long precioVenta, int Stock, String DistribucionEnTienda) {
        super(fechaIngreso, precioVenta, Stock, DistribucionEnTienda);
        this.tipoCarne = tipoCarne;
    }
    //Se Generan sus respectivos Getters y Setters de TipoCarne.
    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }
    // Sobreescribimos en los metodos heredados para adaptarlos a las caracteristicas de la clase carne.
    public void promocion(){
        System.out.println("por la compra de 2 libras te llevas 3.");

    }
    public void almacenamiento(){
        System.out.println("Almacenar en una temperatura de refrigeración (0 a 4° C) o congelación (-18 °C).");

    }

    //creamos un metodo propio en la clase Carne llamado caducidad ya que es necesario por la naturaleza de la clase.
    public void caducidad(){
        System.out.println("Despues de 4 dias de su ingreso al supermercado si no ha sido comprado el producto debe ser retirado por que ya ha caducado.");

    }


}
