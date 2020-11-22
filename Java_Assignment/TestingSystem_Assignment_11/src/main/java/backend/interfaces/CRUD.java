package backend.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface CRUD<T> {

    List<T> getList() throws SQLException, ClassNotFoundException;
    void create();
    T getById(int id) throws Exception;
    boolean  isExists(String name) throws SQLException;
    boolean  isExists(int id) throws SQLException;
    int update(int id);
    int delete(int id) throws SQLException;

}
