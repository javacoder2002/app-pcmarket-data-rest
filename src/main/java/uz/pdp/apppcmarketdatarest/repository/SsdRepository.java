package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.Ssd;
import uz.pdp.apppcmarketdatarest.projection.CustomSsd;

@RepositoryRestResource(
        path = "ssd",
        collectionResourceRel = "ssdList",
        excerptProjection = CustomSsd.class
)
public interface SsdRepository extends JpaRepository<Ssd,Integer> {

    @RestResource(path = "byName")
    Page<Ssd> findAllByName(@Param("name") String name, Pageable pageable);

}
