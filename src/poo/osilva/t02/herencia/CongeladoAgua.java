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
public class CongeladoAgua extends Congelado{
    
    //Atributos    
    private String tipoSistema;

    //Metodos
    /**
     * Constructor
     * @param fechaCaducidad Cadena de caracteres que representa la fecha de caducidad
     * @param noLote Entero que representa el numero de lote
     * @param temperaturaOptimaC double que representa la temperatura óptima de congelación
     *                           del producto
     */
    public CongeladoAgua(String fechaCaducidad, int noLote, double temperaturaOptimaC) {
        super(fechaCaducidad, noLote, temperaturaOptimaC);
    }
    
    /**
     * Constructor
     * @param fechaCaducidad Cadena de caracteres que representa la fecha de caducidad
     * @param noLote Entero que representa el numero de lote
     * @param temperaturaOptimaC double que representa la temperatura óptima de congelación
     *                           del producto
     * @param tipoSistema Cadena de caracteres con el tipo de sistema de congelación
     *                      de agua
     */
    public CongeladoAgua(String fechaCaducidad, int noLote, double temperaturaOptimaC, String tipoSistema) {
        super(fechaCaducidad, noLote, temperaturaOptimaC);
        this.tipoSistema = tipoSistema;
    }
    
    /**
     * Método que define el tipo de Sistema de congelado de agua
     * @param tipoSistema Cadena de caracteres con el tipo de sistema de congelado
     *                    del producto
     */
    public void setTipoSistema(String tipoSistema){
        this.tipoSistema = tipoSistema;
    }
    
    /**
     * Método para obtener cuál fue el tipo de sistema del producto
     * @return Una cadena de caracteres con el tipo de Sistema del producto congelado
     *          por agua
     */
    public String getTiposistema(){
        return this.tipoSistema;
    }
    
    /**
     * Método que dice si se le ha asignado algún tipo de sistema al producto.
     * @return true si hay algun dato en tipoSistema, false en caso contrario
     */
    public boolean tieneTipoSistema(){
        return this.tipoSistema != null;
    }
}
