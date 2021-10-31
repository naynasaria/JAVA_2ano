
package emprestimo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Emprestimo extends JFrame {

    JLabel title, aluno, nome, rm, classe;
    JTextField name, cla,r;
    JButton emprestar;
    JComboBox <String> livro = new JComboBox<String>();
    
    
    public Emprestimo(){
        super("Empréstimo");
        ImageIcon icone = new ImageIcon("C:\\Users\\emers\\Desktop\\DS\\livro.png");
        setIconImage(icone.getImage());
        setVisible(true);
        
        Container tela = getContentPane();
        tela.setBackground(Color.white);
        setLayout(null);
        
        title = new JLabel ("Empréstimo");
        aluno = new JLabel ("Aluno");
        nome = new JLabel ("Nome");
        rm = new JLabel ("RM");
        classe = new JLabel ("Classe");
        
        name = new JTextField(50);
        cla = new JTextField(50);
        r = new JTextField(50);
        
        livro.addItem("Selecione o Livro");
        livro.addItem("Os Sete Maridos de Evelyn Hugo");
        livro.addItem("É Assim Que Acaba");
        livro.addItem("O Lado Feio do Amor");
        livro.addItem("O Apanhador no Campo de Centeio");
        livro.addItem("Harry Potter: A Saga Completa");
        livro.addItem("Novembro, 9");
        livro.addItem("Verity");
        livro.addItem("Sua Alteza Real");
        livro.addItem("Leah Fora de Sintonia");
        livro.addItem("Os Mentirosos");
        livro.addItem("Dom Casmurro");
        livro.addItem("Dom Quixote");
        livro.addItem("Hamlet");
        livro.addItem("O Pequeno Príncipe");
        livro.addItem("A Revolução dos Bichos");
        livro.addItem("Os Miseráveis");
        livro.addItem("1984");
        livro.addItem("Orgulho e Preconceito");
        livro.addItem("A Menina que Roubava Livros");
        livro.addItem("Diário de Anne Frank");
        livro.addItem("Cem Anos de Solidão");
        livro.addItem("Percy Jackson: A Saga Completa");
        livro.addItem("A Hora da Estrela");
        livro.addItem("Um de Nós Está Mentindo");
        livro.addItem("O Grande Gatsby");
        livro.addItem("O Sol é Para Todos");
        livro.addItem("Odisseia");
        livro.addItem("IT: A Coisa");
        livro.addItem("Jane Eyre");
        livro.addItem("Mulherzinhas");

        title.setFont(new Font("Arial",Font.BOLD, 32));
        title.setBounds(100,15,300,40);
        aluno.setFont(new Font("Arial",Font.BOLD, 16));
        aluno.setBounds(30,60,300,40);
        nome.setBounds(30,120,300,25);
        rm.setBounds(30,170,300,25);
        classe.setBounds(30,220,300,25);
        
        name.setBounds(75,122,250,25);
        cla.setBounds(75,220,250,25);
        r.setBounds(75,170,250,25);
        livro.setBackground(Color.black);
        livro.setForeground(Color.white);
        livro.setBounds(170,70,200,25);
        
        tela.add(title);
        tela.add(aluno);
        tela.add(nome);
        tela.add(rm);
        tela.add(classe);
        tela.add(name);
        tela.add(cla);
        tela.add(r);
        tela.add(livro);
        
        emprestar = new JButton ("Emprestar");
        emprestar.setBackground(Color.black);
        emprestar.setForeground(Color.white);
        emprestar.setBounds(110,290,150,30);
        
        emprestar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "O Empréstimo do Livro:  "+ livro.getSelectedItem() 
                    +"\nSerá Feito Para: "+ name.getText()
                    +"\n"+rm.getText() + " : " + r.getText()
                    +"\n"+classe.getText() + " : " + cla.getText()
            );
            
            
        });

        
        
        tela.add(emprestar);
        
         getRootPane().setDefaultButton(emprestar);

        setSize(400,400);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
         Emprestimo app = new Emprestimo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
