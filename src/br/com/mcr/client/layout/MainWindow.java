package br.com.mcr.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.Widget;

public class MainWindow extends Composite implements HasText{

	private static MainWindowUiBinder uiBinder = GWT
			.create(MainWindowUiBinder.class);


	
	interface MainWindowUiBinder extends UiBinder<Widget, MainWindow> {
	}

	@UiField MenuItem mnCliente;
	@UiField MenuItem mnProduto;
	@UiField MenuItem mnFornecedor;

	public MainWindow() {
		initWidget(uiBinder.createAndBindUi(this));
		applyEvents();
	}


	private void applyEvents() {
		mnCliente.setScheduledCommand(new ScheduledCommand() {
			@Override
			public void execute() {
				new ClienteUI();
			}
		});
		mnProduto.setScheduledCommand(new ScheduledCommand() {
			
			@Override
			public void execute() {
				new ProdutoUI();
			}
		});
		
		mnFornecedor.setScheduledCommand(new ScheduledCommand() {
			
			@Override
			public void execute() {
				Window.alert("Fornecedor abrindo");
			}
		});
	}


	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
	}
}
