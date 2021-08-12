/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo.p88.swing;

import javax.swing.JTextField;

/**
 *
 * @author Eduin
 */
public class Texto{
    
    protected JTextField texto;

    public JTextField getInstance(){
        if(this.texto == null){
            this.texto = new JTextField();
        }
        return this.texto;
    }
    
    public Texto() {
        this.texto = new JTextField();
    }
    
    
}
