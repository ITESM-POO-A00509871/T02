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
public class CongeladoAire extends Congelado{
    
    //Atributos
    private final String MATERIAL_ENVASE;

    //Metodos
    /**
     * Constructor
     * @param fechaCaducidad String con la fecha de caducidad del producto
     * @param noLote int con el Numero de lote del producto
     * @param temperaturaOptimaC double con la temperatura óptima de congelamiento
     *                           del producto
     * @param materialEnvase String con el tipo de mateial del envase en el que esta
     */
    public CongeladoAire(String fechaCaducidad, int noLote,
            double temperaturaOptimaC, String materialEnvase) {
        super(fechaCaducidad, noLote, temperaturaOptimaC);
        this.MATERIAL_ENVASE = materialEnvase;
    }
    
    /**
     * Método para obtener el tipo de material del envase en el que esta el 
     * producto
     * @return Un String con el material del envase de ese producto
     */
    public String getMaterialEnvase(){
        return this.MATERIAL_ENVASE;
    }        
}
