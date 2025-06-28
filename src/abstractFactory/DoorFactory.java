package abstractFactory;

public class DoorFactory {
	public static Door createDoor(VendorId vendorId) {
		Door door = null;
		switch (vendorId) {
			case LG:
				door = new LGDoor();
				break;
			case HYUNDAI:
				door = new HyundaiDoor();
				break;
		}
		return door;
	}
}
