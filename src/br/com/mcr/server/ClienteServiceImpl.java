package br.com.mcr.server;

import br.com.mcr.client.Cliente;
import br.com.mcr.client.ClienteService;

import com.google.gson.Gson;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ClienteServiceImpl extends RemoteServiceServlet implements
		ClienteService {

	private static final long serialVersionUID = 1L;

	@Override
	public String save(Cliente cliente) {
		Gson gson = new Gson();
		String jsCliente = gson.toJson(cliente);
		System.out.println(jsCliente);
//		FileOutputStream fos = new FileOutputStream("cliente.x");
		
		// verificar se já existe.. se existir, update caso contrario, salva.
		return null;
	}

	@Override
	public Cliente consultaPorNome(String nome) throws Exception {
		return null;
	}

	@Override
	public Cliente consultaPorCpf(String cpf) throws Exception {
		return null;
	}

	@Override
	public Cliente consultaPorTelefone(String telefone) throws Exception {
		return null;
	}

}
