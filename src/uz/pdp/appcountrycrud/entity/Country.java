package uz.pdp.appcountrycrud.entity;

import java.time.LocalDate;
import java.util.List;

public class Country {
    private Integer id;
    private String name;
    private String flagUrl;
    private String desccriptionFilePath;
    private LocalDate establishmentDate;
    private Double square;
    private List<Region> regions;

    public Country(Integer id, String name, String flagUrl, String desccriptionFilePath, LocalDate establishmentDate, Double square, List<Region> regions) {
        this.id = id;
        this.name = name;
        this.flagUrl = flagUrl;
        this.desccriptionFilePath = desccriptionFilePath;
        this.establishmentDate = establishmentDate;
        this.square = square;
        this.regions = regions;
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

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flagUrl='" + flagUrl + '\'' +
                ", desccriptionFilePath='" + desccriptionFilePath + '\'' +
                ", establishmentDate=" + establishmentDate +
                ", square=" + square +
                ", regions=" + regions +
                '}';
    }
}
