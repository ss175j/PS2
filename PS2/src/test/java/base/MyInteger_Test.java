package base;

import static org.junit.Assert.*;

public class MyInteger_Test {
    public void test() {

			MyInteger q = new MyInteger(12);
			MyInteger w = new MyInteger(24);
			MyInteger e = new MyInteger(37);

			assertTrue(q.isEven());
			assertFalse(q.isOdd());
			assertFalse(q.isPrime());
			assertTrue(w.isEven());
			assertFalse(w.isOdd());
			assertFalse(w.isPrime());
			assertFalse(e.isEven());
			assertTrue(e.isOdd());
			assertTrue(e.isPrime());

		

			MyInteger z = new MyInteger(12);
			MyInteger x = new MyInteger(13);
			MyInteger c = new MyInteger(96);

			assertTrue(MyInteger.isEven(z));
			assertTrue(MyInteger.isOdd(x));
			assertTrue(MyInteger.isEven(c));
			assertFalse(MyInteger.isPrime(z));
			assertFalse(MyInteger.isOdd(c));
			assertFalse(MyInteger.isEven(x));

			assertTrue(MyInteger.isEven(q));
			assertFalse(MyInteger.isPrime(w));
			assertFalse(MyInteger.isOdd(q));
			assertTrue(MyInteger.isPrime(e));
			assertTrue(MyInteger.isEven(w));

			assertTrue(q.equals(q));
			assertFalse(w.equals(q));
			assertFalse(e.equals(w));

    }
}
		