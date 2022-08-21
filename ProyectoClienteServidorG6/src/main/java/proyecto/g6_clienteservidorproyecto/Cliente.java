
package proyecto.g6_clienteservidorproyecto;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente extends Observable implements Runnable{
    
    private int puerto;
    

    public Cliente(int puerto) {
        this.puerto = puerto;
        
    }

    public Cliente() {
    }

    
    
    @Override
    public void run() {
        
         final String HOST = "127.0.0.1"; //a quien me voy a conectar 
        //final int PUERTO = 5000;//mismo que el servidor
        //DataInputStream in;
        //DataOutputStream out; ya no hace falta porque solo va a recibir
        //para recibir
        DataInputStream dis;

        try {
            Socket sc = new Socket(HOST, puerto);
            dis = new DataInputStream(sc.getInputStream());
            String nombre;
            double valor;
            
            while (true) {      
                //espero a que me envien algo 
                nombre = dis.readUTF();
                
                this.setChanged();//para cambiar el valor
                this.notifyObservers(nombre);//le mando esto a la ventana
                this.clearChanged();
                
                valor= dis.readDouble();//y ahora el valor
                this.setChanged();
                this.notifyObservers(valor);
                this.clearChanged();
                
            }

            
            
            
           
            

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
           

        }

    }
        
        
    
    
}
