import java.util.*;
class Patient{
    private int patientId;
    private String patientName;
    private ArrayList<String> medications = new ArrayList<>();

    public Patient(String name, int id){
        this.patientName = name;
        this.patientId = id; 
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