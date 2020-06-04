package br.com.profsalu.excecao;

public class SalarioAcimaDoTetoException extends Exception{
	public SalarioAcimaDoTetoException() {
		super("O salario não pode superior ao teto da empresa.");
	}
}
