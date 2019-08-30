package com.rb.corejava.client;

import java.util.ArrayList;

import com.rb.corejava.model.Emp;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> employees=new ArrayList<Emp>();
		Emp e1=new Emp(1,"aaa",23254);
		Emp e2=new Emp(2,"bbb",33254);
		Emp e3=new Emp(3,"ccc",43254);
		Emp e4=new Emp(4,"ddd",53254);
		Emp e5=new Emp(5,"eee",63254);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		for(Emp e:employees)
		{
			e.showIdName();
		}
	/*	for(int i=0;i<employees.size();i++)
		{
			employees.get(i).showIdName();
		}*/
	}

}
