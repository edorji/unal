
package grupo.p88;

import grupo.p88.swing.Boton;
import grupo.p88.swing.Label;
import grupo.p88.swing.Panel;
import grupo.p88.swing.Texto;
import grupo.p88.swing.Ventana;
import grupo.p88.swing.VentanaPrincipal;
import java.awt.FlowLayout;

public class GUI {
    
    private static Ventana programa;
    private static Ventana resultados;
    
    public static void main(String[] argumentos){
        //Primero construir los componentes atomicos
        Label etiqueta1 = construirEtiqueta("Nombres: ");
        Texto texto1 = construirTexto(20);
        Label etiqueta2 = construirEtiqueta("Apellidos: ");
        Texto texto2 = construirTexto(20);
        Boton boton1 = construirBoton("Enviar");
        Boton boton2 = construirBoton("Resetear");
        
        //luego el panel
        Panel panel1 = construirPanel();
        Panel panel2 = construirPanel();
        Panel panel3 = construirPanel();
        Panel panel4 = construirPanel();
        Panel panel5 = construirPanel();
        //adicionar los componenetes al panel

        panel1.asociarComponente(etiqueta1.getInstance());
        panel2.asociarComponente(etiqueta2.getInstance());
        panel3.asociarComponente(texto1.getInstance());
        panel4.asociarComponente(texto2.getInstance());
        panel5.asociarComponente(boton1.getInstance());
        panel5.asociarComponente(boton2.getInstance());
        
        boton1.accionCambiarColor(panel5);
        boton2.accionLimpiar(texto1);
        boton2.accionLimpiar(texto2);
        
        construirVentanaPrincipal();
        programa.layout(new FlowLayout());
        programa.adicionarPanel(panel1, ""+FlowLayout.LEFT);//BorderLayout.WEST
        programa.adicionarPanel(panel2, ""+FlowLayout.LEFT);//BorderLayout.EAST
        programa.adicionarPanel(panel3, ""+FlowLayout.RIGHT);//BorderLayout.SOUTH
        programa.adicionarPanel(panel4, ""+FlowLayout.RIGHT);//BorderLayout.SOUTH
        programa.adicionarPanel(panel5, ""+FlowLayout.CENTER);//BorderLayout.SOUTH
        //programa.empaquetar();
        programa.mostrarVentana(); 
    }
    
    public static void construirVentanaPrincipal(){
        programa = new VentanaPrincipal();    
        programa.getInstance().setTitle("Ventana Principal");
        programa.getInstance().setSize(400, 300);
        //ventana.pack();
        programa.getInstance().setLocation(100, 50);
    }
    
    public static Panel construirPanel(){
        Panel lienzo = new Panel();
        lienzo.getInstance();
        return lienzo;
    }
    
    public static Label construirEtiqueta(String texto){
        Label etiqueta = new Label();
        etiqueta.getInstance().setText(texto);
        return etiqueta;
    }
    
    public static Texto construirTexto(int columns){
        Texto texto = new Texto();      
        texto.getInstance().setColumns(columns);
        return texto;
    }
    
    public static Boton construirBoton(String texto){
        Boton boton = new Boton();      
        boton.getInstance().setText(texto);
        return boton;
    }
}
