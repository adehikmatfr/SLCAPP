/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storage;

/**
 *
 * @author Administrator
 * @param <T>
 */
public class SQLExecuteResult<T> {

    private final boolean success;
    public T result;
    private String errorMessage;

    public SQLExecuteResult() {
        this.success = false;
    }

    public SQLExecuteResult(boolean success, T result) {
        this.success = success;
        this.result = result;
    }

    public SQLExecuteResult(boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
