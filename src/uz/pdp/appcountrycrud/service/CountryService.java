package uz.pdp.appcountrycrud.service;

import uz.pdp.appcountrycrud.payload.CountryDTO;

import java.util.List;

public interface CountryService {
    //1
    List<CountryDTO> getByRegion(Integer counteryId);

    //2
    CountryDTO getById(Integer id);

    //3
    CountryDTO add(CountryDTO countryDTO);

    //4
    CountryDTO edit(Integer id, CountryDTO countryDTO);

    //5
    boolean delete(Integer id);

    //6
    String read(Integer id);

    //7
    boolean serialize();

    //8
    boolean deserialize();

}
