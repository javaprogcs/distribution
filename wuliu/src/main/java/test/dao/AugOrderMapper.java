package test.dao;

import java.util.List;
import test.entity.AugOrder;

public interface AugOrderMapper {
    int deleteByPrimaryKey(Integer order_id);

    int insert(AugOrder record);

    AugOrder selectByPrimaryKey(Integer order_id);

    List<AugOrder> selectAll();

    int updateByPrimaryKey(AugOrder record);
}