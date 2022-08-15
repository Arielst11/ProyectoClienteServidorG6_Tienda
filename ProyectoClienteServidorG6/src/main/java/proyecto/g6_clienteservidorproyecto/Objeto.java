/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.g6_clienteservidorproyecto;
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto.g6_clienteservidorproyecto.Objeto;
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
   
    /// metodo para insertar objetos
    private static final String SQL_INSERT_OBJECT = "insert into Articulos (codigoArticulo,"
            + "precioArticulo,nombreArticulo,descripcionArticulo,cantidad) values (?,?,?,?,?)";
    
    public void insertarObjeto (Objeto objeto){
        
        try{
            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_OBJECT);
            //Envío los parámetros definidos como signos de pregunta en el query
            sentencia.setString(1, String.valueOf(objeto.getCodigoArticulo()));
            sentencia.setString(2, String.valueOf(objeto.getPrecioArticulo()));
            sentencia.setString(3, objeto.getNombreArticulo());
            sentencia.setString(4, objeto.getDescripcionArticulo());
            sentencia.setObject(5, String.valueOf(objeto.getCantidadArticulo()));
            if (sentencia.executeUpdate()>0){// Si es válido devuelve un 1, si no sería falso
                System.out.println("Información del objeto registrada correctamente en base de datos");
            }else{
                System.out.println("Información del objeto no registrada.");
            }
            
            
        }catch(SQLException ex){
            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
        
    
   
    /// metodo para buscar todos los objetos
    private static final String SQL_SELECT_OBJETOS= "Select * from Articulos";
    
    public void mostrarTodoObjeto (){
        
        try{
            
           //Estamos haciendo uso de la clase conexión a la base de datos y mandando el script de traer todos los estudiantes
            PreparedStatement consulta= Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETOS);
            ResultSet rs = consulta.executeQuery();
            
            System.out.println("LISTADO DE OBJETOS EN EL SISTEMA:\n");
            
            while (rs!=null && rs.next()){
                
                System.out.print("Codigo Articulo: " + rs.getString(2)+",");
                System.out.print("Precio Articulo: " + rs.getString(3)+",");
                System.out.print("Nombre Articulo: " + rs.getString(4)+",");
                System.out.print("Descripcion Articulo: " + rs.getString(5)+",");
                System.out.print("Cantidad Articulo: " + rs.getString(6)+",");
                System.out.println("");             
            }

        }catch(SQLException ex){
            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    /// metodo para buscar por codigo
    
    private static final String SQL_SELECT_OBJETO=  "select * from Articulos where codigoArticulo=?";
    
    public void buscarObjetoxID (String id){
        
        try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1, id);
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
                
                System.out.println("");
                System.out.println("DATOS DEL Objeto encontrado  \n");
                System.out.println("Codigo Articulo: " + rs.getString(2));
                System.out.println("Precio Articulo: " + rs.getString(3));
                System.out.println("Nombre Articulo: " + rs.getString(4));
                System.out.println("Descripcion Articulo: " + rs.getString(5));
                System.out.println("Cantidad Articulo: " + rs.getString(6));
                                
            }else{
                System.out.println("No fue encontrado el objeto dentro de la base de datos.");
            }
            
        }catch (SQLException ex){
            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    // metodo para borrar un objeto
    
    
    private static final String SQL_DELETE_OBJECT = "delete from Articulos where codigoArticulo=?";
    
    public void eliminarObjetoxID (String id){
        
        try{
            
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_DELETE_OBJECT);
            consulta.setString(1, id);
            if (consulta.executeUpdate()>0){
                System.out.println("Información del objeto borrado de la base de datos.");
            }else{
                System.out.println("No fue encontrado el objeto en la base de datos.");
            }
            
        }catch (SQLException ex){
            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    
    public void datosObjeto(int codigoArticulo, float precioArticulo, String nombreArticulo, String descripArticulo, int cantArticulo){
     this.codigoArticulo = codigoArticulo;
     this.precioArticulo = precioArticulo;
     this.nombreArticulo = nombreArticulo;
     this.descripcionArticulo = descripArticulo;
     this.cantidadArticulo = cantArticulo;
    }    
    
}
