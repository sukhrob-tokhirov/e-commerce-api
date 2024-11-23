package sukhrob.development.e_commerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import sukhrob.development.e_commerce.entities.template.AbsEntity;

import java.util.UUID;

@Entity(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SQLDelete(sql = "update categories set deleted=true where id=?")
@SQLRestriction(value = "deleted=false")
public class Category extends AbsEntity {

    @Column(name = "parent_id")
    private UUID parentCategory;

    private String name;

}
