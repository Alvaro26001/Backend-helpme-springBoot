package co.edu.iudigital.helpmeiud.service.iface;


import co.edu.iudigital.helpmeiud.dto.request.UsuarioDTORequest;
import co.edu.iudigital.helpmeiud.dto.response.UsuarioDTO;
import co.edu.iudigital.helpmeiud.exceptions.RestException;
import co.edu.iudigital.helpmeiud.model.Usuario;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUsuarioService {

    /**
     * consultar todos los usuarios
     * @return
     */
    List<UsuarioDTO> consultarTodos();

    /**
     * consultar un usuario por ID
     * @param id
     * @return
     */
    UsuarioDTO consultarPorId(Long id);

    /**
     * consultar usuario por su username o email
     * @param userName
     * @return
     */
    UsuarioDTO consultarPorUserName(String userName);

    UsuarioDTO guardar(UsuarioDTORequest usuarioDTORequest) throws RestException;

    Usuario findByUserName(String username);

    UsuarioDTO userInfo(Authentication authentication) throws RestException;

    Usuario actualizar(Usuario usuario) throws RestException;
}
