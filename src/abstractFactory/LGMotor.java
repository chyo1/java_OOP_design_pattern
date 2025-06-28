package abstractFactory;

public class LGMotor extends Motor {

	@Override
	protected void driveMotor() {
		System.out.println("move LG Motor");
	}
}
