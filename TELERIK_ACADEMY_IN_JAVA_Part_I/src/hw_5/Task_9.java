package hw_5;

public class Task_9 {

	// We are given 5 integer numbers. Write a program that checks if the sum of
	// some subset of them is 0. Example: 3, -2, 1, 1, 8  1+1-2=0

	public static void main(String[] args) {

	}
}

// public class subSetSumR{

//
// public static boolean subSetSumRecur(int [] mySet, int n, int goal){
// if (goal ==0)
// return true;
// if ((goal<0)|(n<0))
// return false;
// if (subSetSumRecur(mySet,n-1,goal - mySet[n])){
// System.out.print(mySet[n]+" ");
// return true;}
// return (subSetSumRecur(mySet,n-1,goal));
// }
//
// public static void main(String[] args) {
//
// int [] mySet ={2,5,8,9,12,21,33};
//
// // Try multiple values of goal, print subset if it exists
// for (int goal =0;goal<100;goal++){
// System.out.println("The Goal is : "+goal);
// System.out.println(subSetSumRecur(mySet, mySet.length-1, goal));
// }
// }
// }