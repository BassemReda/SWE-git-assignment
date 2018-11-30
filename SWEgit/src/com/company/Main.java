package com.company;

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

                break;

            case 2: //sort

                break;

            case 3: //shuffle

                break;

            case 4: //find largest prime

                break;

            case 5: //find smallest prime

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

                break;

            case 10: //shift array

                break;

            case 11: //distinct array

                break;

            case 12: //get the max 3 numbers

                break;

            case 13: //get the min 3 numbers

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

                break;

            case 18: //execute all
                checkSorted();      //Function number 7
                GetAverage(arr);    // Function number 14
            	Get_Median(arr);	//Function number 15
            	countPrims(arr);    //Function Number 8
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

    public static void countPrims(String[] arr){
        int count = 0;
        if(!Character.isDigit(arr[0].charAt(0))) {
            System.out.println("Median : Sorry this function run with array of numbers only !!");
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
}
