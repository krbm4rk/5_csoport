package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoglalasRecordRequestDto {

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