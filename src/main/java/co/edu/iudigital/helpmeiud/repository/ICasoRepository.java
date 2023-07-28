package co.edu.iudigital.helpmeiud.repository;

import co.edu.iudigital.helpmeiud.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICasoRepository extends JpaRepository <Caso, Long>{


    //UPDATE NOMBRE_TABLE SET es_visible=false WHERE id=2; actualizo a no visible el caso 2
    @Query("UPDATE Caso c SET c.esVisible=?1 WHERE id=?2")
    Boolean setVisible(Boolean visible, Long id);
}
