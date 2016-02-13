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
public class Fresco extends Producto {
    
    /**
     * Atributos 
     */
    private final String TIPO;
    
    //Métodos
    /**
     * Constructor
     * @param fechaCaducidad Fecha de caducidad del producto fresco
     * @param noLote Numero del lote del producto Fresco
     * @param tipo Tipo de producto fresco.
     */
    public Fresco(String fechaCaducidad, int noLote, String tipo) {
        super(fechaCaducidad, noLote);
        this.TIPO = tipo;
    }
    
    /**
     * Método que muestra el Tipo de Fresco
     * @return una cadena de caracteres que representa el tipo de fresco
     */
    public String getTipo(){
        return this.TIPO;
    }
    
}
