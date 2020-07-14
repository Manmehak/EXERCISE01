import java.util.Scanner;

public class PatientTest {
    public static PatientInfo patientReport;
	public static void main(String[] args) {
		int newpatientId;
	    String newfirstName;
		String newlastName;
		String newaddress;
		String newcity;
		String newprovince;
		int newpostalCode;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Patient's Id: ");
		newpatientId = input.nextInt();
		
		System.out.println("Enter Patient's Firstname: ");
		newfirstName = input.next();
		
		System.out.println("Enter Patient's Lastname: ");
		newlastName = input.next();
		
		System.out.println("Enter Patient's Address: ");
		newaddress = input.next();
		
		System.out.println("Enter Patient's City: ");
		newcity = input.next();
		
		System.out.println("Enter Patient's Province: ");
		newprovince = input.next();
		
		System.out.println("Enter Patient's Postalcode: ");
		newpostalCode = input.nextInt();
		
		patientReport = new PatientInfo(newpatientId, newfirstName,newlastName,newaddress , newcity);
		patientReport.setProvince(newprovince);
		patientReport.setPostalCode(newpostalCode);

		System.out.printf("Person PatientId: %d \n Firstname:%s \n Lastname:%s \n Address: %s \n City: %s \n Province: %s \n Postalcode: %d ",
				patientReport.getPatientId(),patientReport.getFirstName(),patientReport.getLastName(),patientReport.getAddress(),
				patientReport.getCity(),patientReport.getProvince(),patientReport.getPostalCode());

	}

}
