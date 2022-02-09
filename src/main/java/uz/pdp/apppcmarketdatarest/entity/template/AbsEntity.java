package uz.pdp.apppcmarketdatarest.entity.template;

import lombok.Data;
import uz.pdp.apppcmarketdatarest.entity.Attachment;
import uz.pdp.apppcmarketdatarest.entity.Category;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;

    private double price;

    private Integer guarantee;

    private String description;

}
