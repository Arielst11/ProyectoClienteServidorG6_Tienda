package proyecto.g6_clienteservidorproyecto;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

class HiloServidor extends Thread {

    private DataInputStream entrada;
    private DataOutputStream salida;
    private frm_Servidor server;
    private Socket Cliente;
    public static Vector<HiloServidor> usuarioActivo = new Vector<>();
    private String nombre;
    private ObjectOutputStream salidaObjeto;
    
    public HiloServidor(Socket socketcliente, String nombre, frm_Servidor serv) throws Exception {
        
        this.Cliente = socketcliente;
        this.server = serv;
        this.nombre = nombre;
        usuarioActivo.add(this);
        
        for (int i = 0; i < usuarioActivo.size(); i++) {
            usuarioActivo.get(i).enviosMensajes(nombre + "Se ha conectado.");
            
        }
        
    }
    
    private void enviosMensajes(String msg) throws Exception {
        
        salida = new DataOutputStream(Cliente.getOutputStream());
        salida.writeUTF(msg);//envio de msj
        DefaultListModel modelo = new DefaultListModel();
        
        for (int i = 0; i < usuarioActivo.size(); i++) {
            modelo.addElement(usuarioActivo.get(i).nombre);
            
        }
        salidaObjeto = new ObjectOutputStream(Cliente.getOutputStream());
        salidaObjeto.writeObject(modelo);
        
    }
    
    public void run() {
        
        String mensaje = " ";
        
        while (true) {            
            
            try {
                
                entrada = new DataInputStream(Cliente.getInputStream());
                mensaje = entrada.readUTF();
                
                for (int i = 0; i < usuarioActivo.size(); i++) {
                    usuarioActivo.get(i).enviosMensajes(mensaje);
                    server.mensajeria("Mensaje enviado");
                    
                }
                
            } catch (Exception e) {
                break;
            }
            
        }
        
    }
    
}
