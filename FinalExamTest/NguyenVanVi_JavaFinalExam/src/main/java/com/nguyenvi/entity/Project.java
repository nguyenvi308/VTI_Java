package com.nguyenvi.entity;

import java.util.List;

/**
 * Project: TemplateExam
 * Package: com.nguyenvi.entity
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 8:20 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Project {

    private int projectId;
    private int teamSize;
    private int idManager;
    private List<Employee> employees;

    public Project(int projectId, int teamSize, int idManager,  List<Employee> employees) {
        this.projectId = projectId;
        this.teamSize = teamSize;
        this.idManager = idManager;
       this.employees = employees;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", teamSize=" + teamSize +
                ", idManager=" + idManager +
                ", Employee=" + getEmployees() +
                '}';
    }
}
