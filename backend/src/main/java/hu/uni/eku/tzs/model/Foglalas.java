package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foglalas {

    private int cellaID;
    private String erkezes;
    private String tavozas;
    private String vezeteknek;
    private String keresztnev;
    private String telefonszam;
    private int tipus;
    private boolean aram;

}