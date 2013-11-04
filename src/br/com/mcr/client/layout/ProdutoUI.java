package br.com.mcr.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ProdutoUI extends Composite implements HasText {

	private static ProdutoUiBinder uiBinder = GWT.create(ProdutoUiBinder.class);
	@UiField DialogBox wndProduto;

	interface ProdutoUiBinder extends UiBinder<Widget, ProdutoUI> {
	}
	
	@UiField Button btnSair;
	@UiField Button btnGravar;

	public ProdutoUI() {
		initWidget(uiBinder.createAndBindUi(this));
		wndProduto.show();
	}

	public ProdutoUI(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setText(String text) {

	}

	public String getText() {
		return "";
	}
	
	@UiHandler("btnSair")
	void fechaJanela(ClickEvent e){
		wndProduto.hide();
	}
	
	@UiHandler("btnGravar")
	void gravaProduto(ClickEvent e){
		Window.alert("Gravando produto");
	}

}
