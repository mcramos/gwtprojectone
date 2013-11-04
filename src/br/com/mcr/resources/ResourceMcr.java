package br.com.mcr.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface ResourceMcr extends ClientBundle {

	public static final ResourceMcr INSTANCE = GWT.create(ResourceMcr.class);
	
	public interface MyCssResource extends CssResource{
		public String minhaclasse();
		public String dialogContent();
		public String fontupper();
	}
	
	@Source("First.css")
	public MyCssResource style();

}
