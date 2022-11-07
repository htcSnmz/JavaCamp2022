package Kodlama.io.Devs.business.requests.languageRequests;


public class CreateLanguageRequest {

	private String name;

	public CreateLanguageRequest() {
		super();
	}

	public CreateLanguageRequest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
