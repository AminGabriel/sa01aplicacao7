package br.com.senaitagua.sa1.app7;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.EstoqueBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EstoqueBO etb = new EstoqueBO();
		
		// Entrada de dados
		double p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira peça: "));
		double p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda peça: "));
		double p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira peça: "));
		double p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quarta peça: "));
		double p5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quinta peça: "));
		
		JOptionPane.showMessageDialog(null, "Valor total das peças: " + etb.somarPecas(p1,p2,p3,p4,p5) + ".");

	}

}
