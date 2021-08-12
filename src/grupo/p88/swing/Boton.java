package grupo.p88.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Boton<T> {
    
    protected JButton boton;

    public JButton getInstance(){
        if(this.boton == null){
            this.boton = new JButton();
        }
        return this.boton;
    }
    
    public Boton() {
        this.boton = new JButton();
    }
    
    public void accionCambiarColor(Panel panel){
        
        this.boton.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                panel.getInstance().setBackground(Color.red);
            }
        });
    }
    
    public void accionLimpiar(Texto texto){
        
        this.boton.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                texto.getInstance().setText(null);
            }
        });
    }
}
