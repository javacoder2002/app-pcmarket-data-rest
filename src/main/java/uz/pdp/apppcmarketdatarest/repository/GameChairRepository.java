package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.GameChair;
import uz.pdp.apppcmarketdatarest.projection.CustomGameChair;

@RepositoryRestResource(
        path = "gameChair",
        collectionResourceRel = "sameChairs",
        excerptProjection = CustomGameChair.class
)
public interface GameChairRepository extends JpaRepository<GameChair,Integer> {

    @RestResource(path = "byName")
    Page<GameChair> findAllByName(@Param("name") String name, Pageable pageable);

}
