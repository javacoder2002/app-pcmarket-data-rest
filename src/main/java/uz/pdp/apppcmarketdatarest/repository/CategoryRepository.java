package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.Category;
import uz.pdp.apppcmarketdatarest.projection.CustomCategory;

@RepositoryRestResource(
        path = "category",
        collectionResourceRel = "categories",
        excerptProjection = CustomCategory.class
)
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @RestResource(path = "byName")
    Page<Category> findAllByName(@Param("name") String name, Pageable pageable);

}
