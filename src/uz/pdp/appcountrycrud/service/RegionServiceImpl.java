package uz.pdp.appcountrycrud.service;

import uz.pdp.appcountrycrud.entity.Region;
import uz.pdp.appcountrycrud.payload.RegionDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RegionServiceImpl implements RegionService{
    private  static RegionServiceImpl instance;
    public List<Region> regions = new ArrayList<>();
    private static Lock lock = new ReentrantLock();
    private RegionServiceImpl(){

    }
    private static RegionServiceImpl getInstance(){
        if (Objects.isNull(instance)){
            lock.lock();
            if (Objects.isNull(instance))
                instance= new RegionServiceImpl();
            lock.unlock();
        }
        return instance;
    }
    @Override
    public List<RegionDTO> all() {
        return null;
    }

    @Override
    public RegionDTO add(RegionDTO regionDTO) {
        return null;
    }

    @Override
    public RegionDTO edit(Integer id, RegionDTO regionDTO) {
        return null;
    }

    @Override
    public String delete(Integer id) {
        return null;
    }

    @Override
    public Region getByIdOrElseThrow(Integer id) {
        return null;
    }
}
