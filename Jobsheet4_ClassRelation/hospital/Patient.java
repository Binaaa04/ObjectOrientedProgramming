import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    private String numberMedicRecord;
    private String name;
    private ArrayList<Consultation> consultationHistory;

    public String getnumberMedicRecord() {
        return numberMedicRecord;
    }

    public void setnumberMedicRecord(String numberMedicRecord) {
        this.numberMedicRecord = numberMedicRecord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient(String numberMedicRecord, String name) {
        this.numberMedicRecord = numberMedicRecord;
        this.name = name;
        this.consultationHistory = new ArrayList<Consultation>();
    }

    public String getInfo() {
        String info = "";
        info += "Number Medic Record : " + this.numberMedicRecord + "\n";
        info += "Name                : " + this.name + "\n";
        info += "\n";
        if (!consultationHistory.isEmpty()) {
            info += " Consultation history : \n";

            for (Consultation consultation : consultationHistory) {
                info += consultation.getInfo();
            }
        } else {
            info += "no history of consultation";
        }
        return info;
    }

    public void addConsultation(LocalDate date, Employee doctor, Employee nurse) {
        Consultation consultation = new Consultation();
        consultation.setDate(date);
        consultation.setDoctor(doctor);
        consultation.setNurse(nurse);
        consultationHistory.add(consultation);
    }
}
