package registration.models;

import registration.screens.StudentScreen;

import javax.swing.*;

public class Student extends User {
    private String status;
    private int departmentId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public void login() {

        StudentScreen screen = new StudentScreen(this);
        showScreen(screen);
    }
}
