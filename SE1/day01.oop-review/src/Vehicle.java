public class Vehicle {
	private String name;
	private double width;
	private double height;
	private double length;
	private double weight;
	private int seatingCapacity;

	public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity) throws InvalidVehicleException {
		if (!isValidName(name)){
			throw new InvalidVehicleException("Invalid name");
		}
		this.name = name;
		if (!isValidWidth(width)){
			throw new InvalidVehicleException("Invalid width");
		}
		this.width = width;
		if (!isValidHeight(height)){
			throw new InvalidVehicleException("Invalid height");
		}
		this.height = height;
		if (!isValidLength(length)){
			throw new InvalidVehicleException("Invalid length");
		}
		this.length = length;
		if (!isValidWeight(weight)){
			throw new InvalidVehicleException("Invalid weight");
		}
		this.weight = weight;
		if (!isValidSeatingCapacity(seatingCapacity)){
			throw new InvalidVehicleException("Invalid seating capacity");
		}
		this.seatingCapacity = seatingCapacity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) throws InvalidVehicleException {
		if (isValidName(name)) {
			this.name = name;
		}else {
			throw new InvalidVehicleException("Setter.Invalid Name");
		}
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) throws InvalidVehicleException {
		if (isValidWidth(width)){
			this.width = width;
		}else {
			throw new InvalidVehicleException("Setter.Invalid Width");
		}
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) throws InvalidVehicleException {
		if (isValidHeight(height)){
			this.height = height;
		}else {
			throw new InvalidVehicleException("Setter.Invalid Height");
		}
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) throws InvalidVehicleException {
		if (isValidLength(length)) {
			this.length = length;
		}else{
			throw new InvalidVehicleException("Setter.Invalid Length");
		}
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) throws InvalidVehicleException {
		if (isValidWeight(weight)) {
			this.weight = weight;
		}else{
			throw new InvalidVehicleException("Setter.Invalid Weight");
		}
	}

	public int getSeatingCapacity() {
		return this.seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) throws InvalidVehicleException {
		if (isValidSeatingCapacity(seatingCapacity)){
			this.seatingCapacity = seatingCapacity;
		}else{
			throw new InvalidVehicleException("Setter.Invalid Seating Capacity");
		}
	}

	private boolean isValidName(String name) {
		return !name.isEmpty() && name.length() <= 100;
	}

	private boolean isValidWidth(double width){
		return width > 0;
	}

	private boolean isValidHeight(double height) {
		return height > 0;
	}

	private boolean isValidLength(double length) {
		return length > 0;
	}

	private boolean isValidWeight(double weight) {
		return weight > 0;
	}

	private boolean isValidSeatingCapacity(int seatingCapacity) {
		return seatingCapacity > 0;
	}

	public String toString(){
		return "Vehicle[name="+this.getName()+", width="+this.getWidth()+", height="+this.getHeight()+", length="+this.getLength()+", weight="+this.getWidth()+", seating capacity="+this.getSeatingCapacity()+"]";
	}
}
