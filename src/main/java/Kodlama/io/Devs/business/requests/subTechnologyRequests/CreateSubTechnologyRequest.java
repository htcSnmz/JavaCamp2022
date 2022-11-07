package Kodlama.io.Devs.business.requests.subTechnologyRequests;

public class CreateSubTechnologyRequest {
	
	private String name;
	private int languageId;
	
	public CreateSubTechnologyRequest() {
		super();
	}

	public CreateSubTechnologyRequest(String name, int languageId) {
		super();
		this.name = name;
		this.languageId = languageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
}