/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import app.model.base.FilterQuery;
import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 * @param <T>
 */
public abstract class DataAccessModel<T> {

    protected SQLStorage sqlStorage;

    public DataAccessModel(SQLStorage sqlStorage) {
        this.sqlStorage = sqlStorage;
    }

    protected SQLExecuteResult<Boolean> create(T data) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<Boolean> update(T data) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<Boolean> deleteByIntId(int id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<Boolean> deleteByUuid(UUID id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<T> findByUuid(UUID id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<T> findByIntId(int id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<ArrayList<T>> findALL(FilterQuery filterQuery) {
        return new SQLExecuteResult();
    }
}
