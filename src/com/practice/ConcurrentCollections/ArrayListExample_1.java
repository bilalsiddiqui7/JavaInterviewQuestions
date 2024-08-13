//IF WE USE THE TRADITIONAL ARRAYLIST WHILE WORKING IN A MULTITHREADED ENVIRONMENT WE WILL GET
//ConcurrentModificationException. IN THE BELOW CODE WE ARE MOFIFYING THE LIST AND READING IT AT THE SAME TIME
//WHICH GIVES US ConcurrentModificationException. TO AVOID THIS INSTEAD OF USING ArrayList WE CAN USE CopyOnWriteArrayList

package com.practice.ConcurrentCollections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//public class ArrayListExample_1
//{
//	public static void main(String[] args) throws InterruptedException
//	{
//		List<String> list = new ArrayList();
//		list.add("one");
//		list.add("two");
//		list.add("three");
//		list.add("four");
//		list.add("five");
//
//		Runnable r1 = () -> {
//			list.add("new value 1");
//			try
//			{
//				Thread.sleep(500);
//			}
//			catch (InterruptedException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			list.add("new value 2");
//		};
//
//		Runnable r2 = () -> {
//			for (String s : list)
//			{
//				System.out.println(s);
//				try
//				{
//					Thread.sleep(1000);
//				}
//				catch (InterruptedException e)
//				{
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		};
//		Thread t1=new Thread(
//			r1);
//		Thread t2=new Thread(
//			r2);
//		
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println("------");
//		
//		for (String s : list)
//		{
//			System.out.println(s);
//		}
//	}
//}




public class ArrayListExample_1
{
	public static void main(String[] args) throws InterruptedException
	{
		List<String> list = new CopyOnWriteArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		Runnable r1 = () -> {
			list.add("new value 1");
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.add("new value 2");
		};

		Runnable r2 = () -> {
			for (String s : list)
			{
				System.out.println(s);
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t1=new Thread(
			r1);
		Thread t2=new Thread(
			r2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("______");
		for (String s : list)
		{
			System.out.println(s);
		}
	}
}

