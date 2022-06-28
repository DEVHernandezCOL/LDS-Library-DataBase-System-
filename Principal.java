import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{

    private JTextField field1;
    private JLabel la1, la2, la3, la4;
    private JButton bo1;
    public static String texto = "";
    
    public String retornarValor(){
        return texto;
    }

    public Principal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        ImageIcon img1 = new ImageIcon("images/logo-coca.png");
        la1 = new JLabel(img1);
        la1.setBounds(25,15,300,150);
        add(la1);

        la2 = new JLabel("Sistema Vacacional de Coca Cola");
        la2.setBounds(35,135,300,30);
        la2.setFont(new Font("Arial", 3, 18));
        la2.setForeground(new Color(255,255,255));
        add(la2);

        la3 = new JLabel("Ingrese Su Nombre");
        la3.setBounds(45,212,200,30);
        la3.setFont(new Font("Arial", 1, 12));
        la3.setForeground(new Color(255,255,255));
        add(la3);

        la4 = new JLabel("©2017 The Coca-Cola Company");
        la4.setBounds(85,325,300,30);
        la4.setFont(new Font("Arial", 1, 12));
        la4.setForeground(new Color(255,255,255));
        add(la4);

        field1 = new JTextField ();
        field1.setBounds(45,240,255,25);
        field1.setBackground(new Color(224,224,224));
        field1.setForeground(new Color(255,0,0));
        field1.setFont(new Font("Arial", 1, 14));
        add(field1);

        bo1 = new JButton("Ingresar");
        bo1.setBounds(125,280,100,30);
        bo1.setBackground(new Color(225,225,225));
        bo1.setForeground(new Color(255,0,0));
        bo1.setFont(new Font("Arial", 1, 14));
        bo1.addActionListener(this);
        add(bo1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== bo1){ 
            texto = field1.getText().trim();
            if(texto.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
            }
            else{
                Secundaria sec1 = new Secundaria();
                sec1.setBounds(0,0,600,360);
                sec1.setVisible(true);
                sec1.setResizable(false);
                sec1.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }
    public static void main(String []args){

        Principal  vb = new Principal();     
        vb.setBounds(0,0,350,450);
        vb.setVisible(true);
        vb.setResizable(false);
        vb.setLocationRelativeTo(null);
    }
}