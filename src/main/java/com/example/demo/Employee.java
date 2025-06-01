package com.example.demo;

import java.util.*;

public class Employee {
private  String Name;
public int Id;
private String Department;
private Map<String ,Employee>map=new HashMap<>();
public Employee(String Name, int Id ,String Department){

    this.Name=Name;
    this.Id=Id;
    this.Department=Department;
}

public Employee( ){
}

public String getDepartment(){
    return Department;
}

public void StoreEmployee(String Name,int Id,String Department){
map.put(Name,new Employee(Name,Id,Department));

}


public Employee Getempbyname(String Name){
    return map.get(Name);
}

public Map<String ,Employee> GetAllemployees(){
    return map;
}


@Override
public String toString(){
  return "Name :"+Name+" Id: "+Id;

}

    
}
