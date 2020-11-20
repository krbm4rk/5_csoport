package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.controller.dto.FoglalasDto;
import hu.uni.eku.tzs.controller.dto.FoglalasRecordRequestDto;
import hu.uni.eku.tzs.model.Foglalas;
import hu.uni.eku.tzs.service.FoglalasService;
import hu.uni.eku.tzs.service.exceptions.FoglalasAlreadyExistsExeptions;
import hu.uni.eku.tzs.service.exceptions.FoglalasNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/foglalas")
@RequiredArgsConstructor
@Api(tags = "Foglalas")
@Slf4j

public class FoglalasController {
    private final FoglalasService service;

    @GetMapping(value = {"/"},produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Keresd meg a foglalast")
    public Collection<FoglalasDto>fetchAll(){
            return  FoglalasService.fetchAll().stream().map(foglalas -> FoglalasDto.builder()
                .Foglalas_Id(foglalas.getFoglalas_Id())
                .cellaSzam(foglalas.getCellaSzam())
                .erkezes(foglalas.getErkezes())
                .tavozas(foglalas.getTavozas())
                .vezeteknev(foglalas.getVezeteknev())
                .keresztnev(foglalas.getKeresztnev())
                .telefonszam(foglalas.getTelefonszam())
                .tipus(foglalas.getTipus())
                .aram(foglalas.isAram())
                .build()
        ).collect(Collectors.toList());
    }
    @PostMapping(value = {"/create"})
    @ApiOperation(value = "foglalás létrehozása")
    public  void create(@RequestBody FoglalasRecordRequestDto request){
        try {

        }
    }
}
