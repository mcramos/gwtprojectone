package br.com.mcr.client.layout;

import br.com.mcr.client.Cliente;
import br.com.mcr.client.ClienteService;
import br.com.mcr.client.ClienteServiceAsync;
import br.com.mcr.resources.ResourceMcr;
import br.com.mcr.resources.ResourceMcr.MyCssResource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class ClienteUI extends Composite implements HasText {

	private static final MyCssResource STYLE = ResourceMcr.INSTANCE.style();
	private static TesteBinderUiBinder uiBinder = GWT
			.create(TesteBinderUiBinder.class);

	interface TesteBinderUiBinder extends UiBinder<Widget, ClienteUI> {
	}

	@UiField Button button;
	@UiField Button btnSair;
	@UiField TextBox nome;
	@UiField TextBox rg;
	@UiField TextBox cpf;
	private ClienteServiceAsync service = GWT.create(ClienteService.class);
	
	
	public ClienteUI() {
		STYLE.ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));
		button.setText("Salvar");
		nome.addStyleDependentName("Fontupper");
		rg.addStyleDependentName("Fontupper");
		cpf.addStyleDependentName("Fontupper");
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}
	
	@UiHandler("button")
	void chupaEssaManga(ClickEvent e){
		Cliente c = new Cliente();
		c.setNome(nome.getText());
		c.setCpf(cpf.getText());
		c.setRg(rg.getText());
		AsyncCallback<String> callback = new AsyncCallback<String>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("OPS!");
				
			}

			@Override
			public void onSuccess(String result) {
				Window.alert(result+"\nSalvou com sucesso!");
				
			}
		};
		service.save(c, callback);
	}
}
