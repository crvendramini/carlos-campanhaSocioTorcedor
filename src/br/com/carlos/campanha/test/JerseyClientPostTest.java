package br.com.carlos.campanha.test;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPostTest {
	
	public static void main(String[] args) {
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/portalImobiliarioAPI/rest/usuarios/check/auth");
			String input = "{\"login\":\"34708844808\",\"senha\":\"2222\"}";
			
			String token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMToxMToxMToxMSIsInN1YiI6IjI2IiwiZXhwIjoxNTI2NzM4NTc5fQ.0DYzAhQCEXdS4cWpf3Hdjlgl7_7U-Fd5eau4fUcw3OA 11:11:11:11";
//   		    String token = "Bearer eyJhbGciOiJIUzI1NiIsImtleSI6eyJhbGdvcml0aG0iOiJIbWFjU0hBNTEyIiwiZW5jb2RlZCI6IjBYZmNIT3c2WVVwRVFEc1dOVHpNRXNXSlBPaGdpcDdjeER1UmNKWjVFMjJKdGZrMXdlUXNZclBBU1FkVVRNNVV0VWZGSlJuM0oxT0IwUHlVVW1BeWpRPT0iLCJmb3JtYXQiOiJSQVciLCJkZXN0cm95ZWQiOmZhbHNlfX0.eyJzdWIiOiIzNDcwODg0NDgwOHwyMjIyMSIsImV4cCI6MTUyMzk5MzgwNX0.06uGGGeFoQZiC2bqwtue5wKnyiMMtOakuCbWQ84lRpY"; 
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, token).post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "+ response.getStatus());
			}

			
/*			
			Colaborador col = new Colaborador();
			col.setId(26l);
			col.setDeviceUsuarioAPI("11:11:11:11");
			
			ColaboradorBusiness.geraTokenColaborador(col);
*/			
			System.out.println("Saida do Servidor");
//			String output = response.getEntity(String.class);
//			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
