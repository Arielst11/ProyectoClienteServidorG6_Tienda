/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author asanc
 */
public class Conexion {
   
  //Atributos para poder crear la conexión a base de datos
    private static Conexion conexion; 
    
    private static final String DBURL = "jdbc:mysql://localhost:3306/proyecto_cliente_servidor?serverTimezone=UTC";
    private static Connection conn=null;
    private static final String user = "root";            // companera puede cambiar este valor para que funcione en su computadora
    private static final String password = "X2xlastx2x?"; // companera puede cambiar este valor para que funcione en su computadora
    
    //hola 
    private Conexion (){
          
        try{
            //Por código hacemos uso del conector
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            conn= DriverManager.getConnection(DBURL,user,password);
        }catch (ClassNotFoundException | SQLException | NoSuchMethodException | SecurityException | 
                InstantiationException | IllegalAccessException | IllegalArgumentException | 
                InvocationTargetException ex){
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
            
        }
        
    }

    
    
    //Método sincronizado que no permitirá que haya más de una conexión abierta
    
    public static synchronized Connection getConexion (){
        
        if (conexion==null){
            conexion = new Conexion();
        }
        return conn;
    }      
    
}
