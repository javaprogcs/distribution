package test.dao;

import java.util.List;
import test.entity.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer city_id);

    int insert(City record);

    City selectByPrimaryKey(Integer city_id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}