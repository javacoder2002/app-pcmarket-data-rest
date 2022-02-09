package uz.pdp.apppcmarketdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarketdatarest.entity.Printer;
import uz.pdp.apppcmarketdatarest.projection.CustomPrinter;

@RepositoryRestResource(
        path = "printer",
        collectionResourceRel = "printers",
        excerptProjection = CustomPrinter.class
)
public interface PrinterRepository extends JpaRepository<Printer,Integer> {

    @RestResource(path = "byName")
    Page<Printer> findAllByName(@Param("name") String name, Pageable pageable);

}
