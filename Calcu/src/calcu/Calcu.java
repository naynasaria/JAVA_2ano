
package calcu;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calcu extends JFrame {
    JCheckBox soma, sub, mult, div, resto;
    JLabel n1, n2, res;
    JTextField num1, num2, result;
    JButton calcular;
    
    public Calcu(){
        super("Calculadora");
        ImageIcon icone = new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\calc.png");
        setIconImage(icone.getImage());
        setVisible(true);
        
        Container tela = getContentPane();
        tela.setBackground(Color.white);
        setLayout(null);
        
        n1 = new JLabel ("Número 1");
        n2 = new JLabel ("Número 2");
        res = new JLabel ("Resultado");
        
        num1 = new JTextField(50);
        num2 = new JTextField(50);
        result = new JTextField(50);
        
        soma = new JCheckBox("Soma (+)");
        sub = new JCheckBox("Subtração (-)");
        mult = new JCheckBox("Multiplicação (*)");
        div = new JCheckBox("Divisão (/)");
        resto = new JCheckBox("Resto (%)");
        
        n1.setBounds(20,30,300,40);
        n2.setBounds(20,100,150,20);
        res.setBounds(20,350,170,25);
        num1.setBounds(90,40,340,25);
        num2.setBounds(90,98,340,25);
        result.setBounds(90,350,330,30);
        soma.setBounds(20,150,150,20);
        soma.setBackground(Color.white);
        sub.setBounds(20,190,170,25);
        sub.setBackground(Color.white);
        mult.setBounds(20,230,300,20);
        mult.setBackground(Color.white);
        div.setBounds(20,270,150,20);
        div.setBackground(Color.white);
        resto.setBounds(20,310,300,20);
        resto.setBackground(Color.white);
        
        tela.add(n1);
        tela.add(n2);
        tela.add(res);
        tela.add(num1);
        tela.add(num2);
        tela.add(result);
        tela.add(soma);
        tela.add(sub);
        tela.add(mult);
        tela.add(div);
        tela.add(resto);
        
        calcular = new JButton ("Calcular");
        calcular.setBounds(280,150,150,30);
        
        calcular.addActionListener((ActionEvent e) -> {
           double n1, n2, adicao, menos, m, divi, r; 
           n1 = Double.parseDouble(num1.getText());
           n2 = Double.parseDouble(num2.getText());
                
                if(soma.isSelected()){
                    adicao = n1+n2;
                    result.setText(" "+adicao);
                } else if(sub.isSelected()) {
                    menos = n1-n2;
                    result.setText(" "+menos);
                } else if(mult.isSelected()) {
                    m = n1*n2;
                    result.setText(" "+m);
                } else if(div.isSelected()) {
                    divi = n1/n2;
                    result.setText(" "+divi);
                } else if(resto.isSelected()){
                    r = n1%n2;
                    result.setText(" "+r);
                }else{
                    JOptionPane.showMessageDialog(null,"Erro! Nenhuma operação foi selecionada!");
                }
                    
        });
        
        
        tela.add(calcular);
        
        getRootPane().setDefaultButton(calcular);

        setSize(480,480);
        setVisible(true);
        
    }

    
    public static void main(String[] args) {
       Calcu app = new Calcu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
