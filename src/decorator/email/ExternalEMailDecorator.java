package decorator.email;

public class ExternalEMailDecorator extends ContentDecorator {

	public ExternalEMailDecorator(EMailContent eMailContent) {
		super(eMailContent);
	}

	public String getContent() {
		String content = super.getContent();
		String externalContent = addDisclaimer(content);
		return externalContent;
	}

	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}

}
