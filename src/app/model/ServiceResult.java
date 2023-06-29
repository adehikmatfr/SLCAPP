/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;
import storage.SQLExecuteResult;

/**
 *
 * @author Administrator
 * @param <T>
 */
public class ServiceResult<T> {

    private boolean success;
    private T result;
    private final ArrayList<String> errors = new ArrayList<>();

    public ServiceResult() {
        this.success = false;
    }

    public ServiceResult(SQLExecuteResult<T> sqlExecuteResult) {
        this.success = sqlExecuteResult.isSuccess();
        this.errors.add(sqlExecuteResult.getErrorMessage());
        this.result = sqlExecuteResult.getResult();
    }
    
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess() {
        this.success = true;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getErrorDetail() {
        return String.join(",", this.errors);
    }
    
    public void addError(String err){
        this.errors.add(err);
    }
}
