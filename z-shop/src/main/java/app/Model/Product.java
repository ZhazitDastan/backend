package app.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Double price;
    private int quantity;

    @ElementCollection
    private List<String> photos;

   @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<Review> reviews;


}
