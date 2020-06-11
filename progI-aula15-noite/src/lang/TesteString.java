package lang;

public class TesteString {

	public static void main(String[] args) {
		String msg1 = "Ola mundo!";
		String msg2 = new String("Ola mundo!");
		
		String str = "";
		
		String str1 = null;
		String str2 = "";
		
		str = "mensagem: " + msg1;
		
		System.out.println(str);
		
		//System.out.println(str1.toLowerCase());
		//System.out.println(str2.toLowerCase());
		
		String s = "Salustiano";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a', 2));
		System.out.println(s.replaceAll("J", "L"));
		System.out.println(s.substring(7,10));		
		String cpf = "123.456.789-00";
		System.out.println(cpf.substring(0,3) + cpf.substring(4,7) 
						+ cpf.substring(8, 11) + cpf.substring(12,14));
		String cpfSoNumeros = cpf.substring(0,3) + cpf.substring(4,7) 
		+ cpf.substring(8, 11) + cpf.substring(12,14);
		
		//System.out.println(cpfSoNumeros);
		System.out.println(str2.isEmpty());
		System.out.println(str1 == null);
		System.out.println(cpf.contains("-"));
		
		
	}

}
