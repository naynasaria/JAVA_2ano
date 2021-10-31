
package info;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Info extends JFrame {
    JLabel cep, tel, cpf, data;
    JTextField textcep, textcpf, textel, textdata;
    JButton exibir;
    
     MaskFormatter mascaracep, mascaratel, mascaracpf,mascaradata;
    
    public Info(){
        super("Contato");
        ImageIcon icone = new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\contato.png");
        setIconImage(icone.getImage());
        setVisible(true);
        
         Container tela = getContentPane();
         tela.setBackground(Color.white);
        
        cep = new JLabel ("CEP ");
        tel = new JLabel ("TELEFONE ");
        cpf = new JLabel ("CPF ");
        data = new JLabel ("DATA ");
        
        textcep = new JTextField(30);
        textcpf = new JTextField(30);
        textel = new JTextField(30);
        textdata = new JTextField(30);
        
        
         try{
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##) ####-####");
            mascaracpf = new MaskFormatter("###.###.###-##");
            mascaradata = new MaskFormatter("##/##/####"); 
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaracpf.setPlaceholderCharacter('_');
            mascaradata.setPlaceholderCharacter('_');
        }
        catch(ParseException excp) {}
        textcep = new JFormattedTextField(mascaracep);
        textel = new JFormattedTextField(mascaratel);
        textdata = new JFormattedTextField(mascaradata);
        textcpf = new JFormattedTextField(mascaracpf);
        
        cep.setBounds(20,20,150,25);
        tel.setBounds(20,65,150,25);
        cpf.setBounds(20,110,150,25);
        data.setBounds(20,150,150,25);
        textcep.setBounds(90,20,120,25);
        textcpf.setBounds(90,110,120,25);
        textel.setBounds(90,65,120,25);
        textdata.setBounds(90,150,120,25);
        
        
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        tela.add(textcep);
        tela.add(textcpf);
        tela.add(textel);
        tela.add(textdata);
        
        setLocationRelativeTo(null); 
        setLayout(null);
        
        exibir = new JButton ("Exibir");
        exibir.setBounds(70,210,150,30);
        
         exibir.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, cep.getText() + ":  " + textcep.getText()
                                           +"\n "+tel.getText() + ":  " + textel.getText()
                                           +"\n "+cpf.getText() + ":  " + textcpf.getText()
                                           +"\n "+data.getText() + ":  " + textdata.getText()
            );
        });
         
        tela.add(exibir);
        
        getRootPane().setDefaultButton(exibir);

        setSize(300,300);
        setVisible(true);
    }

    
    public static void main(String[] args) {
        Info app = new Info();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
