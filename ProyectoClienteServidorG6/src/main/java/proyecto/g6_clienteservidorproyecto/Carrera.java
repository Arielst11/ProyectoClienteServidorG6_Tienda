
package proyecto.g6_clienteservidorproyecto;

import javax.swing.JLabel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
    private JLabel eti;
    private frm_hilos p;
    
    
    public  Carrera(JLabel eti, frm_hilos p){
        this.eti= eti;
        this.p = p;
    
    }
    
    public  Carrera(){
        
    }
    
    public void run (){
        int c1=0, c2=0;
        
        while (true) {            
            try {
                sleep((int)(Math.random()*1000));
                c1=p.getjLabelCarro1().getLocation().x;
                c2=p.getjLabelCarro2().getLocation().x;
                
                if(c1<p.getjLabelBarrera().getLocation().x-10&&c2<p.getjLabelBarrera().getLocation().x-10){
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
                
                }else{
                    break;
                
                
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(eti.getLocation().x>=p.getjLabelBarrera().getLocation().x-10){
                
                if(c1>c2){
                    JOptionPane.showMessageDialog(null, "Gano el auto 1");
                
                
                }else if (c2>c1) {
                
                    JOptionPane.showMessageDialog(null, "Gano el auto 2");
                
                }else{
                
                
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            
            
            }
        }
    
    
    }
    
}
