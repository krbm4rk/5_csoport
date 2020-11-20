package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;
import java.util.UUID;

@Data
@Builder
public class FoglalasDto {
    private UUID Foglalas_Id;
    private int cellaSzam;
    private String erkezes;
    private String tavozas;
    private String vezeteknev;
    private String keresztnev;
    private String telefonszam;
    private int tipus;
    private int aram; //bolean tipus kéne
}
