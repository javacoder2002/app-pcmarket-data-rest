package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.Mouse;
import uz.pdp.apppcmarketdatarest.projection.CustomMouse;

@RepositoryRestResource(
        path = "mouse",
        collectionResourceRel = "mouses",
        excerptProjection = CustomMouse.class
)
public interface MouseRepository extends JpaRepository<Mouse,Integer> {

    @RestResource(path = "byName")
    Page<Mouse> findAllByName(@Param("name") String name, Pageable pageable);

}
