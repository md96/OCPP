package com.example.demo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

public List<Integer>GetEvennumers(List<Integer> data){
	return data.stream().filter(i->i%2==0).collect(Collectors.toList());
}




	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		
       /*  Employee Emp= new Employee();
		DemoApplication call=new DemoApplication();
        
        ArrayList<Integer> data= new ArrayList<>();
        data.add(1);
		data.add(23);
		data.add(56);
		data.add(23);
		data.add(45);
		System.out.println(data);
        List<Integer>even= call.GetEvennumers(data);
		even.forEach(i->System.out.println("Even numbers "+i));*/

       // data.stream().filter(i->i%2==0).forEach(i->System.out.println("Even numers "+i));

		//System.out.println(data.stream().map(i->i+6).collect(Collectors.toList()));

       //System.out.println(data.stream().map(i->i/2==0).collect(Collectors.toList()));

        /*Emp.StoreEmployee("Mahesh", 101,"ECE");
		Emp.StoreEmployee("Mahveer", 102,"EEE");
		Emp.StoreEmployee("Eshveer", 103,"ECE");
		Emp.StoreEmployee("Raina", 104,"CSC");
		Emp.StoreEmployee("Eleshama", 105,"EEE");
		Emp.StoreEmployee("Veeraiah", 106,"ECE");
		Emp.StoreEmployee("Mariyamma", 107,"CSC");
		Emp.StoreEmployee("Bindu", 108,"EEE");
		Emp.StoreEmployee("Varshitha", 109,"CSC");
		Emp.StoreEmployee("Avinash", 110,"EEE");
	    List<Employee> Emplist= new ArrayList<>(Emp.GetAllemployees().values());
        Map<String ,List <Employee>> Groupbylist= Emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Groupbylist.forEach((key,values)->System.out.println("Key: " + key + ", Value: " + values));*/
		

	}

}
