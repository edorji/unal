
package grupo.p88.swing;

import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel<T>{
    
    protected JPanel panel;
    
    private List<Label> etiquetas;
    private List<Boton> botones;
    private List<Texto> cajasTexto;
    private List<Lista> tablaResultados; 
    

    public JPanel getInstance(){
        if(this.panel == null){
            this.panel = new JPanel();
        }
        return this.panel;
    }
    
    public Panel() {
        this.panel = new JPanel();
        this.etiquetas = new ArrayList();
        this.botones = new ArrayList();
        this.cajasTexto = new ArrayList();
        this.tablaResultados = new ArrayList();
    }
    
    public void asociarComponente(T t){
        this.panel.add((Component)t);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public List getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List getBotones() {
        return botones;
    }

    public void setBotones(List botones) {
        this.botones = botones;
    }

    public List getCajasTexto() {
        return cajasTexto;
    }

    public void setCajasTexto(List cajasTexto) {
        this.cajasTexto = cajasTexto;
    }

    public List getTablaResultados() {
        return tablaResultados;
    }

    public void setTablaResultados(List tablaResultados) {
        this.tablaResultados = tablaResultados;
    }
    
    
}
