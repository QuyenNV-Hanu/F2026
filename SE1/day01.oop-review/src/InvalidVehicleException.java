public class InvalidVehicleException extends Throwable {
	public InvalidVehicleException(String message) {
		super("Invalid Vehicle: " + message);
	}
}
