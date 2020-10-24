package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		/*
		 * ==========ARRAY======== 
		 * Array is a collection of similar type of data(int-->int, String..>String..) 
		 * Array is a container object that hold values of homogeneous type. 
		 * It is ﬁxed in size that means you can't increase the size of array at run time. 
		 * It stores the value on the basis of index value.The ﬁrst element of an array starts with zero
		 * 
		 * Declaring and Initializing an Array dataType[] 
		 * arrayVariable; ===>preferred way      
		 * dataType[] arrayVariable= new dataType[arraySize]; ==>preferred way
		 * 
		 * OR      dataType  arrayVariable[];  ==>works but not preferred way
		 * dataType arrayVariable[] = new dataType[arraySize];  ==>works but not 
		 * preferred way
		 * 
		 * Note: At the time of array declaration we can not specify the size of array.
		 * For Example int[5] a; → this is wrong.
		 * 
		 * Every array in a java is an object, hence we can create array by using new
		 * keyword Access the elements of array by using index value of an elements
		 * 
		 * 
		 * Note: 
		 * 1) At the time of array creation we must be specify the size of array
		 * otherwise get an compile time error. 
		 * For Example 
		 * int[] a = new int[]; →Invalid. 
		 * int[] a = new int[5]; → Valid
		 * 
		 * 2) If we specify array size as negative int value, then we will get run-time error, 
		 * NegativeArraySizeException.
		 * 
		 * 3) To specify array size the allowed data types are byte, short, int, char. 
		 * If we use other data type then we will get an Compile time error.
		 * 
		 * 4) The maximum allowed size of array in java is 2147483647    (It is maximum value of int data type)
		 * 
		 * 
		 * ============Advantage of Array===========
		 * 1.One variable can store multiple value: 
		 * The main advantage of array is we can represent multiple value under the same name.
		 * 
		 * 2.Code Optimization:  
		 * No, need to declare a lot of variable of same type data, We can retrieve and short data easily.
		 * 
		 * 3.Random access: We can retrieve any data from array with the help of index value.
		 * 
		 * =======Disadvantage of Array========
		 * 
		 * 1. The main limitation of array is Size Limit: 
		 * Once we declare array there is no chance to increase and decrease
		 * the size of array according to our requirement
		 * 
		 * 2.Arrays can store only homogeneous value
		 * 
		 * 
		 * /*
		 * To print ALL VALUES from an array we can use for loop using following syntax
           for ( int i=0; i < array.length; i++ ) { 
           System.out.println( array[i] ); 
           } 
		 */
		 
		 

		int a;//-->declare
		a=10;//-->initialize
		
		int a1=10;//-->declare and initiliaze
		
		
		
		//FIRST WAY
		int[] b;//=> declare an array PREFERRED WAY
		//or
		int c[];//=> declare an array
		
        b=new int[4];//initialize an array
        
        
        //SECOND WAY
        int[] array=new int[4];//==>all in 1 line (declaration & initialization) array
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        
        //access value from an array
        System.out.println(array[2]);//30
        
        
        //lets create an array that will store classes
        String[] classes=new String[4];
        classes[0]="Java";
        classes[1]="SDLC";
        classes[2]="Manual Testing";
        classes[3]="GIT";
        
        //How can I print "Today I have Java class"
        System.out.println("Today I have "+classes[0]+" class");
        
        
        //How can I print 100
        int[] nums=new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        
        // I changed 1 to 100
        nums[0]=100;
        
        System.out.println(nums[0]);
        
        // what is result of nums[0]+nums[2]?
        System.out.println(nums[0]+nums[2]);//100+3
        
       
        
        
        
        //It is ﬁxed in size that means you can't increase the size of array at run time.
        //in this example we have 3 elements size but we wrote 4 element therefore
        //only run time it will give an error. and u can not increase array size.
       
        String[] names=new String[3];
        names[0]="Diana";
        names[1]="Seda";
        names[2]="Jaime";
       // names[3]="Olga"; during the run time we will get an exception
        //ArrayIndexOutOfBoundsException
        
     //   System.out.println(names[3]);//it will give an error.
        
        
        //we are putting less elements inside
        //compiler will give an default values
        int[] numbers=new int[4];
        numbers[1]=100;
        numbers[3]=200;
        
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        
        /*
         * new int[4]; 
         * 
         * numbers[0]=....? empty size is  default int value= 0
         * numbers[1]=100
         * numbers[2]=....? empty size is default int value= 0
         * numbers[3]=200;
         */
        
        
        double[] numbers1=new double[4];
        numbers1[1]=100;
        numbers1[3]=200;
        
        System.out.println(numbers1[0]);
        System.out.println(numbers1[2]);
        
        /*
         * new double[4]; 
         * 
         * numbers1[0]=....? empty size is  default double value= 0.0
         * numbers1[1]=100
         * numbers1[2]=....? empty size is default double value= 0.0
         * numbers1[3]=200;
         */
        
        
        /*
         * NOTE: DEFAULT VALUES
         * 
         * String===>null
         * Boolean==>false
         * int===>0
         * double===>0.0
         */
        
        
      //int[] numss=new int[2147483648];
      //The maximum allowed size of array in java is 2147483647   (It is maximum value of int data type)
      		
      int[] numss=new int[2147483647];
	}

}
