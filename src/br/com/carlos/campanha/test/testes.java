package br.com.carlos.campanha.test;

import java.util.List;

import br.com.carlos.campanha.dao.CampanhaDAO;
import br.com.carlos.campanha.modelo.Campanha;

import com.sun.jersey.core.util.Base64;

public class testes {

	public static void main(String[] args) {
		CampanhaDAO c = new CampanhaDAO();
		List<Campanha> lc=  c.getListCampanhaValida();
		
		for (Campanha campanha : lc) {
			campanha.getDataFim();
		}


	}
	
	

}
