package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.KeyBoard;
import uz.pdp.apppcmarketdatarest.projection.CustomKeyBoard;

@RepositoryRestResource(
        path = "keyBoard",
        collectionResourceRel = "keyBoards",
        excerptProjection = CustomKeyBoard.class
)
public interface KeyBoardRepository extends JpaRepository<KeyBoard,Integer> {

    @RestResource(path = "byName")
    Page<KeyBoard> findAllByName(@Param("name") String name, Pageable pageable);

}