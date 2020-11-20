package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cella
{
    private int cella_id;

    private boolean allapot;

    private LocalDateTime erkezes;
    private LocalDateTime tavozas;
    private String vezeteknev;
    private String keresztnev;
    private boolean aram;
    private int tipus;

}
