package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CellaDto
{
    private int cella_id;

    private boolean allapot;

    private LocalDateTime erkezes;
    private LocalDateTime tavozas
    private String vezeteknev;
    private String keresztnev;
    private boolean aram;
    private int tipus;

}
