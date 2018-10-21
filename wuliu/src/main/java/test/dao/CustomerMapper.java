package test.dao;

import java.util.List;
import test.entity.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cust_id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer cust_id);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);
}