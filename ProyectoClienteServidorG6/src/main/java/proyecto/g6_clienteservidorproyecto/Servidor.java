
package proyecto.g6_clienteservidorproyecto;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Servidor  implements Runnable{
    
    private ArrayList<Socket> Clientes;//clientes que se conectan 
    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
        this.Clientes = new ArrayList<>();
    }
    
    public Servidor() {
        
    }
   

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc= null;
        DataInputStream in;
        DataOutputStream out;
        
        final int PUERTO = 5000;//puerto del servidor 
        
        
        try{
        servidor = new ServerSocket(puerto);//creamos servidor
            System.out.println("Servidor iniciado");
        
        //escuchar peticiones de los clientes. decirle: viene alguien, este atento
            while (true) {    
                sc =servidor.accept(); //se queda a la espera, socket del cliente
                System.out.println("Cliente conectado");
                
               Clientes.add(sc);//en clientes añadimos el socket 
               
                
            }
        
        
        
        
        
        }catch(Exception ex){
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        
        
        
        }
    }
    
    public void enviarInfo(String[] nombres, double[] valores){
        
        
        for (Socket sock: Clientes) {
            
            try {
            //recorro clientes
            
            DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
              for (int i = 0; i <nombres.length; i++) {
            
                  dos.writeUTF(nombres[i]);
                  dos.writeDouble(valores[i]);
            
            
        }
            
            
            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
            
            
            
        }
        
       
    
    
    }
    
}
