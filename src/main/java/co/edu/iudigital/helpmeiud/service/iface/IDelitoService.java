package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.request.DelitoDTORequest;
import co.edu.iudigital.helpmeiud.dto.response.DelitoDTO;
import co.edu.iudigital.helpmeiud.exceptions.BadRequestException;
import co.edu.iudigital.helpmeiud.exceptions.RestException;

import java.util.List;

public interface IDelitoService {

    /**
     * consultar todos los usuarios por delitos
     *
     * @return
     */
    List<DelitoDTO> consultarTodos();//TODO: throw exception

    /**
     * Consultar delito por su ID
     * @param id
     * @return
     */
    DelitoDTO consultarPorId(Long id);

    /**
     * Guarda un delito
     * @param delitoDTORequest
     * @return
     */
    DelitoDTO guardarDelito(DelitoDTORequest delitoDTORequest) throws RestException;

    /**
     * Borrar un delito por ID
     * @param id
     */
    void borrarDelitoPorId(Long id);
}
