
package grupo.p88.swing;

import java.awt.LayoutManager;
import javax.swing.JFrame;

public class Ventana{

    protected JFrame ventana;
    
    
    public JFrame getInstance(){
        if(this.ventana == null){
            this.ventana = new JFrame();
        }
        return this.ventana;
    }

    public Ventana(){
        this.ventana = new JFrame();        
    }
    
    public void mostrarVentana(){
        //System.out.println("Soy el padre");
        this.ventana.setVisible(true);
    }
    
    public void adicionarPanel(Panel panel, String borderLayout){
        ventana.getContentPane().add(borderLayout, panel.getInstance());
    }
    
    public void adicionarPanel(Panel panel){
        ventana.getContentPane().add(panel.getInstance());
    }
    
    public void empaquetar(){
        ventana.pack();
    }
    
    public void layout(LayoutManager layout){
        ventana.setLayout(layout);
    }
    
}
