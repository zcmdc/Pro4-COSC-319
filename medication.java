/* This class defines a medication to be delivered to a patient.
 * Its attributes are medication name, dosage in milligrame, severity color code, and delivery method.
 * All attributes can be individually set or retrieved.
 * There is also a function help() for a user to print this info plus current attribute values
 * And medReport() to generate a String describing the Medication.
 */
class Medication{
    String med_name = "null"; //name of the medication
    double dosage_mg = 0.0; //dosage in milligrams
    String severity = "null"; //color coded severity in [green, yellow, orange, red]
    String delivery = "null"; //delivery method (pill, syrup, IV, injection, etc.)

    //constructor
    public Medication(String med, double dose, String sever, String deliver){
        this.med_name = med;
        this.dosage_mg = dose;
        this.severity = sever;
        this.delivery = deliver;
    }

    //setters
    public void setMedName(String name){
        this.med_name = name;
    }
    public void setDosage(double dose){
        this.dosage_mg = dose;
    }
    public void setSeverity(String sever){
        this.severity = sever;
    }
    public void setDelivery(String deliver){
        this.delivery = deliver;
    }

    //getters
    public String getMedName(){
        return this.med_name;
    }
    public double getDosage(){
        return this.dosage_mg;
    }
    public String getSeverity(){
        return this.severity;
    }
    public String getDelivery(){
        return this.delivery;
    }

    public void help(){
        System.out.println("This class defines a medication for administration to a patient.");
        System.out.println("It is invoked by Medication(med_name, dosage_mg, severity, delivery).");
        System.out.println("med_name: String, the name of the medication.");
        System.out.printf("Current value: %s", this.med_name);
        System.out.println("dosage_mg: double, the dose to be administered in milligrams.");
        System.out.printf("Current value: %d.2", this.dosage_mg);
        System.out.println("severity: String, the color-coded severity level of the medication. From least to most severe, (Green, Yellow, Orange, Red).");
        System.out.printf("Current value: %s", this.severity);
        System.out.println("delivery: String, how the medication will be administered to the patient (injection, pill, etc.).");
        System.out.printf("Current value: %s", this.delivery);
    }

    public String medReport(){
        return String.format("Medication: %s %.4f mg \n Severity Level: %s \n Delivery Method: %s",
        med_name, dosage_mg, severity, delivery);
    }
}