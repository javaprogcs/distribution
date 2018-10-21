package test.dao;

import java.util.List;
import test.entity.Vehicle;

public interface VehicleMapper {
    int deleteByPrimaryKey(Integer vehicle_id);

    int insert(Vehicle record);

    Vehicle selectByPrimaryKey(Integer vehicle_id);

    List<Vehicle> selectAll();

    int updateByPrimaryKey(Vehicle record);
}