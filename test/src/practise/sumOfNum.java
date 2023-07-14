package practise;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class sumOfNum {
	private int numOfRequests;
	private double[] requests;
	private double sumOfRequests;
	
	public sumOfNum() {
		super();
		numOfRequests = 5; // ASSUMED DEFAULT SIZE OF THE ARRAY
		requests = new double[numOfRequests];
	}

	public sumOfNum(int numOfRequests) {
		super();
		this.numOfRequests = numOfRequests;
		requests = new double[numOfRequests];
	}

	public int getNumOfRequests() {
		return numOfRequests;
	}

	public void setNumOfRequests(int numOfRequests) {
		this.numOfRequests = numOfRequests;
	}

	public double[] getRequests() {
		return requests;
	}

	public void setRequests(double[] requests) {
		this.requests = requests;
	}

	public double getSumOfRequests() {
		return sumOfRequests;
	}

	public void setSumOfRequests(double sumOfRequests) {
		this.sumOfRequests = sumOfRequests;
	}

	@Override
	public String toString() {
		return "SumOfNum [numOfRequests=" + numOfRequests + ", requests=" + Arrays.toString(requests)
				+ ", sumOfRequests=" + sumOfRequests + "]";
	}
	
	public boolean checkConstraints() {
		boolean result = true; // Assume data is correct
		if(numOfRequests < 2 || numOfRequests > 1000)
			result = false;
		for(double element : requests) {
			if(element < -1000.0 || element > 1000.0) {
				result = false;
				break;
			}			
		}
		return result;
	}
	
	public double findSumOfOddElements() {
		for(int i = 0; i < requests.length; i++)
			if(i % 2 == 0)
				sumOfRequests += requests[i];
		return 0.0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of the Array: ");
		int arraySize = scanner.nextInt();
		sumOfNum numbers = new sumOfNum(arraySize);
		
	}
	
}
