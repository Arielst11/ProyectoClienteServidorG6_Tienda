/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.g6_clienteservidorproyecto;

/**
 *
 * @author asanc
 */
public class Objeto {
    private int codigoArticulo;
    private  float precioArticulo;
    private String nombreArticulo;
    private String descripcionArticulo;
    private int cantidadArticulo;
    
    
    /**
     * @return the codigoArticulo
     */
    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    /**
     * @param codigoArticulo the codigoArticulo to set
     */
    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    /**
     * @return the precioArticulo
     */
    public float getPrecioArticulo() {
        return precioArticulo;
    }

    /**
     * @param precioArticulo the precioArticulo to set
     */
    public void setPrecioArticulo(float precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    /**
     * @return the nombreArticulo
     */
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    /**
     * @param nombreArticulo the nombreArticulo to set
     */
    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    /**
     * @return the descripcionArticulo
     */
    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    /**
     * @param descripcionArticulo the descripcionArticulo to set
     */
    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    /**
     * @return the cantidadArticulo
     */
    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    /**
     * @param cantidadArticulo the cantidadArticulo to set
     */
    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }
   
    
    public void datosObjeto(int codigoArticulo, float precioArticulo, String nombreArticulo, String descripArticulo, int cantArticulo){
     this.codigoArticulo = codigoArticulo;
     this.precioArticulo = precioArticulo;
     this.nombreArticulo = nombreArticulo;
     this.descripcionArticulo = descripArticulo;
     this.cantidadArticulo = cantArticulo;
    }    
    
}
