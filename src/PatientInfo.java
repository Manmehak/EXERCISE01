
public class PatientInfo {
	//Instance variables
	private int _patientId;
	private String _firstName;
	private String _lastName;
	private String _address;
	private String _city;
	private String _province;
	private int _postalCode;
	
	//Getters and setters methods
	
	public int getPatientId() {
		return this._patientId;
	}

	public String getFirstName() {
		return this._firstName;
	}

	public String getLastName() {
		return this._lastName;
	}

	public String getAddress() {
		return this._address;
	}

    public String getCity() {
		return this._city;
	}

	public int getPostalCode() {
		return this._postalCode;
	}

	public void setPostalCode(int postalCode) {
		this._postalCode = postalCode;
	}
	
	public String getProvince() {
		return this._province;
	}

	public void setProvince(String province) {
		this._province = province;
	}
	//Empty constructor
	public PatientInfo() {
		
	}
    //Multi-parameter constructor
	public PatientInfo(int patientId, String firstName, String lastName, String address, String city ) {
		this._firstName= firstName;
		this._lastName = lastName;
		this._patientId= patientId;
		this._address= address;
		this._city= city;
		
		
		
	}

}
