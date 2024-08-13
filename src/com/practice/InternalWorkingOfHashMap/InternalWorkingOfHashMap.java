//-Imagine HashMap or a Map as a dictionary.
//
//-Hashing -> Transformation of a String of characters to a shorted fixed length value that represents original String. A shorter value helps in
//indexing and faster searches.
//
//-In every object java has a public int hashcode() method that will return a hash value for given object.
//
//-Equals and HashCode contract -> If two objects are equal they should have a same hashcode as well.
//
//-The Hashcode is used in storing the values in HashMap
//
//-HashMap will have buckets. Where each bucket will have a linkedList of Nodes.
//
//How put works ->
//Hashmap comes with a size of 2 raise to power n. Default size of HashMap is 16.
//put(K k, V v){
//	hash(k);
//	index=hash & n-1;
//}
//When we call put, firstly it computes the hash of the key and then the index is calculated so that we can find exactly where we need to fit the 
//value in our HashMap
//If we have same index then the entry will be added as a next node of the already existing node. This is also called as COLLISION.
//Also, HashMap allows us to store null as keys so the hash will be zero resulting in index as zero.
//
//How get works ->
//V get(Object key) {
//	hash(key);
//	index=hash & n-1;
//}
//When we call get it also does the same operation as put, firstly it computes the hash of the key and then the index is calculated,
//we search by index in the HashMap then we compare the hashcode of the key in the hashmap and then we match the key if the key matches 
//then the value at that node is returned. In the case of collosion we will match the hashcode if it does not matches we will shift to the 
//next node of the same index and match and so on till the match is found once hashcode matches then we will match the key and if it matches 
// we will return the value.

//In java-8 when we have too many unequal keys which gives same index, when the number of times in a hash bucket grows beyond certain 
//threshold (TREEIFY_THRESHOLD=8), content of that bucket switches form using a linked list of entry objects to a balanced tree. This theoritically
//improves the worst case performance of O(n) to O(log n). Balanced search tree, where left nodes have lesser weight(hashcode) for the keys involved.

package com.practice.InternalWorkingOfHashMap;

public class InternalWorkingOfHashMap
{

}
