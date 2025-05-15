package med.voll.api.doctor;

import med.voll.api.address.DTOAddress;

public record DTORegisterDoctor(String name, String email, String crm, Specialty specialty, DTOAddress address) {
    // Constructor, getters, and other methods can be added here if needed
}
