package com.vasu.testng;

public class MethodOverloading 
{
	

	public void add(int i ,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i ,int j,int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading v=new MethodOverloading();
		v.add(20, 30);
		v.add("Vasu","Deva");
		
	}
}
