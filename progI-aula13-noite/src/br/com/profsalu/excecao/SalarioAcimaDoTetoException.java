package br.com.profsalu.excecao;

public class SalarioAcimaDoTetoException extends Exception{
	public SalarioAcimaDoTetoException() {
		super("O salario n�o pode superior ao teto da empresa.");
	}
}
