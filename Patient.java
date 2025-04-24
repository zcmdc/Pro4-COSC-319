import java.util.*;
class Patient{
    private int patientId;
    private String patientName;
    private ArrayList<String> medications = new ArrayList<>();
    private String patientDOB;

    public Patient(String name, String dob){
        this.patientName = name;
        this.patientId = 12345; 
        this.medications = null;
        this.patientDOB = dob;
    }

    public int getId(){
        return patientId;
    }

    public ArrayList<String> getMedications(){
        return medications;
    }

    public String getName(){
        return patientName;
    }

    public void addMedication(String medication){
        medications.add(medication);
    }
}