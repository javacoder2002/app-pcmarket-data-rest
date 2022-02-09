package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.MonoBlock;
import uz.pdp.apppcmarketdatarest.projection.CustomMonoBlock;

@RepositoryRestResource(
        path = "monoBlock",
        collectionResourceRel = "monoBlocks",
        excerptProjection = CustomMonoBlock.class
)
public interface MonoBlockRepository extends JpaRepository<MonoBlock,Integer> {

    @RestResource(path = "byName")
    Page<MonoBlock> findAllByName(@Param("name") String name, Pageable pageable);

}
