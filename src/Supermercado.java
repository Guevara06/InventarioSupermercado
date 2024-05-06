public class Supermercado implements Reporte {
    //Creamos una clase supermercado donde se integraran las demas clases (Carne, Televisor, Jeans,Muebles. Clientes y Proveedor),
    //Supermercado tendra atributos propios nomre, ubicacion y costos.
    private String nombre;
    private String UbicacionDeTienda;
    private double costos;
    private Cliente cliente;
    private Proveedor proveedor;
    private Carne carne;
    private Televisor tv;
    private Jeans jean;
    private Muebles mueble;

    //creamos una variable que guardara nuestro Stock general.
    private double sumaStock;


    //Generamos el contructor de supermercado.
    public Supermercado(String nombre, String ubicacionDeTienda, double CostosGenerales ) {
        this.nombre = nombre;
        this.UbicacionDeTienda = ubicacionDeTienda;
        this.costos= CostosGenerales;

    }

    //Generamos los Getters y los Setters de la calse que integradora Supermercado para acceder y editar la inforacion segun sean las necesidades.
    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) {
        this.costos = costos;
    }



    public double getSumaStock() {
        return sumaStock;
    }

    public void setSumaStock(double sumaStock) {
        this.sumaStock = sumaStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carne getCarne() {
        return carne;
    }

    public void setCarne(Carne carne) {
        this.carne = carne;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Jeans getJean() {
        return jean;
    }

    public void setJean(Jeans jean) {
        this.jean = jean;
    }

    public Muebles getMueble() {
        return mueble;
    }

    public void setMueble(Muebles mueble) {
        this.mueble = mueble;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Televisor getTv() {
        return tv;
    }

    public void setTv(Televisor tv) {
        this.tv = tv;
    }

    public String getUbicacionDeTienda() {
        return UbicacionDeTienda;
    }

    public void setUbicacionDeTienda(String ubicacionDeTienda) {
        UbicacionDeTienda = ubicacionDeTienda;
    }

    // generamos un toString que imprimira en pantalla la informacion general de cada supermercado.
    @Override
    public String toString() {
        return "Supermercado: "+ nombre + " Ubicacion: " + UbicacionDeTienda + '\n'+
                "Jeans: " +  " Marca:" + jean.getMarca()+ " Precio venta: "+ jean.getPrecioVenta()+"$ "+ " Existencia en la tienda: "+ jean.getStock()+" unidades" + " Ubicacion en la tienda: "+ jean.getDistribucionEnTienda()+'\n'+
                "Carne: " + " Tipo de carne: " + carne.getTipoCarne()+ " Precio venta: "+ carne.getPrecioVenta()+"$ "+ " Existencia en la tienda: "+ carne.getStock()+" libras "+ " Ubicacion en la tienda: "+ carne.getDistribucionEnTienda()+ '\n'+
                "Muebles: " + " Marca: " + mueble.getMarca()+ " Precio venta: "+ mueble.getPrecioVenta()+"$ "+ " Existencia en la tienda unidades: "+ mueble.getStock()+" unidades"+ " Ubicacion en la tienda: "+ mueble.getDistribucionEnTienda()+ '\n'+
                "Televisores: " + " Marca: " + tv.getMarca()+ " Precio venta: "+ tv.getPrecioVenta()+"$ "+ " Existencia en la tienda unidades: "+ tv.getStock()+" unidades"+ " Ubicacion en la tienda: "+ tv.getDistribucionEnTienda()+'\n'+
                "Clientes Registrados: nombre: " +cliente.getNombre()+" identificacion: " + cliente.getID()+'\n'+
                "Proveedores: nombre:" + proveedor.getNombre()+ " numero de contacto "+ proveedor.getNumeroContacto()

                ;
    }
    //implementamos los metodos de la interfaz Reporte para generar el reporte de inventario personalizado en cada supermercado.
    @Override

    // El Stock general me sumara el todos los stocks de ls productos para saber cuantos productos en total hay en el supermercado.
    public void StockGeneral() {
       setSumaStock(carne.getStock() + mueble.getStock()+ tv.getStock()+ jean.getStock());
        System.out.println("El total de productos en Stock de : "+ getNombre()+ " es de "+ getSumaStock() + " unidades y/o libras.");
    }

    // los costos generales me sumara lso precios de venta de todos los productos y los dividira en dos para sacar el costo de los insumos,
    //y lo sumara con los costos generales para dar untotal de costos mensuales.
    @Override
    public void CostosGenerales() {
        setCostos( carne.getPrecioVenta() + mueble.getPrecioVenta()+ tv.getPrecioVenta()+ jean.getPrecioVenta()/2 + getCostos());
        System.out.println("Los costos (servios publicos, logistica, personal y surtido)  mensuales del " + getNombre()+ " son de: " + getCostos()+ "$");

    }

    //la Distribucion en tienda general mostrara la informacion donde se puede encontrar cada producto en el supermercado.
    @Override
    public void DistribucionEnTiendaGeneral() {
        System.out.println("las ubicaciones en tienda de forma general en el: "+ getNombre()+ '\n'+
                            carne.getTipoCarne()+ " se encuentra en: "+ carne.getDistribucionEnTienda()+ '\n'+
                            tv.getMarca()+ " se encuentra en: "+ tv.getDistribucionEnTienda() +'\n'+
                            jean.getMarca()+ " se encuentra en: "+ jean.getDistribucionEnTienda() +'\n'+
                            mueble.getMarca()+ " se encuentra en: "+ mueble.getDistribucionEnTienda())
        ;

    }

    // El Desempeño de las ventas mostara la informacion de la ventas en lso ultimos meses.

    @Override
    public void DesempenoDeVentas() {
        System.out.println("El desempeño de las ventas en los ultimos meses en "+ getNombre()+" ha sido favorable.");

    }

    //el ciclo de vida dara informacion detalla del periodo de utilidad de cada producto.

    @Override
    public void cicloDeVida() {
        System.out.println("Analisis de ciclos de vida segun el producto: \n"+
            "La carne: "+carne.getTipoCarne()+ ": su clico de vida es max 4 dias si se respetan sus condiciones de almacenamiento. \n"+
            "El Televisor: "+tv.getMarca()+ ": su ciclo de vida oscila entre las 10.000 y 60.000 horas de uso.\n"+
            "Los Jeans: "+jean.getMarca()+ ": su ciclo de vida es max 10 años, si se respeta las recomendaciones del fabricante.\n"+
            "Los Muebles: "+mueble.getMarca()+": su ciclo de vida esta entre los 5 y 20 años, dependiendo de sus cuidados.");

    }
}
