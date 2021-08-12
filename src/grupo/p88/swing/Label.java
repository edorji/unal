
package grupo.p88.swing;

import javax.swing.JLabel;

public class Label{
    
    protected JLabel etiqueta;

    public JLabel getInstance(){
        if(this.etiqueta == null){
            this.etiqueta = new JLabel();
        }
        return this.etiqueta;
    }
    
    
    public Label() {
        this.etiqueta = new JLabel();
    }
    
    
    
    
}
