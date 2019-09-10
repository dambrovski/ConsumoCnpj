package br.com.airton.ConsumoCnpj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;



public class ClienteWS {
	

	// Autor: Airton Silva
		// 09/09/2019

		
		
		// método que irá puxar o endereço pelo CEP já intanciando o objeto Endereco
		public static Cnpj getClientePorCnpj(String codCnpj) {

			JsonObject jsonObject = getCepResponse(codCnpj);
			Cnpj cnpj = null;
			JsonValue erro = jsonObject.get("erro");
			
			//instanciando objeto e posições
	        if (erro == null) {
	        	cnpj = new Cnpj()
	        			.setCnpj(jsonObject.getString("cnpj"))
	        			.setEmail(jsonObject.getString("email"))
	        			.setFantasia(jsonObject.getString("fantasia"))
	        			.setNome(jsonObject.getString("nome"));                    
	        }

	        return cnpj;
	    }



		// MÉTODO QUE IRÁ FAZER A CHAMADA PARA A API
		private static JsonObject getCepResponse(String codCnpj) {

			JsonObject responseJO = null;

			try {

				DefaultHttpClient httpclient = new DefaultHttpClient();				
				HttpGet httpGet = new HttpGet("https://www.receitaws.com.br/v1/cnpj/" + codCnpj);				
				HttpResponse response = httpclient.execute(httpGet);

				HttpEntity entity = response.getEntity();

				responseJO = Json.createReader(entity.getContent()).readObject();

			} catch (Exception e) {
				// TODO: handle exception
			}
			return responseJO;

		}
}
