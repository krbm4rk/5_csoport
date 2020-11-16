package hu.uni.eku.tzs.dao.entity;

import lombok.*;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

import java.time.LocalDateTime

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cella {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cella_id;
    @Column
    private boolean allapot;
    @Column
    private LocalDateTime imaginaryPart;
    @Column
    private LocalDateTime tavozas
    @Column
    private String vezeteknev;
    @Column
    private String keresztnev;
    @Column
    private boolean aram;
    @Column
    private int tipus;
}
