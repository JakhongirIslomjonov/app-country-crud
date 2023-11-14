package uz.pdp.appcountrycrud.payload;

import uz.pdp.appcountrycrud.entity.Country;

import java.util.ArrayList;
import java.util.List;

public class RegionDTO {
    List<Country> countries =new ArrayList<>();

    private Integer idNumber;
    private String name;

    public RegionDTO(Integer idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public Integer getIdNumber() {

        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RegionDTO{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
