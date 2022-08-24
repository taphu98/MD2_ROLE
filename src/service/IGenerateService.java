package service;

import java.util.List;

public interface IGenerateService<T>{
    List<T> findAll();
    void save(T t);

}
