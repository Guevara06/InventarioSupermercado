
public class Main {
    public static void main(String[] args) {
        //Creamos dos objetos de supermacado que son supermercado 1 y supermercado 2,
        // creamos e imprimimos en consola su informacion general y el resporte de inventario de cada uno.

        Supermercado Supermercado1 = new Supermercado("Supermercado 1","Bogota",1000);
        Supermercado1.setCarne(new Carne(" pescado", "24/05/2023",  5,  10, " Pasillo 3"));
        Supermercado1.setTv( new Televisor( " LG"," 20/05/2023",500,  5," Pasillo 1"));
        Supermercado1.setJean(new Jeans(" Levis", " 10/05/2023",100, 8, " Pasillo 2"));
        Supermercado1.setMueble(new Muebles(" DitriHogar"," 02/03/2023", 600, 4, " Pasillo 4"));
        Supermercado1.setCliente(new Cliente(" Andres Perez", 12345));
        Supermercado1.setProveedor( new Proveedor(" DistribuidorTodo S.A", 99999999));

        System.out.println(Supermercado1.toString());
        System.out.println('\n');
        System.out.println("Reporte Inventario:");
        Supermercado1.StockGeneral();
        Supermercado1.CostosGenerales();
        Supermercado1.DistribucionEnTiendaGeneral();
        Supermercado1.DesempenoDeVentas();
        Supermercado1.cicloDeVida();

        System.out.println("-----------------------------------------------------------------------------------------------");

        Supermercado Supermercado2 = new Supermercado("Supermercado 2","Ciudad De Mexico", 1500);
        Supermercado2.setCarne( new Carne (" Cerdo"," 05/05/2024",8, 15," Pasillo 4"));
        Supermercado2.setTv(new Televisor(" Samsung", " 25/07/2023",550,7," Pasillo 2"));
        Supermercado2.setJean(new Jeans(" GEF", " 10/12/2023",99,5," Pasillo 1"));
        Supermercado2.setMueble(new Muebles(" Alameda"," 01/01/2024",650,3," Pasillo 3"));
        Supermercado2.setCliente(new Cliente(" Juana Ramirez", 6789));
        Supermercado2.setProveedor(new Proveedor(" DistribuidorMex S.A", 777777777));

        System.out.println(Supermercado2.toString());
        System.out.println('\n');
        System.out.println("Reporte Inventario:");
        Supermercado2.StockGeneral();
        Supermercado2.CostosGenerales();
        Supermercado2.DistribucionEnTiendaGeneral();
        Supermercado2.DesempenoDeVentas();
        Supermercado2.cicloDeVida();

    }

}