/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 * @param <T>
 */
public class ServiceResult<T> {

    private boolean success;
    public T singleResult;
    public ArrayList<T> groupResult;
    private ArrayList<String> errors;

    public ServiceResult() {
        this.success = false;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess() {
        this.success = true;
    }

    public T getSingleResult() {
        return singleResult;
    }

    public void setSingleResult(T result) {
        this.singleResult = result;
    }

    public ArrayList<T> getGroupResult() {
        return groupResult;
    }

    public void setGroupResult(ArrayList<T> result) {
        this.groupResult = result;
    }

    public String errorDetail() {
        return String.join(",", this.errors);
    }
}
