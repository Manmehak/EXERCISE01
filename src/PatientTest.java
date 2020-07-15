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
		
		System.out.println("Enter Patient's Firstname: ");
		newfirstName = input.nextLine();
		
		System.out.println("Enter Patient's Lastname: ");
		newlastName = input.nextLine();
		
		System.out.println("Enter Patient's Address: ");
		newaddress = input.nextLine();
		
		System.out.println("Enter Patient's City:");
		newcity = input.nextLine();
		
		System.out.println("Enter Patient's Province: ");
		newprovince = input.nextLine();
		
		System.out.println("Enter Patient's Id:");
		newpatientId = input.nextInt();
				
		System.out.println("Enter Patient's Postalcode: ");
		newpostalCode = input.nextInt();
		
		patientReport = new PatientInfo(newpatientId, newfirstName,newlastName,newaddress , newcity);
		patientReport.setProvince(newprovince);
		patientReport.setPostalCode(newpostalCode);

		System.out.printf(" Person Firstname:%s \n Lastname:%s \n Address: %s \n City: %s \n Province: %s \n PatientId: %d \n Postalcode: %d  ",
				patientReport.getFirstName(),patientReport.getLastName(),patientReport.getAddress(),
				patientReport.getCity(),patientReport.getProvince(),patientReport.getPostalCode(),patientReport.getPatientId());

	}

}
