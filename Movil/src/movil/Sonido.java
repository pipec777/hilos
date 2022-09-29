package movil;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sonido extends Thread{
    
    @Override
    public  void run(){
        try {
        Clip Sonido = AudioSystem.getClip();
         File a = new File("sounds\\fear.wav");
         Sonido.open(AudioSystem.getAudioInputStream(a));
         Sonido.start();
         System.out.println("Reproduciendo sonido...");
         Thread.sleep(60000); 
         Sonido.close();
      } catch (Exception tipoError) {
         System.out.println("" + tipoError);
      }
   }
}
