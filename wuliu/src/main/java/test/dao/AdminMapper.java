package test.dao;

import java.util.List;
import test.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer admin_id);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer admin_id);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}