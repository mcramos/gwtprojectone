package br.com.mcr.client;

import br.com.mcr.client.layout.MainWindow;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTProjectOne implements EntryPoint {

	public void onModuleLoad() {
		MenuBar menu = new MenuBar();
		MenuBar mbarProd = new MenuBar(true);
		MenuItem menuProduto = new MenuItem("Produto", mbarProd);
		MenuItem cadastro = new MenuItem("Cadastro", new ScheduledCommand() {
			
			@Override
			public void execute() {
				// abrir janela de cadastro de produto
			}
		});
		MenuItem promocao = new MenuItem("Promoção", new ScheduledCommand() {
			
			@Override
			public void execute() {
				
			}
		});
		
		mbarProd.addItem(cadastro);
		mbarProd.addItem(promocao);
		
		menu.addItem(menuProduto);
		
//		ClienteUI tb = new ClienteUI();
		MainWindow mw = new MainWindow();
//		VerticalPanel vp = new VerticalPanel();
//		vp.add(mw);

		RootPanel.get().add(mw);
	}
}
