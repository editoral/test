package Dataset;

// Takes values as an input and remembers the biggest, the smallest, the Sum and the Average of all numbers given. 
public class Dataset {

	// These are all the class variables. 
	private int value;
	private int max;
	private int min;
	private int sum;
	private int averageSum;
	private int counter;
	
	
	public Dataset() {
		
	}
	
	// Sums up all values
	// sets min value
	// sets max value
	// Increments value counter
	
	public void addValue (int val) {
		value = val;
		
		if (value > max) {
			max = value;
		}
		if (value < min) {
			min = value;
		}
		if (value > max) {
			max = value;
		}
		sum += value;
		counter++;
		
	}
	
	
	// Returns the Sum
	public getSum () {
		
	}
	
	// Returns the average
	public getAverage () {
		
	}
	
	// Returns the minumum
	public getMinimum () {
		
	}
	
	// Returns the maximum
	public getMaximum () {
		
	}
	
}