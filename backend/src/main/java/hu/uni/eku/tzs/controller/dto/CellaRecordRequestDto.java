package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CellaRecordRequestDto
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
