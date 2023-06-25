/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 * @param <T>
 */
public abstract class AbstractModel<T> {

    protected SQLStorage sqlStorage;

    public AbstractModel(SQLStorage sqlStorage) {
        this.sqlStorage = sqlStorage;
    }

    protected SQLExecuteResult<Boolean> Create(T data) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<Boolean> Update(T data) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<Boolean> DeleteByINTID(int id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<Boolean> DeleteByUUID(UUID id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<T> FindByUUID(UUID id) {
        return new SQLExecuteResult();
    }
    
    protected SQLExecuteResult<T> FindByINTID(int id) {
        return new SQLExecuteResult();
    }

    protected SQLExecuteResult<ArrayList<T>> FindByALL() {
        return new SQLExecuteResult();
    }
}
