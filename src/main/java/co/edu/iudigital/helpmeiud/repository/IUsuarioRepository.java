package co.edu.iudigital.helpmeiud.repository;

import co.edu.iudigital.helpmeiud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findByUserName(String userName); //spring Data JPA

}
