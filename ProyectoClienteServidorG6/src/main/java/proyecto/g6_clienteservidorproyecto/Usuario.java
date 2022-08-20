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
import javax.swing.JOptionPane;
/**
 *
 * @author asanc
 */
public abstract class Usuario {

  
   

protected String nombre;
protected String username;
protected String password;
protected int cedula;


    /**
     * @return the ID
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param ID the ID to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 
 

 
 
 
 public void tomarDatosDeBaseDeDatosEIniciarSesion(Usuario usuario ,String username, String password){
  if(usuario instanceof Usuario_Administrador){
  
  String SQL_SELECT_OBJETO=  "select * from Administradores where nombreUsuarioAdministrador=? AND  contrasenaUsuarioAdministrador=?";
    
        try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1,username);
            consulta.setString(2,password);
            
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
             
            
           usuario.setCedula(Integer.parseInt(rs.getString(2)));
           usuario.setNombre(rs.getString(3));
           usuario.username= (rs.getString(4));
           usuario.password =(rs.getString(5));
          
           
            UsuarioActualStatic.usuarioActual = usuario;  // agrega en usuario globalmente en el programa para poder usar su informacion en cualquier parte.
            JOptionPane.showMessageDialog(null, "los datos del usuario se han cargado en el sistema ");   
           
            }else{
                JOptionPane.showMessageDialog(null, "No fue encontrado un usuario administrador dentro de la base de datos con los siguientes datos \n"
                        + "Username: " + username + "\n"
                        + "Password: " + password);                            
            } 
        }catch (SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }    
      
    if(usuario instanceof Cliente_Regular){
  
  String SQL_SELECT_OBJETO=  "select * from Usuario_Regular where nombreUsuarioUsuarioRegular=? AND  contrasenaUsuarioUsuarioRegular=?";
    
        try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1,username);
            consulta.setString(2,password);
            
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
               
           usuario.setCedula(Integer.parseInt(rs.getString(2)));
           usuario.setNombre(rs.getString(3));
           usuario.username= (rs.getString(4));
           usuario.password =(rs.getString(5));
           
           UsuarioActualStatic.usuarioActual = usuario;  // agrega en usuario globalmente en el programa para poder usar su informacion en cualquier parte.
           JOptionPane.showMessageDialog(null, "los datos del usuario se han cargado en el sistema ");
                                   
            }else{
                JOptionPane.showMessageDialog(null, "No fue encontrado un cliente regular dentro de la base de datos con los siguientes datos \n"
                        + "Username: " + username + "\n"
                        + "Password: " + password);                            
            } 
        }catch (SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }    
  
    
    if(usuario instanceof Cliente_VIP){
  
  String SQL_SELECT_OBJETO=  "select * from Usuario_VIP where nombreUsuarioUsuarioVIP=? AND  contrasenaUsuarioUsuarioVIP=?";
    
        try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1,username);
            consulta.setString(2,password);
            
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
               
           usuario.setCedula(Integer.parseInt(rs.getString(2)));
           usuario.setNombre(rs.getString(3));
           usuario.username= (rs.getString(4));
           usuario.password =(rs.getString(5));
           
            UsuarioActualStatic.usuarioActual = usuario;  // agrega en usuario globalmente en el programa para poder usar su informacion en cualquier parte.
            JOptionPane.showMessageDialog(null, "los datos del usuario se han cargado en el sistema ");
                                   
            }else{
                JOptionPane.showMessageDialog(null, "No fue encontrado un cliente VIP dentro de la base de datos con los siguientes datos \n"
                        + "Username: " + username + "\n"
                        + "Password: " + password);                            
            } 
        }catch (SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }  
    
  }   
    

 public boolean validarInicio(Usuario usuario ,String username, String password){
     
  String usernameValidation;
  String passwordValidation;
  
  if(usuario instanceof Usuario_Administrador){
  
  String SQL_SELECT_OBJETO=  "select * from Administradores where nombreUsuarioAdministrador=? AND  contrasenaUsuarioAdministrador=?";
    
         try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1,username);
            consulta.setString(2,password);
            
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
          usernameValidation = (rs.getString(4));
          passwordValidation =(rs.getString(5));
           
           if(usernameValidation.equals(username) && passwordValidation.equals(password)){
              return true; 
              
           }else{
               JOptionPane.showMessageDialog(null, "Inicio de sesión denegado");  
               return false;                            
            } 
            }  
        }catch (SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }    
      
    if(usuario instanceof Cliente_Regular){
  
  String SQL_SELECT_OBJETO=  "select * from Usuario_Regular where nombreUsuarioUsuarioRegular=? AND  contrasenaUsuarioUsuarioRegular=?";
    
       try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1,username);
            consulta.setString(2,password);
            
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
          usernameValidation = (rs.getString(4));
          passwordValidation =(rs.getString(5));
           
           if(usernameValidation.equals(username) && passwordValidation.equals(password)){
              return true; 
              
           }else{
               JOptionPane.showMessageDialog(null, "Inicio de sesión denegado");  
               return false;                            
            } 
            }  
        }catch (SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }    
      
    if(usuario instanceof Cliente_VIP){
  
  String SQL_SELECT_OBJETO=  "select * from Usuario_VIP where nombreUsuarioUsuarioVIP=? AND  contrasenaUsuarioUsuarioVIP=?";
    
        try{
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_OBJETO);
            consulta.setString(1,username);
            consulta.setString(2,password);
            
            ResultSet rs= consulta.executeQuery();
            
            if (rs.next()){
          usernameValidation=  (rs.getString(4));
          passwordValidation =(rs.getString(5));
           
           if(usernameValidation.equals(username) && passwordValidation.equals(password)){
              return true; 
              
           }else{
               JOptionPane.showMessageDialog(null, "Inicio de sesión denegado");  
               return false;                            
            } 
            }  
        }catch (SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }  

   return false;
                        
   
  }   
 
 
 public void insertarUsuario(Usuario usuario){
     
     if(usuario instanceof Cliente_Regular){
         
      String SQL_INSERT_USER = "insert into Usuario_Regular (ID_cedulaUsuarioRegular,"
            + "nombreUsuarioRegular,nombreUsuarioUsuarioRegular,contrasenaUsuarioUsuarioRegular) values (?,?,?,?)";   
         
       try{
            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_USER);
            //Envío los parámetros definidos como signos de pregunta en el query
            sentencia.setString(1, String.valueOf(this.cedula));
            sentencia.setString(2, this.nombre);
            sentencia.setString(3, this.username);
            sentencia.setString(4, this.password);
            if (sentencia.executeUpdate()>0){// Si es válido devuelve un 1, si no sería falso
                JOptionPane.showMessageDialog(null, "Usuario regular registrado");
            }
        }catch(SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        } 
     }
     
     
     
     if(usuario instanceof Cliente_VIP){ 
     String SQL_INSERT_USER = "insert into Usuario_VIP (ID_cedulaUsuarioVIP,"
            + "nombreUsuarioVIP,nombreUsuarioUsuarioVIP,contrasenaUsuarioUsuarioVIP) values (?,?,?,?)";     
       try{
            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_USER);
            //Envío los parámetros definidos como signos de pregunta en el query
            sentencia.setString(1, String.valueOf(this.cedula));
            sentencia.setString(2, this.nombre);
            sentencia.setString(3, this.username);
            sentencia.setString(4, this.password);
            if (sentencia.executeUpdate()>0){// Si es válido devuelve un 1, si no sería falso
                JOptionPane.showMessageDialog(null, "Usuario VIP registrado");
            }
        }catch(SQLException ex){
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE,null,ex);
        } 
     }      
     }
     
 
 
 
     
     
 }
   
