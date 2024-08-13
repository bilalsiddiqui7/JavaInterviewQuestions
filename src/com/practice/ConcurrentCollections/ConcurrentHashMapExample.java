//In traditional collection if one thread iterates and other tries to modify structural change then we get ConcurrentModificationException
//is thrown.

package com.practice.ConcurrentCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

//public class ConcurrentHashMapExample
//{
//	public static void main(String[] args)
//	{
//		HashMap<Integer, Integer> map = new HashMap<>();
//		map.put(1, 1);
//		map.put(2, 2);
//		map.put(3, 3);
//		map.put(4, 4);
//		map.put(5, 5);
//
//		Iterator<Integer> it = map.keySet().iterator();
//		while (it.hasNext())
//		{
//			int key = it.next();
//			System.out.println(map.get(key));
//			if (key == 2)
//			{
//				map.put(6, 6);
//			}
//		}
//	}
//}

//Q) Why performance of ConcurrentHashMap is better than HashTable and synchronizedMap ?
//A) In HashTable and synchronizedMap Lock is acquired on complete collection so only a single thread can capture
//lock at the time, while in ConcurrentHashMap lock is acquired on bucket level so at a time multiple threads can 
//capture lock on different different buckets.
//
//Q) Concurrency level in ConcurrentHashMap ?
//A) Number of buckets and concurrency level will decide how many segments your hashmap will have.
//ie. bucket size divided by concurrency level is the total number of segments.
//
//Multiple threads can read simontaneously from ConcurrentHashMap as read does not require any lock because we are not
//modifying anything
//
//Multiple threads cannot read and write simontaneously from ConcurrentHashMap as write require lock because we are
//modifying [This is a wrong point.]
//
//MOST IMP POINT : You can read from anywhere in a ConcurrentHashMap, it is completely non blocking. When blocking comes
//into picture is when you are going to update or write, you can update or write on different segments, just do not try
//to get a lock on a segment which is already locked you've to wait for it.
//
//NULL key is not allowed on ConcurrentHashMap because while we are fetching some key other thread may come and delete
//that key so that will be an ambiguity. While null is allowed in HashMap as concurrent modification is not possible in 
//HashMap
//
//Internal working of ConcurrentHashMap - Whenever we have to PUT some values thread will put a lock on particular segment by 
//using segment index, now based the hashcode of particular bucket the bucket number of that bucket is calculated. Also, 
//Whenever you want to GET any values it is done the same way.

public class ConcurrentHashMapExample
{
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext())
		{
			int key = it.next();
			System.out.println(map.get(key));
			if (key == 2)
			{
				map.put(6, 6);
			}
		}
	}
}
