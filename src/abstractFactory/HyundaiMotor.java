package abstractFactory;

public class HyundaiMotor extends Motor {

	@Override
	protected void driveMotor() {
		System.out.println("move Hyundai Motor");
	}
}
