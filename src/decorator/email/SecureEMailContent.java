package decorator.email;

public class SecureEMailContent extends ContentDecorator {

	public SecureEMailContent(EMailContent eMailContent) {
		super(eMailContent);
	}

	public String getContent() {
		String content = super.getContent();
		String encryptedContent = encrypt(content);
		return encryptedContent;
	}

	private String encrypt(String content) {
		return content + " Encrypted";
	}
}
