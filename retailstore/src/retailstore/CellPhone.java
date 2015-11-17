package retailstore;

public class CellPhone {

	String brand;
	String model;
	int year;
	String serialNumber;

	CellPhone(String brand, String model, int year, String serialNumber) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.serialNumber = serialNumber;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	void print() {
		System.out.println("Brand:\t" + this.brand);
		System.out.println("Model:\t" + this.model);
		System.out.println("Year:\t" + this.year);
		System.out.println("Serial Number:\t" + this.serialNumber);
		System.out.println("\n");
	}

}
