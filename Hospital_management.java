import java.util.Scanner;

class Administration {
    void adminMenu() {
        System.out.println("---- Administration Panel ----");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. Back");
    }
}

class Doctor {
    String name;
    String dept;

    Doctor(String n, String d) {
        name = n;
        dept = d;
    }

    void showDoctor() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Department : " + dept);
    }
}

class Patient {
    String name;
    String disease;

    Patient(String n, String dis) {
        name = n;
        disease = dis;
    }

    void showPatient() {
        System.out.println("Patient Name: " + name);
        System.out.println("Disease     : " + disease);
    }
}

public class Hospital_management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Doctor doctor = null;
        Patient patient = null;

        while (true) {
            System.out.println("\n===== Hospital Management =====");
            System.out.println("1. Administration");
            System.out.println("2. Doctor");
            System.out.println("3. Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    Administration admin = new Administration();
                    admin.adminMenu();
                    System.out.print("Choose: ");
                    int a = sc.nextInt();

                    if (a == 1) {
                        System.out.print("Doctor Name: ");
                        String dn = sc.next();
                        System.out.print("Department : ");
                        String dd = sc.next();
                        doctor = new Doctor(dn, dd);
                        System.out.println("Doctor Added!");
                    }

                    else if (a == 2) {
                        System.out.print("Patient Name: ");
                        String pn = sc.next();
                        System.out.print("Disease     : ");
                        String pd = sc.next();
                        patient = new Patient(pn, pd);
                        System.out.println("Patient Added!");
                    }
                    break;

                case 2:
                    if (doctor != null) doctor.showDoctor();
                    else System.out.println("No doctor added yet!");
                    break;

                case 3:
                    if (patient != null) patient.showPatient();
                    else System.out.println("No patient added yet!");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
