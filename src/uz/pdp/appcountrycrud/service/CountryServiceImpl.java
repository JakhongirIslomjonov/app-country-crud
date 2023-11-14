package uz.pdp.appcountrycrud.service;

import uz.pdp.appcountrycrud.entity.Country;
import uz.pdp.appcountrycrud.payload.CountryDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountryServiceImpl implements CountryService{
    private  static CountryServiceImpl instance;
    public List<Country> countries = new ArrayList<>();

   private static Lock lock = new ReentrantLock();
    private CountryServiceImpl(){

    }
    private static CountryServiceImpl getInstance(){
       if (Objects.isNull(instance)){
           lock.lock();
           if (Objects.isNull(instance))
               instance= new CountryServiceImpl();
           lock.unlock();
       }
       return instance;

    }
    @Override
    public List<CountryDTO> getByRegion(Integer countryId) {
        countries
                .stream();


        return null;
    }

    @Override
    public CountryDTO getById(Integer id) {

        return null;
    }

    @Override
    public CountryDTO add(CountryDTO countryDTO) {
        return null;
    }

    @Override
    public CountryDTO edit(Integer id, CountryDTO countryDTO) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {

        return false;
    }

    @Override
    public String read(Integer id) {
        return null;
    }

    @Override
    public boolean serialize() {
        return false;
    }

    @Override
    public boolean deserialize() {
        return false;
    }
}
