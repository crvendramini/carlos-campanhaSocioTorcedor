package br.com.carlos.campanha.test;

import javax.servlet.ServletContext;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import br.com.carlos.campanha.util.JwtUtil;
import br.com.lelloimoveis.portal.entity.Colaborador;
import br.com.lelloimoveis.portal.util.HibernateUtil;
import br.com.lelloimoveis.portal.util.Util;

@Path("/teste")
public class TestService {
	@POST
	@Path("/check/{idColab}")
	public Response geraToken(@PathParam("idColab") Long idColab, @Context ServletContext context){
		
		try{
			System.out.println("bla....");
			HibernateUtil.beginTransaction();
			System.out.println("bla1....");
			Colaborador c = new Colaborador();
			c.setLogin("34708844808");
			c.setSenha("2222");
			String token = JwtUtil.geraToken(c);
			System.out.println(token);
			JwtUtil.validaToken(token, "aa:bb:cc:dd");

			
			return Response.ok("ok").build();
			  
		}catch(Exception e){
			return Response.status(Response.Status.UNAUTHORIZED).entity(Util.getGson().toJson(e.getMessage())).build();
		}finally{
			HibernateUtil.closeSession();
		}
	} 
	

}
