package mindswap.Car.Api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String model;


}
