package co.edu.iudigital.helpmeiud.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTO {


    Long id;

    String nombre;

    String apellido;

    String userName;

    Boolean redSocial;

    LocalDate fechaNacimiento;

    String imagen;

    boolean disponibilidad;

    List<String> roles;
}
