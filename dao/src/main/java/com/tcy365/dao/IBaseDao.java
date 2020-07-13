package com.tcy365.dao;

public interface IBaseDao<T> {
     T getById(Long id);

     Long insert(T entity);

     Boolean deleteById(Long id);
}
