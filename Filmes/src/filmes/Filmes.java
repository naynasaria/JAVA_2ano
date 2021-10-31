
package filmes;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Filmes extends JFrame{
    JLabel title;
    JCheckBox acao, comedia, comediaro, ficcao, romance, suspense, terror, drama, lgbtq;
    JButton ok, cancelar;
    
    public Filmes(){
        super("Filmes");
        ImageIcon icone = new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\filme.png");
        setIconImage(icone.getImage());
        setVisible(true);
        
        Container tela = getContentPane();
        tela.setBackground(Color.white);
        setLayout(null);
        
        title = new JLabel ("Seleção de Filmes");
        
        acao = new JCheckBox("AÇÃO");
        comedia = new JCheckBox("COMÉDIA");
        comediaro = new JCheckBox("COMÉDIA ROMÂNTICA");
        ficcao = new JCheckBox("FICÇÃO");
        romance = new JCheckBox("ROMANCE");
        suspense = new JCheckBox("SUSPENSE");
        terror = new JCheckBox("TERROR");
        drama = new JCheckBox("DRAMA");
        lgbtq = new JCheckBox("LGBTQ+");
        
        title.setFont(new Font("Arial",Font.BOLD, 32));
        title.setBounds(100,20,300,40);
        acao.setBounds(30,80,150,25);
        acao.setBackground(Color.white);
        comedia.setBounds(30,110,170,25);
        comedia.setBackground(Color.white);
        comediaro.setBounds(30,140,340,25);
        comediaro.setBackground(Color.white);
        ficcao.setBounds(30,170,340,25);
        ficcao.setBackground(Color.white);
        romance.setBounds(30,200,330,25);
        romance.setBackground(Color.white);
        suspense.setBounds(30,230,150,25);
        suspense.setBackground(Color.white);
        terror.setBounds(30,260,340,25);
        terror.setBackground(Color.white);
        drama.setBounds(30,290,330,25);
        drama.setBackground(Color.white);
        lgbtq.setBounds(30,320,150,25);
        lgbtq.setBackground(Color.white);
        
        tela.add(title);
        tela.add(acao);
        tela.add(comedia);
        tela.add(comediaro);
        tela.add(ficcao);
        tela.add(romance);
        tela.add(suspense);
        tela.add(terror);
        tela.add(drama);
        tela.add(lgbtq);
        
        ok = new JButton ("Ok");
        ok.setBounds(30,380,150,30);
        cancelar = new JButton ("Cancelar");
        cancelar.setBounds(290,380,150,30);
        
         cancelar.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
         ok.addActionListener((ActionEvent e) -> {
              String exibir = "";
                if(acao.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "O Infiltrado", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\acao.jpg"));
                }else if(comedia.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "Minha Mãe é uma Peça: O Filme.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\com.jpg"));
                } else if(comediaro.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "Simplesmente Acontece.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\comro.jpg"));
                }else if(ficcao.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "Jogos Vorazes: Em Chamas.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\jogosvorazes.jpg"));
                }else if(romance.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "Diário de Uma Paixão.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\ro.jpg"));
                }else if(suspense.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "Antes de Dormir.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\sus.jpg"));
                }else if(terror.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "A Freira.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\ter.jpg"));
                }else if(drama.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "Histórias Cruzadas.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\dra.jpg"));
                }else if(lgbtq.isSelected()){
                    JOptionPane.showMessageDialog(null, "O Filme Selecionado foi ", "A Garota Dinamarquesa.", 
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\Filmes\\lg.jpg"));
                }else{
                    JOptionPane.showMessageDialog(null, "Nenhuma Categoria de Filme Foi Seleciona!");
                }
                    
        });
        
        tela.add(ok);
        tela.add(cancelar);
        
         getRootPane().setDefaultButton(ok);

        setSize(500,500);
        setVisible(true);
    }

    
    public static void main(String[] args) {
        Filmes app = new Filmes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
