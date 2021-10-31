package cz.forgottenempire.arma3servergui.repositories;

import cz.forgottenempire.arma3servergui.model.CreatorDLC;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatorDLCRepository extends CrudRepository<CreatorDLC, Long> {

    List<CreatorDLC> findAllByEnabledTrue();
}
