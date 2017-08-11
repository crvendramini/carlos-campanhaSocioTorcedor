package br.com.carlos.campanha.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/campanha")
public class CampanhaService {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
	public Response efetuaLogin(){
		
		return Response.status(Response.Status.OK).build();
		
	}
	
//	@GET
//	@Path("/inscricao/{parametroBusca}")
//	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
//	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
//	public Response buscaEmailTelefone(@PathParam("parametroBusca") String parametroBusca){
//		LogUtil.logDebug(getClass() ,"GET - /inscricao  -  buscaEmailTelefone");
//		LogUtil.logDebug(getClass() ,"parametroBusca : " + parametroBusca);
//
//		Map<String, Object> respostaJson ;
//		try{
//			HibernateUtil.beginTransaction();
//			Colaborador colaborador = new Colaborador();
//			String tipoBusca = "";
//			if(Util.checkCNPJ(parametroBusca) || Util.checkCPF(parametroBusca)){
//				colaborador.setCNPJ(parametroBusca);
//				tipoBusca = "CPF/CNPJ";
//				if(!Util.isEmpty(colaborador)){
//					colaborador = ColaboradorBusiness.retrieve(colaborador);				
//				}
//	
//				if(!Util.isEmpty(colaborador) && !Util.isEmpty(colaborador.getId())){
//					respostaJson = new LinkedHashMap<String, Object>();
//					respostaJson.put(Messages.getProperty("usuario.email"), !Util.isEmpty(colaborador.getEmail())?colaborador.getEmailMascarado():ParametrosUtil.NULL_STR);	
//					respostaJson.put(Messages.getProperty("usuario.celular"), !Util.isEmpty(colaborador.getCelularCompleto())?colaborador.getTelefoneCelularMascarado():ParametrosUtil.NULL_STR);					
//					return Response.status(Response.Status.OK).entity(Util.getGson().toJson(respostaJson)).build();
//				}else{
//					return montaRespostaErro(Response.Status.NOT_FOUND, Messages.getProperty("usuario.naoEncontrado", tipoBusca, parametroBusca));				
//				}
//			}else{
//				return montaRespostaErro(Response.Status.NOT_FOUND, Messages.getProperty("usuario.naoEncontrado", tipoBusca, parametroBusca));				
//			}
//		}catch(Exception e){
//			HibernateUtil.rollbackTransaction();
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("http.erroGeral"));
//		}finally{
//			HibernateUtil.closeSession();
//		}					
//				
//	}
//	
//	@GET
//	@Path(ParametrosUtil.ENDPOINT_VALIDA_TOKEN+"/{parametroBusca}")
//	@Produces(value=MediaType.APPLICATION_JSON+";charset=utf-8")
//	public Response buscaUsuario(@PathParam("parametroBusca") String parametroBusca){
//		LogUtil.logDebug(getClass() ,"GET -   -  buscaUsuario");
//		LogUtil.logDebug(getClass() ,"parametroBusca : " + parametroBusca);
//
//		Map<String, Object> respostaJson ;
//		try{
//			HibernateUtil.beginTransaction();
//			Colaborador colaborador = new Colaborador();
//			String tipoBusca = "";
//			if(Util.checkCNPJ(parametroBusca) || Util.checkCPF(parametroBusca)){
//				colaborador.setCNPJ(parametroBusca);
//				tipoBusca = "CPF/CNPJ";
//			}else{
//				tipoBusca = "id";
//				if(Util.isNumerico(parametroBusca)){
//					colaborador.setId(Long.valueOf(parametroBusca));					
//				}else{
//					colaborador = null;
//				}
//			}
//			if(!Util.isEmpty(colaborador)){
//				colaborador = ColaboradorBusiness.retrieve(colaborador);				
//			}
//			if(!Util.isEmpty(colaborador) && !Util.isEmpty(colaborador.getId())){
//				respostaJson = new LinkedHashMap<String, Object>();
//				montaRespostaJson(respostaJson, colaborador, false);
//				return Response.status(Response.Status.OK).entity(Util.getGson().toJson(respostaJson)).build();
//			}else{
//				return montaRespostaErro(Response.Status.NOT_FOUND, Messages.getProperty("usuario.naoEncontrado", tipoBusca, parametroBusca));
//			}
//		}catch(Exception e){
//			HibernateUtil.rollbackTransaction();
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("http.erroGeral"));
//		}finally{
//			HibernateUtil.closeSession();
//		}		
//	} 
//	
//	@PUT
//	@Path(ParametrosUtil.ENDPOINT_VALIDA_TOKEN+"/{idColab}")
//	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
//	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
//	public Response alteraUsuario(@PathParam("idColab") String idColab, UsuarioVO usuario){
//		LogUtil.logDebug(getClass() ,"PUT -   -  alteraUsuario");
//		LogUtil.logDebug(getClass() ,"idColab : " + idColab);
//
//		try{
//			HibernateUtil.beginTransaction();
//			Colaborador colaborador = new Colaborador();
//			if(Util.isNumerico(idColab)){
//				colaborador.setId(Long.valueOf(idColab));					
//				colaborador = ColaboradorBusiness.retrieve(colaborador);
//			}else{
//				colaborador = null;
//			}
//			if(!Util.isEmpty(colaborador) && !Util.isEmpty(colaborador.getId())){
//				DeParaVOUtil.usuarioParaColaborador(usuario, colaborador);
//				ColaboradorBusiness.saveOrUpdate(colaborador);
//				HibernateUtil.commitTransaction();
//				return Response.status(Response.Status.NO_CONTENT).build();				
//			}else{
//				return montaRespostaErro(Response.Status.NOT_FOUND, Messages.getProperty("usuario.naoEncontradoAtualizacao", idColab));
//			}
//			
//		}catch(Exception e){
//			HibernateUtil.rollbackTransaction();
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("http.erroGeral"));
//
//		}finally{
//			HibernateUtil.closeSession();
//		}		
//	}
//
//	@POST
//	@Path("/redefine")
//	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
//	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
//	public Response enviaCodigoValidacao(UsuarioVO usuario){
//		LogUtil.logDebug(getClass() ,"POST - /codigo  -  enviaCodigoValidacao");
//		LogUtil.logDebug(getClass() ,"getDados : " + usuario.getDados());
//		
//		Random random = new Random();
//		DecimalFormat formato = new DecimalFormat("000000");
//		Integer codigoAtivacao = random.nextInt(999999);
//		try{
//			HibernateUtil.beginTransaction();
//			Colaborador colaborador = DeParaVOUtil.usuarioParaColaborador(usuario, new Colaborador());
//			if (!Util.isEmpty(usuario.getCpfCnpj())){
//				colaborador.setLogin(usuario.getCpfCnpj());
//				colaborador = ColaboradorBusiness.retrieve(colaborador);
//	
//				if(!Util.isEmpty(colaborador) && !Util.isEmpty(colaborador.getId())){
//
//					//Atualiza o registro do colaborador com o código de validação e a data de validade deste código
//					colaborador.setCodigoVerificacaoTrocaSenha(formato.format(codigoAtivacao));
//					colaborador.setDataValidadeVerificacaoTrocaSenha(Util.geraDataAdicionandoMinutos(10));
//
//					if (usuario.getTipoContato().equals("2")){
//						if (!Util.isEmpty(colaborador.getEmail())){
//							InputStream file = CampanhaService.class.getClassLoader().getResourceAsStream("modelo/email-recuperar-senha.html");
//							String mensagem = Util.readerFile(file, "utf-8");
//							mensagem = mensagem.replace("<!-- CODIGO -->", colaborador.getCodigoVerificacaoTrocaSenha());
//							mensagem = mensagem.replace("<!-- NOME -->", ((Util.isEmpty(colaborador.getNomeResumido()))? colaborador.getNome() : colaborador.getNomeResumido())); 
//							
//							MensagemEmail mensagemMail = new MensagemEmail();
//							mensagemMail.setAssunto("Recuperação de Senha do Aplicativo Lello Imóveis - Proprietários");
//							mensagemMail.setTo(colaborador.getEmail());
//							mensagemMail.setMensagem(mensagem);	
//							Mail.sendMail(mensagemMail);
//						}else{
//							return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("usuario.emailNaoCadastrado"));
//						}
//					}else if (usuario.getTipoContato().equals("1")){
//						if (!Util.isEmpty(colaborador.getTelDDDCelular()) && !Util.isEmpty(colaborador.getTelCelular())){
//							MensagemServicoSMS msg = new MensagemServicoSMS();
//							msg.setDestinatario(colaborador.getTelDDDCelular() + colaborador.getTelCelular());
//							msg.setMensagem("Lello Imoveis - Codigo de ativacao : " + colaborador.getCodigoVerificacaoTrocaSenha());
//
//							ServicoSMS.enviar(msg);						
//						}else{
//							return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("usuario.celularNaoCadastrado"));
//						}
//						
//					}else{
//						return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//					}
//					colaborador.setValidaClassificacao(false);
//					ColaboradorBusiness.saveOrUpdate(colaborador);
//					HibernateUtil.commitTransaction();
//					
//					return Response.status(Response.Status.NO_CONTENT).build();
//				}else{					
//					return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("usuario.invalido"));
//				}
//			}else{
//				return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("usuario.invalido"));
//				
//			}
//		}catch(Exception e){
//			HibernateUtil.rollbackTransaction();
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("http.erroGeral"));
//		}finally{
//			HibernateUtil.closeSession();
//		}
//	}
//
//	@POST
//	@Path("/redefine/confirma")
//	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
//	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
//	public Response redefineSenha(UsuarioVO usuario){
//		LogUtil.logDebug(getClass() ,"POST - /codigo  -  redefineSenha");
//		LogUtil.logDebug(getClass() ,"getDados : " + usuario.getDados());
//
//		Map<String, Object> respostaJson ;
//		try{
//			HibernateUtil.beginTransaction();
//			if(!Util.isEmpty(usuario.getDados())){
//				String[] dados = JwtUtil.getDadosParaLoginAPI(usuario.getDados());
//				if(!Util.isEmpty(dados)){
//					usuario.setDados(dados[0]);
//					usuario.setLogin(dados[1]);
//					usuario.setCodigo(dados[2]);					
//				}
//				Colaborador colaborador = DeParaVOUtil.usuarioParaColaborador(usuario, new Colaborador());
//				if(!Util.isEmpty(usuario.getLogin())){
//					colaborador.setLogin(usuario.getLogin());
//				}
//				colaborador = ColaboradorBusiness.retrieve(colaborador);
//				if(!Util.isEmpty(colaborador) && !Util.isEmpty(colaborador.getId())
//				&&  colaborador.getDataValidadeVerificacaoTrocaSenha().after(new Date())) {
//					respostaJson = new LinkedHashMap<String, Object>();
//					colaborador.setDeviceUsuarioAPI(usuario.getDados());
//					montaRespostaJson(respostaJson, colaborador, true);					
//					return Response.status(Response.Status.OK).entity(Util.getGson().toJson(respostaJson)).build();
//				}else{
//					return montaRespostaErro(Response.Status.UNAUTHORIZED, Messages.getProperty("usuario.codigoInvalido"));
//				}
//			}
//			return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//			
//		}catch(Exception e){
//			HibernateUtil.rollbackTransaction();
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("usuario.erroRedefinirSenha"));
//		}finally{
//			HibernateUtil.closeSession();
//		}
//	}
//
//	@POST
//	@Path("/codigo")
//	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
//	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
//	public Response enviaCodigoValidacaoSemCadastro(Map<String, Object> usuario){
//		
//		try{
//			HibernateUtil.beginTransaction();
//
//				if (!Util.isEmpty(usuario) 						&& 
//					usuario.containsKey("titulo")				&& !Util.isEmpty(usuario.get("titulo")) &&
//					usuario.containsKey("destinatario")  		&& !Util.isEmpty(usuario.get("destinatario")) &&  
//					usuario.containsKey("tipoContato")			&& !Util.isEmpty(usuario.get("tipoContato")) &&
//					usuario.containsKey("nome")					&& !Util.isEmpty(usuario.get("nome")) &&
//					usuario.containsKey("codigo") 			    && !Util.isEmpty(usuario.get("codigo"))) {
//						if (usuario.get("tipoContato").toString().equals("2")){
//							InputStream file = CampanhaService.class.getClassLoader().getResourceAsStream("modelo/email-novo-cadastro-senha.html");
//							String mensagem = Util.readerFile(file, "utf-8");
//							mensagem = mensagem.replace("<!-- CODIGO -->", usuario.get("codigo").toString());
//							mensagem = mensagem.replace("<!-- NOME -->", usuario.get("nome").toString()); 
//							
//							MensagemEmail mensagemMail = new MensagemEmail();
//							mensagemMail.setAssunto(usuario.get("titulo").toString());
//							mensagemMail.setTo(usuario.get("destinatario").toString());
//							mensagemMail.setMensagem(mensagem);	
//							Mail.sendMail(mensagemMail);
//						}else if (usuario.get("tipoContato").toString().equals("1")){
//	
//							MensagemServicoSMS msg = new MensagemServicoSMS();
//							msg.setDestinatario(usuario.get("destinatario").toString());
//							msg.setMensagem( "Lello Imoveis - Codigo de ativacao : " + usuario.get("codigo").toString());
//
//							ServicoSMS.enviar(msg);
//							
//						}
//						return Response.status(Response.Status.OK).build();
//				}else{
//					HibernateUtil.rollbackTransaction();
//					return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//					
//				}
//				
//		}catch(Exception e){
//			HibernateUtil.rollbackTransaction();
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("http.erroGeral"));
//		}finally{
//			HibernateUtil.closeSession();
//		}
//	}
//	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON +";charset=utf-8")
//	@Consumes(MediaType.APPLICATION_JSON +";charset=utf-8")
//	public Response cadastraUsuario(UsuarioVO usuario){
//		
//		Map<String, Object> respostaJson ;
//		try{
//			HibernateUtil.beginTransaction();
//			if(!Util.isEmpty(usuario.getDados())){
//				String[] dados = JwtUtil.getDadosParaLoginAPI(usuario.getDados());
//				if(!Util.isEmpty(dados) && usuario.getCpfCnpj().equals(dados[1]) ){
//					usuario.setDados(dados[0]);
//					usuario.setLogin(dados[1]);
//					usuario.setSenha(dados[2]);					
//					Colaborador colaborador = new Colaborador();
//					if(!Util.isEmpty(usuario.getLogin())){
//						colaborador.setLogin(usuario.getLogin());
//						Colaborador colabExiste = ColaboradorBusiness.retrieve(colaborador);
//						if(Util.isEmpty(colabExiste) ){
//							//Cadastrar novo Colaborador
//							colaborador = DeParaVOUtil.usuarioParaColaborador(usuario, new Colaborador());
//
//							respostaJson = new LinkedHashMap<String, Object>();
//							
//							//Validação dados
//							if(Util.checkCNPJ(usuario.getCpfCnpj()) || Util.checkCPF(usuario.getCpfCnpj())){
//							
//								UsuarioInterno usuarioInterno = new UsuarioInterno(UsuarioInterno.USUARIO_CLIENTE);
//								usuarioInterno = UsuarioInternoBusiness.retrieve(usuarioInterno);
//								
//								Classificacao classificacao = new Classificacao();
//								classificacao.setColaborador(colaborador);
//								classificacao.setContatoComercial(true);
//								colaborador.setDataCadastro(new Timestamp(System.currentTimeMillis()));
//								colaborador.setEmpresa(new Empresa(Empresa.LELLO));
//								colaborador.setUsuarioCadastro(usuarioInterno);
//								
//								ColaboradorBusiness.saveOrUpdate(colaborador);
//								ClassificacaoBusiness.saveOrUpdate(classificacao);
//								
//								HibernateUtil.commitTransaction();
//								montaRespostaJson(respostaJson, colaborador, true);
//								
//								return Response.status(Response.Status.CREATED).entity(Util.getGson().toJson(respostaJson)).build();
//							}else{
//								HibernateUtil.rollbackTransaction();
//								return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//							}
//							
//						}else{
//							HibernateUtil.rollbackTransaction();
//							return montaRespostaErro(Response.Status.CONFLICT, Messages.getProperty("usuario.jaCadastrado"));
//						}
//					}else{
//						HibernateUtil.rollbackTransaction();
//						return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//					}
//				}else{
//					HibernateUtil.rollbackTransaction();
//					return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//				}
//
//			}else{
//				HibernateUtil.rollbackTransaction();
//				return montaRespostaErro(Response.Status.BAD_REQUEST, Messages.getProperty("http.parametrosInvalidos"));
//			}
//		}catch(Exception e){
//			return montaRespostaErro(Response.Status.INTERNAL_SERVER_ERROR, Messages.getProperty("http.erroGeral"));
//		}finally{
//			HibernateUtil.closeSession();
//		}		
//	}
//	
//	private void montaRespostaJson(Map<String, Object> respostaJson, Colaborador colaborador, boolean geraToken) {
//		if (geraToken){
//			String token = JwtUtil.geraToken(colaborador);
//			respostaJson.put(Messages.getProperty("usuario.token"), !Util.isEmpty(token)?token:ParametrosUtil.NULL_STR);
//		}
//		respostaJson.put(Messages.getProperty("usuario.id"), colaborador.getId());
//		respostaJson.put(Messages.getProperty("usuario.login"), colaborador.getLogin());
//		respostaJson.put(Messages.getProperty("usuario.documentoIdentificacao"), colaborador.getCNPJ());
//		respostaJson.put(Messages.getProperty("usuario.nome"), colaborador.getNome());
//		respostaJson.put(Messages.getProperty("usuario.email"), !Util.isEmpty(colaborador.getEmail())?colaborador.getEmail():ParametrosUtil.NULL_STR);	
//		respostaJson.put(Messages.getProperty("usuario.celular"), !Util.isEmpty(colaborador.getCelularCompleto())?colaborador.getCelularCompleto():ParametrosUtil.NULL_STR);
//	}
//
//	private Response montaRespostaErro(Response.Status status, String mensagem) {
//		Map<String, Object> respostaJson;
//		respostaJson = new LinkedHashMap<String, Object>();
//		respostaJson.put(Messages.getProperty("http.status"),status.getStatusCode());
//		respostaJson.put(Messages.getProperty("http.mensagem"), mensagem);			
//		return Response.status(status).entity(Util.getGson().toJson(respostaJson)).build();
//	}
//
	
}
