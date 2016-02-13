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
public class CongeladoNitrogeno extends Congelado{
    
    //Atributos
    private final boolean TRANSPORTE_ESPECIAL;

    /**
     * Constructor
     * @param fechaCaducidad Cadena de Strins que representa la fecha de caducidad
     *                       del producto
     * @param noLote Entero con el numero de lote del producto
     * @param temperaturaOptimaC double que representa la temperatura óptima de congelación
     *                           del producto
     * @param transporteEspecial boolean que es "True" si el producto
     *                                   necesita de transporte especial
     */
    public CongeladoNitrogeno(String fechaCaducidad, int noLote,
            double temperaturaOptimaC, boolean transporteEspecial) {
        super(fechaCaducidad, noLote, temperaturaOptimaC);        
        this.TRANSPORTE_ESPECIAL = transporteEspecial;
    }
    
    /**
     * Metodo que dice si el producto necesita o no de tranporte especial
     * @return Un boolean, regresa True si el producto necesita de transporte
     *          especial, False en caso contrario
     */
    public boolean necesitaTransporteEspecial(){
        return this.TRANSPORTE_ESPECIAL;
    }

}
