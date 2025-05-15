package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DTOAddress(
        @NotBlank
        String street,
        String number,
        @NotBlank
        String neighborhood,
        @NotBlank
        String city,
        @NotBlank
        String state,
        @Pattern(regexp = "\\d{5}-\\d{3}")
        String zip,
        String complement
) {
    // Constructor, getters, and other methods can be added here if needed
}
