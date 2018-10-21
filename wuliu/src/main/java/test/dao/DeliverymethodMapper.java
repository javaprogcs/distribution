package test.dao;

import java.util.List;
import test.entity.Deliverymethod;

public interface DeliverymethodMapper {
    int deleteByPrimaryKey(Integer del_id);

    int insert(Deliverymethod record);

    Deliverymethod selectByPrimaryKey(Integer del_id);

    List<Deliverymethod> selectAll();

    int updateByPrimaryKey(Deliverymethod record);
}