package movil;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Proceso extends Thread {

  private JLabel etiqueta;
  private auto coche;

    public Proceso(JLabel etiqueta, auto coche) {
        this.etiqueta = etiqueta;
        this.coche = coche;
    }        

   @Override
    public  void run(){    
       
        int auto1=0;
     
          while(true){
        try{
            
        sleep((int)(Math.random() * 1000 ));
        auto1 = coche.getAuto_r().getLocation().x;  
        
        if(auto1 < coche.getbarrera().getLocation().x - 125){
        etiqueta.setLocation(etiqueta.getLocation().x + 10,etiqueta.getLocation().y);
        coche.repaint();
        }else{
            break;
        }
        
        
        }catch(Exception e){
         
        System.out.println(e);    
            
        }
        
        if(etiqueta.getLocation().x >= coche.getbarrera().getLocation().x-125){
        JOptionPane.showMessageDialog(null, "llego el auto");
      }    
        
    }
}

}