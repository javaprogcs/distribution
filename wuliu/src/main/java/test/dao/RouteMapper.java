package test.dao;

import java.util.List;
import test.entity.Route;

public interface RouteMapper {
    int deleteByPrimaryKey(Integer route_id);

    int insert(Route record);

    Route selectByPrimaryKey(Integer route_id);

    List<Route> selectAll();

    int updateByPrimaryKey(Route record);
}