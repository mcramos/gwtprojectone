package br.com.mcr.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ClienteServiceAsync {

	void save(Cliente cliente, AsyncCallback<String> callback);

	void consultaPorNome(String nome, AsyncCallback<Cliente> callback);

	void consultaPorCpf(String cpf, AsyncCallback<Cliente> callback);

	void consultaPorTelefone(String telefone, AsyncCallback<Cliente> callback);

}
