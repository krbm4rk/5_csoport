package hu.uni.eku.tzs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuestDto {
    private UUID Foglalas_Id;
    private int cellaSzam;
    private String erkezes;
    private String tavozas;
    private String vezeteknek;
    private String keresztnev;
    private String telefonszam;
    private int tipus;
    private boolean aram;
}