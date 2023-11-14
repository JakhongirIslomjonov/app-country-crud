package uz.pdp.appcountrycrud.payload;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class CountryDTO {
    List<Collector> collectors= new ArrayList<>();

    private Integer id;
    private String name;
    private String flagUrl;
    private String desccriptionFilePath;
    private LocalDate establishmentDate;
    private Double square;

    public CountryDTO(Integer id, String name, String flagUrl, String desccriptionFilePath, LocalDate establishmentDate, Double square) {
        this.id = id;
        this.name = name;
        this.flagUrl = flagUrl;
        this.desccriptionFilePath = desccriptionFilePath;
        this.establishmentDate = establishmentDate;
        this.square = square;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public String getDesccriptionFilePath() {
        return desccriptionFilePath;
    }

    public void setDesccriptionFilePath(String desccriptionFilePath) {
        this.desccriptionFilePath = desccriptionFilePath;
    }

    public LocalDate getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(LocalDate establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flagUrl='" + flagUrl + '\'' +
                ", desccriptionFilePath='" + desccriptionFilePath + '\'' +
                ", establishmentDate=" + establishmentDate +
                ", square=" + square +
                '}';
    }
}
