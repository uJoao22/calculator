package pacPrincipal;

import static javax.swing.SwingConstants.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calculadora implements ActionListener {
	JTextField campoNum1, campoNum2, resultado;
	JButton botaoSoma, botaoSub, botaoMulti, botaoDiv, n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, virgula, igual, maismenos, porcent, parenteses, c;

	Calculadora(){ 
        JFrame janela= new JFrame("Calculadora");
        janela.getContentPane().setBackground(Color.black);
        
        campoNum1=new JTextField();  
        campoNum1.setBounds(310,0,50,20); //NUMBER 1
        
        campoNum2=new JTextField();  
        campoNum2.setBounds(310,0,50,20); //NUMBER 2
        
        resultado=new JTextField();  
        resultado.setBounds(20,20,210,60); //RESULTADO
        resultado.setEditable(false);
        resultado.setFont(new Font("sansserif", 0, 25));
        resultado.setHorizontalAlignment(RIGHT);
        resultado.setBackground(Color.gray);
        resultado.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        maismenos = new JButton("+-");
        maismenos.setBounds(20, 310, 45, 45); // Mais ou Menos 
        maismenos.setBackground(Color.BLACK);
        maismenos.setForeground(Color.WHITE);
        maismenos.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n0 = new JButton("0");
        n0.setBounds(75, 310, 45, 45); //0
        n0.setBackground(Color.BLACK);
        n0.setForeground(Color.WHITE);
        n0.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        virgula = new JButton(",");
        virgula.setBounds(130, 310, 45, 45); //VIRGULA
        virgula.setBackground(Color.BLACK);
        virgula.setForeground(Color.WHITE);
        virgula.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n1 = new JButton("1");
        n1.setBounds(20, 255, 45, 45); //1
        n1.setBackground(Color.BLACK);
        n1.setForeground(Color.WHITE);
        n1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n2 = new JButton("2");
        n2.setBounds(75, 255, 45, 45); //2
        n2.setBackground(Color.BLACK);
        n2.setForeground(Color.WHITE);
        n2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n3 = new JButton("3");
        n3.setBounds(130, 255, 45, 45); //3
        n3.setBackground(Color.BLACK);
        n3.setForeground(Color.WHITE);
        n3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n4 = new JButton("4");
        n4.setBounds(20, 200, 45, 45); //4
        n4.setBackground(Color.BLACK);
        n4.setForeground(Color.WHITE);
        n4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n5 = new JButton("5");
        n5.setBounds(75, 200, 45, 45); //5
        n5.setBackground(Color.BLACK);
        n5.setForeground(Color.WHITE);
        n5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n6 = new JButton("6");
        n6.setBounds(130, 200, 45, 45); //6
        n6.setBackground(Color.BLACK);
        n6.setForeground(Color.WHITE);
        n6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n7 = new JButton("7");
        n7.setBounds(20, 145, 45, 45); //7
        n7.setBackground(Color.BLACK);
        n7.setForeground(Color.WHITE);
        n7.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n8 = new JButton("8");
        n8.setBounds(75, 145, 45, 45); //8
        n8.setBackground(Color.BLACK);
        n8.setForeground(Color.WHITE);
        n8.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        n9 = new JButton("9");
        n9.setBounds(130, 145, 45, 45); //9
        n9.setBackground(Color.BLACK);
        n9.setForeground(Color.WHITE);
        n9.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        c = new JButton("C");
        c.setBounds(20, 90, 45, 45);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        parenteses = new JButton("()");
        parenteses.setBounds(75, 90, 45, 45);
        parenteses.setBackground(Color.BLACK);
        parenteses.setForeground(Color.WHITE);
        parenteses.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        porcent = new JButton("%");
        porcent.setBounds(130, 90, 45, 45);
        porcent.setBackground(Color.BLACK);
        porcent.setForeground(Color.WHITE);
        porcent.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        igual = new JButton("=");
        igual.setBounds(185, 310, 45, 45); //Igual
        igual.setFont(new Font("sansserif", 1, 20));
        igual.setBackground(Color.GREEN);
        igual.setForeground(Color.WHITE);
        igual.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        botaoSoma=new JButton("+");  
        botaoSoma.setBounds(185,255, 45, 45); //MAIS
        botaoSoma.setBackground(Color.BLACK);
        botaoSoma.setForeground(Color.WHITE);
        botaoSoma.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        botaoSub=new JButton("-");  
        botaoSub.setBounds(185, 200, 45, 45); //MENOS
        botaoSub.setBackground(Color.BLACK);
        botaoSub.setForeground(Color.WHITE);
        botaoSub.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        botaoMulti = new JButton("x");
        botaoMulti.setBounds(185, 145, 45, 45); //VEZES
        botaoMulti.setBackground(Color.BLACK);
        botaoMulti.setForeground(Color.WHITE);
        botaoMulti.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        botaoDiv = new JButton("/");
        botaoDiv.setBounds(185, 90, 45, 45); //DIVISÃO
        botaoDiv.setBackground(Color.BLACK);
        botaoDiv.setForeground(Color.WHITE);
        botaoDiv.setBorder(BorderFactory.createLineBorder(Color.WHITE));       
        
        maismenos.addActionListener(this);
        n0.addActionListener(this);
        virgula.addActionListener(this);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        c.addActionListener(this);
        parenteses.addActionListener(this);
        porcent.addActionListener(this);
        igual.addActionListener(this);
        botaoSoma.addActionListener(this);  
        botaoSub.addActionListener(this); 
        botaoMulti.addActionListener(this);
        botaoDiv.addActionListener(this);
        
        janela.add(campoNum1);
        janela.add(campoNum2);
        janela.add(resultado);
        janela.add(maismenos);
        janela.add(n0);
        janela.add(virgula);
        janela.add(n1);
        janela.add(n2);
        janela.add(n3);
        janela.add(n4);
        janela.add(n5);
        janela.add(n6);
        janela.add(n7);
        janela.add(n8);
        janela.add(n9);
        janela.add(c);
        janela.add(parenteses);
        janela.add(porcent);
        janela.add(igual);
        janela.add(botaoSoma);
        janela.add(botaoSub);
        janela.add(botaoMulti);
        janela.add(botaoDiv);
        janela.setSize(265,400);  
        janela.setLayout(null);  
        janela.setVisible(true);  
    }

	public static void main(String[] args) {
		new Calculadora();
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		String tot = "";
		
		if (evento.getSource() == n1) {
			resultado.setText("1" +tot);
			tot = "1";
		} 
		
		else if (evento.getSource() == n2) {
			tot += "2";
			resultado.setText(tot);
		}
	}
}