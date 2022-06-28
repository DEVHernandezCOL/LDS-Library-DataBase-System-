import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Secundaria extends JFrame implements ChangeListener, ActionListener{
    
    private JLabel la1, la2;
    private JCheckBox op1;
    private JButton bo1, bo2;
    private JScrollPane scroll1;
    private JTextArea text1;
    String nombre = "";
    
    public Secundaria(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de Uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Principal ventanaPrincipal = new Principal();
        nombre = ventanaPrincipal.retornarValor();

        la1 = new JLabel("TERMINOS Y CONDICIONES");
        la1.setBounds(215,5,200,30);
        la1.setFont(new Font("Arial", 1, 14));
        la1.setForeground(new Color(0,0,0));
        add(la1);

        text1 = new JTextArea();
        text1.setEditable(false);
        text1.setFont(new Font("Arial", 0, 9));
        text1.setText("\n\n          T�RMINOS Y CONDICIONES" +
                      "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI�N SIN AUTORIZACI�N DE LA GEEKIPEDIA DE ERNESTO." +
                      "\n            B.  PROHIBIDA LA ALTERACI�N DEL C�DIGO FUENTE O DISE�O DE LAS INTERFACES GR�FICAS." +
                      "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                      "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACI�N RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                      "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                      "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                      "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                      "\n\n          PARA MAYOR INFORMACI�N SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                      "\n          http://www.youtube.com/ernestoperezm");

        scroll1 = new JScrollPane(text1);
        scroll1.setBounds(10,40,575,200);
        add(scroll1);

        op1 = new JCheckBox(nombre  + " Acepta los Terminos y Condiciones");
        op1.setBounds(10,250,300,30);
        op1.addChangeListener(this);
        add(op1);

        bo1 = new JButton("Continuar");
        bo1.setBounds(10,290,100,30);
        bo1.addActionListener(this);
        bo1.setEnabled(false);
        add(bo1);

        bo2 = new JButton("No Acepto");
        bo2.setBounds(120,290,100,30);
        bo2.addActionListener(this);
        bo2.setEnabled(true);
        add(bo2);

        ImageIcon img1 = new ImageIcon("images/coca-cola.png");
        la2 = new JLabel(img1);
        la2.setBounds(315,135,300,300);
        add(la2);
    }
    public void stateChanged(ChangeEvent e){
        if(op1.isSelected() == true){
            bo1.setEnabled(true);
            bo2.setEnabled(false);
        }else{
            bo1.setEnabled(false);
            bo2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bo1){
            Terciaria vp = new Terciaria();
            vp.setBounds(0,0,640,535);
            vp.setVisible(true);
            vp.setResizable(false);
            vp.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        else if(e.getSource() == bo2){
            Principal  vb = new Principal();
            vb.setBounds(0,0,350,450);
            vb.setVisible(true);
            vb.setResizable(false);
            vb.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    public static void main(String args[]){
        Secundaria sec1 = new Secundaria();
        sec1.setBounds(0,0,600,360);
        sec1.setVisible(true);
        sec1.setResizable(false);
        sec1.setLocationRelativeTo(null);
    }
}
