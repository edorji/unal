
package grupo.p88.swing;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VentanaPrincipal extends Ventana{
    
    
    public VentanaPrincipal() {
        super();
    }
    
    @Override
    public void mostrarVentana(){
        //System.out.println("Soy el hijo");
        super.ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.mostrarVentana();        
    }
    
}
