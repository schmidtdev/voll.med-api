package med.voll.api.doctor;

public record ListDoctor(String name, String email, String crm, String specialty) {

    public ListDoctor(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty().name());
    }

}
