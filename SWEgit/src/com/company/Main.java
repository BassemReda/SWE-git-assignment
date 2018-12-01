package com.company
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

                break;

            case 3: //shuffle

                break;

            case 4: //find largest prime

                break;

            case 5: //find smallest prime
                SmallestPrime();
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

                break;

            case 17: //zero if less than zero
                zeroIfLessThanZero(arr);
                break;

            case 18: //execute all
                checkSorted();      //Function number 7
                ReverseArray(arr);  // Function number 9
                GetAverage(arr);    // Function number 14
                SmallestPrime();    //Function number 5
            	Get_Median(arr);	//Function number 15
            	countPrims(arr);    //Function Number 8
                MostReapetedValue(arr); //Function number 1
                zeroIfLessThanZero(arr); //function 17
		          getmin3nums(arr);   //Function number 13
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
    public static void SmallestPrime(String []arr)
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

 public static void getmin3nums(String[]arr)
	{	int TempArr[]=new int[arr.length];
		
		if(!Character.isDigit(arr[0].charAt(0))) {
			System.out.println("Median : Sorry this function run with array of numbers only !!");
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

}
