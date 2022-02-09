package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.Monitor;
import uz.pdp.apppcmarketdatarest.projection.CustomMonitor;

@RepositoryRestResource(
        path = "monitor",
        collectionResourceRel = "monitors",
        excerptProjection = CustomMonitor.class
)
public interface MonitorRepository extends JpaRepository<Monitor,Integer> {

    @RestResource(path = "byName")
    Page<Monitor> findAllByName(@Param("name") String name, Pageable pageable);

}
