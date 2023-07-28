package co.edu.iudigital.helpmeiud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTORequest {

    //@UniqueElements(message = "Existe un elemento igual")
    @NotNull(message = "Nombre no puede ser nulo")
    @NotEmpty(message = "Nombre no puede estar vacio")
    String nombre;

    String descripcion;

    @NotNull(message = "Debe proporcionar el ID del usuario")
    @JsonProperty("usuario_id")
    Long usuarioId;
}
