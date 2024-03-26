package mx.com.bank.AgenciaViajeTA.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.com.bank.AgenciaViajeTA.model.ApplicationItem;
import java.util.List;

/**
 * Created by
 */
@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationItem, Long> {

    List<ApplicationItem> findApplicationEntriesByApplicationCode(String applicationCode);

}
