package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void Get_Median(String []arr) {
		int TempArr[]=new int[arr.length];

		if(!Character.isDigit(arr[0].charAt(0))) {
			System.out.println("Median : Sorry this function run with array of numbers only !!");
			return;
		}

		//Take Copy from the original array
		for(int i=0;i<arr.length;i++) {
			TempArr[i]=Integer.parseInt(arr[i]);
		}

		//Sort Array (Bubble Sort) (N^2)
		for(int i=0;i<TempArr.length;i++) {
			for(int j=0;j<TempArr.length;j++) {
				//Swap
				if(TempArr[i]>TempArr[j]) {
					int temp=TempArr[i];
					TempArr[i]=TempArr[j];
					TempArr[j]=temp;
				}
			}
		}

		//Get Median
		double Median=0.0;

		//if size of array is even
		if(TempArr.length%2==0) {
			int index1=(TempArr.length/2)-1;
			int index2=TempArr.length/2;
			Median=(TempArr[index1]+TempArr[index2])/2.0;
		}
		//if size of array is odd
		else {
			int index=(TempArr.length/2);
			Median=TempArr[index];
		}

		//Output
		System.out.println("Median = "+Median);
	}


    public static void zeroIfLessThanZero(String[] arr ) throws NumberFormatException{
        int temp[] = new int[arr.length];
        try {
            for (int i = 0; i < arr.length; i++) {
                temp[i] = Integer.parseInt(arr[i]);
            }
        }
        catch(NumberFormatException e){
            System.out.println("ERROR in converting string to numeric value");
            return;
        }
        System.out.print("zero if less than zero : {");
        for(int i=0 ; i<temp.length ;i++){
            if(temp[i]<0){
                temp[i] = 0;
            }
            System.out.print(temp[i]+" ");
        }
        System.out.println("}");
    }

        public static void Return_Primes(String[] arr)throws NumberFormatException
    {
        try{
        for(int i=0; i<arr.length; i++){
            int x=Integer.parseInt(arr[i]);
            boolean f=true;
        for(int j=2 ; j<x ; j++)
        {
            
            if(x%j==0)
            {
                f=false;
                
            }
        }
        if(f)
            {
            System.out.println(arr[i] + " is the prime number in the array ");
            }
       }
    }   
        catch(NumberFormatException e){
            System.out.println("ERROR in converting string to numeric value");
            return;
        }
        
 } 

    private static String []arr;
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        arr = new String[siz];

        System.out.println("Enter array elements:");
        	for(int i=0;i<siz;i++)
                arr[i] = sc.next();


        printMenu();
        int choice = sc.nextInt();
        switch (choice){
            case 1: //most repeated value
                MostReapetedValue(arr);
                break;

            case 2: //sort
	 	sort(arr);  
    		break;

            case 3: //shuffle
	shuffle(arr);
                break;

            case 4: //find largest prime

                break;

            case 5: //find smallest prime
                smallest_prime(arr);
                break;

            case 6: //check palindrome

                break;

            case 7: //check sorted
                checkSorted();
                break;

            case 8: //count primes
                countPrims(arr);
                break;

            case 9: //reverse array
            	ReverseArray(arr);
                break;

            case 10: //shift array

                break;

            case 11: //distinct array

                break;

            case 12: //get the max 3 numbers
                GetMax3Nums(arr,siz);
                break;

            case 13: getmin3nums(arr);

                break;

            case 14: //get the average
               GetAverage(arr);
                break;

            case 15: //get median
            	Get_Median(arr);
                break;

            case 16: //return only primes
		Return_Primes(arr);
                break;

            case 17: //zero if less than zero
                zeroIfLessThanZero(arr);
                break;

            case 18: //execute all
	shuffle(arr);  //Function number 3
                checkSorted();      //Function number 7
                ReverseArray(arr);  // Function number 9
                GetAverage(arr);    // Function number 14
            	Get_Median(arr);	//Function number 15
            	countPrims(arr);    //Function Number 8
                MostReapetedValue(arr); //Function number 1
		sort (arr); // function number 2 
                zeroIfLessThanZero(arr); //function 17
                GetMax3Nums(arr,siz);
		          Return_Primes(arr);

                getmin3nums(arr);   //Function number 13
                smallest_prime(arr); //Function number 5

                break;
        }

    }

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tMost repeated value");
        System.out.println("2-\tSort");
        System.out.println("3-\tShuffle");
        System.out.println("4-\tFind the largest prime");
        System.out.println("5-\tFind the smallest prime");
        System.out.println("6-\tCheck palindrome");
        System.out.println("7-\tCheck sorted");
        System.out.println("8-\tCount primes");
        System.out.println("9-\tReverse array");
        System.out.println("10-\tShift array");
        System.out.println("11-\tDistinct array");
        System.out.println("12-\tGet the maximum 3 numbers");
        System.out.println("13-\tGet the minimum 3 numbers");
        System.out.println("14-\tGet average");
        System.out.println("15-\tGet median");
        System.out.println("16-\tReturn only primes");
        System.out.println("17-\tZero if less than zero");
        System.out.println("18-\tExecute All");

    }

    private static void checkSorted(){
        boolean flag = true;

        try {
            for (int i = 0; i < arr.length - 1; i++)
                if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
                    flag = false;
                    break;
                }

            if (flag)
                System.out.println("CheckSorted: True");
            else
                System.out.println("CheckSorted: False");
        }catch(NumberFormatException e){
            System.out.println("CheckSorted: accepts integers only!");
        }
    }
    public static void GetAverage(String[] arr) {
        int sum = 0;
        if (!Character.isDigit(arr[0].charAt(0))) {
            System.out.println("Sorry the GetAverage function run with array of Integers only ");
            return;
        }
        else {
            for (int i = 0; i < arr.length;i++) {
                int n =Integer.parseInt(arr[i]);
                sum+=n;
            }
        System.out.println("Average : "+sum/arr.length);
        }
    }

    public static <T> void ReverseArray(T[] array) {
	T copy[] = Arrays.copyOf(array, array.length);
        T temp;
        for (int i = 0; i < copy.length / 2; i++) {
            temp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = temp;

        }
        System.out.println("The reversed array ---> " + Arrays.toString(copy));
    }


    public static void countPrims(String[] arr){
        int count = 0;
        if(!Character.isDigit(arr[0].charAt(0))) {
            System.out.println("countPrims : Sorry this function run with array of numbers only !!");
            return;
	}
        else {
            for (int i = 0; i< arr.length; i++){
                int num = Integer.parseInt(arr[i]);
                boolean flag = true;
                for (int j = 2; j<num; j++){
                    if(num%j == 0)
                        flag = false;
                 }
                if(flag){
                    count++;
                }
            }
            System.out.println("Prime Numbers : "+count+" Numbers");
        }

    }

  public static void MostReapetedValue(String arr[])
	{
		String mostValue="";
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			String tempVal=arr[i];
			int tmpCounter=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j].equals(tempVal))
				{
					tmpCounter++;
				}
			}
			if(tmpCounter>counter)
			{
				mostValue=tempVal;
				counter=tmpCounter;
			}
		}
		System.out.println("The most repeated value is: "+mostValue);
	}

    public static void shuffle(String[] arr) {

        String[] arr2 = new String[arr.length];
        for (int i = 0, j = 0; i <= arr.length - 1; i++) {
            arr2[j] = arr[i];
            j++;
        }
        if (!Character.isDigit(arr2[0].charAt(0))) {
            System.out.println("Sorry the shuffle function run with array of Integers only ");
            return;
        } else {
            int name_num_of_element = arr2.length;
            for (int i = 0; i < name_num_of_element; i++) {
                int s = i + (int) (Math.random() * (name_num_of_element - i));
                String tmp = arr2[s];
                arr2[s] = arr2[i];
                arr2[i] = tmp;

            }
        }
        System.out.println("shuffle array : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

 public static void getmin3nums(String[]arr)
	{	int TempArr[]=new int[arr.length];

		if(!Character.isDigit(arr[0].charAt(0))) {
			System.out.println("Getmin3Nums : Sorry this function run with array of numbers only !!");
			return;
		}

		//Take Copy from the original array
		for(int i=0;i<arr.length;i++) {
			TempArr[i]=Integer.parseInt(arr[i]);
		}

		Arrays.sort(TempArr);
		int[]temp=new int [TempArr.length];
		int j=0;
		for(int i=0;i<TempArr.length-1;i++)
		{
			if (TempArr[i] != TempArr[i+1])
	            temp[j++] = TempArr[i];
		}
		 temp[j++] = TempArr[TempArr.length-1];
		for(int i=0;i<j;i++)
		{
			TempArr[i]=temp[i];
		}
		System.out.println(" the minmum 3 numbers is : ");
		System.out.println(TempArr[0]);
	    	System.out.println(TempArr[1]);
	    	System.out.println(TempArr[2]);
	}


    static void GetMax3Nums(String arr[], int arr_size) 
    { 
        int i, f, s, th; 
        int TempArr[]=new int[arr.length];
     
  if(!Character.isDigit(arr[0].charAt(0))) {
			System.out.println("GetMax3Nums : Sorry this function run with array of numbers only !!");
			return;
		}
        
        for(int j=0;j<arr.length;j++)
        {
	TempArr[j]=Integer.parseInt(arr[j]);
	}
    
        if (arr_size < 3) 
        { 
            System.out.print(" Invalid Input "); 
            return; 
        } 
        
        th = f = s = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size ; i ++) 
        { 
            if (TempArr[i] > f) 
            { 
                th = s; 
                s = f; 
                f = TempArr[i]; 
            } 
        
             else if (TempArr[i] > s) 
            { 
                th = s; 
                s = TempArr[i]; 
            } 
        
            else if (TempArr[i] > th) 
                th = TempArr[i]; 
        } 
        
        System.out.println("Three largest elements are " + 
                       f + " " + s + " " + th); 
    } 
  




	public static void smallest_prime(String []arr)
    {
    	int []Arr=new int [arr.length];

    	if(!Character.isDigit(arr[0].charAt(0))) {
 			System.out.println("Smallest Prime : Sorry this function run with array of numbers only !!");
 			return;}

    	for(int i=0;i<arr.length;i++) {
			Arr[i]=Integer.parseInt(arr[i]);
		}

     ArrayList<Integer> Prim_Arr = new ArrayList();
     int x;
     int temp;
     boolean prime;
         for (int i = 0; i < Arr.length; i++)
         {


             prime = true ;
             if (Arr[i] == 2) {
                 Prim_Arr.add(Arr[i]);
                 continue ;
                                 }

         for (int j = 2; j < Arr[i]; j++)
         {

                 if (Arr[i] % j == 0)
                 {
                     prime = false ;
                     break;
                 }

         }
             if(prime)
            Prim_Arr.add(Arr[i]);

         }

         int smallprime;
         smallprime = Prim_Arr.get(0);
         for (int i = 0; i < Prim_Arr.size(); i++) {
             if (smallprime > Prim_Arr.get(i) )
                 smallprime = Prim_Arr.get(i);
         }

                 System.out.println("The Smallest Prime is: " +smallprime);



     }


   public static void sort(String[] arr) 
	{
	   int a[]=new int[arr.length];
	   int n=arr.length;

		if(!Character.isDigit(arr[0].charAt(0))) {
			System.out.println("sort : Sorry this function run with array of numbers only !!");
			return;
		}

		//Take Copy from the original array
		for(int i=0;i<arr.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}

		
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] > a[j]) 
				{
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		 		
		System.out.println("Ascending Order:");
		for (int i = 0; i < n ; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
    
}
}

