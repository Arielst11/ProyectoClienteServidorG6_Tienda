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
public class Usuario_Cliente extends Usuario{
    
    
    protected Factura factura;
    protected double descuento;
    protected double totalDeLosItems;
    protected double precioFinalConDescuento;
    
    protected void calculoDescuento(Usuario usuario){
      if(usuario instanceof Cliente_Regular){
       descuento = 0.05;
      }   
       if(usuario instanceof Cliente_VIP){
       descuento = 0.20;
      }   
      
      
    }
    
  
    
    
    
}
