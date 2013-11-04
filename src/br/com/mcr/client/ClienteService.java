package br.com.mcr.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("serviceCli")
public interface ClienteService extends RemoteService {

	String save(Cliente cliente) throws IllegalArgumentException;
	Cliente consultaPorNome(String nome) throws Exception;
	Cliente consultaPorCpf(String cpf) throws Exception;
	Cliente consultaPorTelefone(String telefone) throws Exception;
}
