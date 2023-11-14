package uz.pdp.appcountrycrud.service;

import uz.pdp.appcountrycrud.entity.Region;
import uz.pdp.appcountrycrud.payload.RegionDTO;

import java.util.List;

public interface RegionService {

    List<RegionDTO> all();

    RegionDTO add(RegionDTO regionDTO);

    RegionDTO edit(Integer id, RegionDTO regionDTO);

    String delete(Integer id);

    Region getByIdOrElseThrow(Integer id);

}
