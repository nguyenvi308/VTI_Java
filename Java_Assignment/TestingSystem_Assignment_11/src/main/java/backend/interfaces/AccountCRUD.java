package backend.interfaces;

import java.util.List;

public interface AccountCRUD<T> extends CRUD<T>{
    List<T> getByFullName(String name) throws Exception;
    T getByUserName(String name) throws Exception;
}
