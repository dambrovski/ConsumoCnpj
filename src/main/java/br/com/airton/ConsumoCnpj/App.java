package br.com.airton.ConsumoCnpj;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) throws IOException {
		 
		 	Scanner sc = new Scanner(System.in);

	        Boolean menu = true;
	        String opcao = null;
	        
	        while(menu) {
	        	
				String codCnpj = null;
				System.out.println("Digite o Número do CNPJ: ");
				codCnpj = sc.next();
				
		       // System.out.println(br.com.airton.ConsumoCep.ClienteWS.getEnderecoPorCep(codCep));
		        
		        Cnpj cnpj = new Cnpj();
		        
		        ClienteWS cliWS = new ClienteWS();
		        cnpj = cliWS.getClientePorCnpj(codCnpj);
		        
		        System.out.println("CNPJ: " + cnpj.getCnpj());
		        System.out.println("Nome: " + cnpj.getNome());
		        System.out.println("Fantasia: " + cnpj.getFantasia());
		        System.out.println("Email: " + cnpj.getEmail());
		        System.out.println("--------------------------------------------------------");

	        	
	        }
		


	
	
	}

}
