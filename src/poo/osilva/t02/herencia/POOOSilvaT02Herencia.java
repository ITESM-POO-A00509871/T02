/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.osilva.t02.herencia;

/**
 *
 * @author A00509871
 */
public class POOOSilvaT02Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fresco cebolla = new Fresco("17/Febrero/2016",100, "Hortaliza");
        Refrigerado queso = new Refrigerado("17/Febrero/2016",207,1.02);
        CongeladoNitrogeno pescado = new CongeladoNitrogeno("18/Febrero/2016",302,-22,true);
        CongeladoAgua carne = new CongeladoAgua("18/Febrero/2016",305,-19);
        CongeladoAire fresas = new CongeladoAire("18/Febrero/2016",312,-4,"Plástico");
        
        System.out.println("CEBOLLA");
        caracteristicasFresco(cebolla);
        
        System.out.println("\nQUESO");
        caracteristicasRefrigerado(queso,2);
        
        System.out.println("\nPESCADO");
        caracteristicasCongeladoNitrogeno(pescado,-15);
        
        System.out.println("\nFRESAS");
        caracteristicasCongeladoAire(fresas,-3.5);
        
        System.out.println("\nCARNE");
        caracteristicasCongeladoAgua(carne,-18);
        carne.setTipoSistema("SUPERFICIE RASCADA");
        System.out.println("\n-- SE AGREGÓ TIPO DE SISTEMA --\n");
        caracteristicasCongeladoAgua(carne,-18);
    }
    
    // Método para mostrar las características de un objeto de clase Producto
    public static void caracteristicasProducto(Producto p1){
        System.out.println("FECHA CADUCIDAD: " + p1.getFechaCaducidad());
        System.out.println("NO. DE LOTE: " + p1.getNoLote());
    }
    
    // Método para mostrar las Características de un objeto de Clase Fresco
    public static void caracteristicasFresco(Fresco f1){
        System.out.println("= PRODUCTO FRESO =");
        caracteristicasProducto(f1);
        System.out.println("TIPO: " + f1.getTipo());
    }
    
    // Método para mostrar las caracteristicas de un producto refrigerado y 
    // mostrar la humedad sobrante para que el refrigerado se conserve mejor
    public static void caracteristicasRefrigerado(Refrigerado r1, double humedadActual){
        System.out.println("= PRODCUTO REFRIGERADO =");
        caracteristicasProducto(r1);
        System.out.println("%HUMEDAD RECOMENDADA: " + r1.getHumedadOptima());
        System.out.println("%HUMEDAD ACTUAL: " + humedadActual);
        System.out.println("%HUMEDAD ACTUAL SOBRANTE: " + r1.difHumedadActualOptima(humedadActual));
    }
    
    // Método para mostrar las características de un producto congelado y 
    // Mostrar los grados sobrantes para que este en la mejor temperatura
    public static void caracteristicasCongelado(Congelado c1, double temperaturaActual){
        caracteristicasProducto(c1);
        System.out.println("TEMPERATURA RECOMENDADA: " + c1.getTemperaturaOptimaCongelacion());
        System.out.println("TEMPERATURA ACTUAL: " + temperaturaActual);
        System.out.println("TEMPERATURA SOBRANTE: " + c1.difTemperaturaActualOptima(temperaturaActual));
    }
    
    //Método para mostrar las características de un producto congelado por agua y 
    // Mostrar los grados sobrantes para que este en la mejor temperatura
    public static void caracteristicasCongeladoAgua(CongeladoAgua ca1, double temperaturaActual){
        System.out.println("= PRODCUTO CONGELADO POR AGUA =");
        if(ca1.tieneTipoSistema()){
            System.out.println("TIPO DE SISTEMA: " + ca1.getTiposistema());
        }
        caracteristicasCongelado(ca1,temperaturaActual);
    }     
    
    // Método para mostrar las caracteristicas de un producto congelado por aire y 
    // Mostrar los grados sobrantes para que este en la mejor temperatura
    public static void caracteristicasCongeladoAire(CongeladoAire ca1, double temperaturaActual){
        System.out.println("= PRODCUTO CONGELADO POR AIRE =");
        System.out.println("MATERIAL DEL ENVASE: " + ca1.getMaterialEnvase());
        caracteristicasCongelado(ca1,temperaturaActual);
    }   
    
    // Método para mostrar las características de un producto congelado por nitrogeno y 
    // Mostrar los grados sobrantes para que este en la mejor temperatura
    public static void caracteristicasCongeladoNitrogeno(CongeladoNitrogeno cn1, double temperaturaActual){
        System.out.println("= PRODCUTO CONGELADO POR NITROGENO =");        
        System.out.println("OCUPA TRANSPORTE ESPECIAL: " + cn1.necesitaTransporteEspecial());
        caracteristicasCongelado(cn1,temperaturaActual);
    }
}