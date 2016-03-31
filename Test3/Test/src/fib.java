
public class fib {

	public int fibonacciRec(int n) {
	
	if (n == 0)
		return 0;
	if (n <= 2)
		return 1;	
	int i1 = fibonacciRec(n-1);
	int i2 = fibonacciRec(n-2);
	if(i1 > Integer.MAX_VALUE - i2 ) {
	throw new ArithmeticException("Zahl zu groﬂ");
	}
	return i1+i2;
	
	}
}

