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
public class Producto {
    
    /**
     * Atributos
     * La Fecha de caducidad y el numero de lote son constantes,
     * ya que no cambian y deben ingresarse en cada producto.
     */
    private final String FECHA_CADUCIDAD;
    private final int NO_LOTE;
    
    /**
     * Métodos
     */
    /**
     * Constructor
     * @param fechaCaducidad Se ingresa el texto con la fecha de caducidad
     * @param noLote Se ingrela el texto con el número de lote del producto
     */
    public Producto(String fechaCaducidad, int noLote){
       this.FECHA_CADUCIDAD = fechaCaducidad;
       this.NO_LOTE = noLote;
    }
    
    /**
     * Método que permite ver cuál es la fecha de caducidad del producto
     * @return la fecha de caducidad del producto
     */
    public String getFechaCaducidad(){
        return this.FECHA_CADUCIDAD;
    }
    
    /**
     * Método que muyestra el numero de lote al que pertenece el producto
     * @return El numero entero del lote al que pertenece el producto
     */
    public int getNoLote(){
        return this.NO_LOTE;
    }    
}
