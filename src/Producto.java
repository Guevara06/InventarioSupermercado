
public abstract class Producto {

    // Creamos la clase abstracta Producto con los atributos que comparten y heredan nuestras demanas clases (Carne,Televisor,Jeans, Muebles).
    public long precioVenta;
    public String FechaIngreso;
    public int Stock;
    public String DistribucionEnTienda;

// Creamos el contructor de Producto con los atributos ya estipulados.
    public Producto( String fechaIngreso, long precioVenta, int Stock, String DistribucionEnTienda ) {
        this.FechaIngreso = fechaIngreso;
        this.precioVenta = precioVenta;
        this.Stock = Stock;
        this.DistribucionEnTienda =DistribucionEnTienda;
    }


//Generamos los Getters y Setter de nuestros atributos para llamarlos y editarlos si es necesario.
    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }


    public long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDistribucionEnTienda() {
        return DistribucionEnTienda;
    }

    public void setDistribucionEnTienda(String distribucionEnTienda) {
        DistribucionEnTienda = distribucionEnTienda;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    //Se crearon dos metodos vacios que cada clase hija utlizara de forma diferente segun sus caracteristicas propias.
    public void promocion(){

    }
    public void almacenamiento(){

    }



}
