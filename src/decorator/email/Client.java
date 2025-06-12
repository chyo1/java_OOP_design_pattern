package decorator.email;

public class Client {

	public static void main(String[] args) {
		BasicEMailContent simple = new BasicEMailContent("Hello");
		System.out.println(simple.getContent());

		ExternalEMailDecorator external = new ExternalEMailDecorator(simple);
		System.out.println(external.getContent());

		SecureEMailContent secure = new SecureEMailContent(simple);
		System.out.println(secure.getContent());

	}

}
