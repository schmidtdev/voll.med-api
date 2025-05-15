package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.DTORegisterDoctor;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid DTORegisterDoctor data) {
        repository.save(new Doctor(data));
    }

}
