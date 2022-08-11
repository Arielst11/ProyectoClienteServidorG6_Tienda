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
public class Cliente_Regular extends Usuario_Cliente{

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalDeLosItems() {
        return totalDeLosItems;
    }

    public void setTotalDeLosItems(double totalDeLosItems) {
        this.totalDeLosItems = totalDeLosItems;
    }

    public double getPrecioFinalConDescuento() {
        return precioFinalConDescuento;
    }

    public void setPrecioFinalConDescuento(double precioFinalConDescuento) {
        this.precioFinalConDescuento = precioFinalConDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    
    
    
    
    
    @Override
    protected void calculoDescuento(Usuario usuario) {
        super.calculoDescuento(usuario); //To change body of generated methods, choose Tools | Templates.
    
    this.precioFinalConDescuento = this.totalDeLosItems - (this.totalDeLosItems * this.descuento);

    
    }

 

   
    
  
 
}
