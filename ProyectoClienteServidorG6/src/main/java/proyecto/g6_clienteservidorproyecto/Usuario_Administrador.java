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
public class Usuario_Administrador extends Usuario{

    
    
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
    public void tomarDatosDeBaseDeDatosEIniciarSesion(Usuario usuario, String username, String password) {
        super.tomarDatosDeBaseDeDatosEIniciarSesion(usuario, username, password); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
    
}
