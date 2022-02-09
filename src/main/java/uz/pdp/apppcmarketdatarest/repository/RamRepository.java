package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.Ram;
import uz.pdp.apppcmarketdatarest.projection.CustomRam;

@RepositoryRestResource(
        path = "ram",
        collectionResourceRel = "rams",
        excerptProjection = CustomRam.class
)
public interface RamRepository extends JpaRepository<Ram,Integer> {

    @RestResource(path = "byName")
    Page<Ram> findAllByName(@Param("name") String name, Pageable pageable);

}
