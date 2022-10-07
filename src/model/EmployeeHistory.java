/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author deva
 */
public class EmployeeHistory {
    private ArrayList<Employees> history;
    
    public EmployeeHistory() {
        this.history = new ArrayList<Employees>();
    }

    public ArrayList<Employees> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employees> history) {
        this.history = history;
    }
    
    public Employees addNewEmployees(){
        Employees newEmployee = new Employees();
        history.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employees emp){
        history.remove(emp);
    }
    
}
