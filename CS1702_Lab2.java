
public class CS1702_Lab2 
{
	public static void main(String args[])
	{
		/*
		long x;
				
		x = 100; //Can't be a decimal number as x variable stated as a long
		System.out.println(x);
		x = x + 10; //Line A
		System.out.println(x);
		x = x + 20; //Line B
		System.out.println(x);
		*/
		
		long a = 100, x; //
		double b = 2.3, c = -52.2, pi = 3.142, y;
		boolean d = true;
		String e = "I am ", f = "a student", name = "Bruno", z;
		int g = 0;
		String h = "!";
		
		//Question 1
		y = a + b;
		System.out.println(y);
		
		//Question 2
		//y = a + d; doesn't work as boolean can't be added to a number(long)
		
		//Question 3
		z = e + f;
		System.out.println(z);
		
		//Question 4
		y = b * c;
		System.out.println(y);
	
		//Question 5
		pi = 22/7;
		System.out.println(pi);
		
		//Question 6
		//z = name/g; Cannot divide a word
		
		//Question 7
		//z = c/g; Cannot convert from double to string

		//Question 8
		x = 10;
		System.out.println(x*x*x);
		
		//Question 9
		z = name + " is " + f + h;
		System.out.println(z);
		
		//Question 10
		//y = (name + 10/(name +_h); Can't do mathematical equations with words
		
		//Question 11
		//x = (a + b)/(d + c); Adding numbers to a boolean
		
		//Question 12
		y = 100.3;
		y = (y / (a + b)) - c;
		System.out.println(y);
		
		//Question 13
		// Math.pow(x,2) = Math.pow(y,2) + Math.pow(z,2); Cannot have a string to the power of something
		
		//Question 14
		//name = "Is " + f - h; Can't subtract a string thats not there
		
		//Question 15
		y = ((pi + 1) / (pi + 2))/(pi + 3);
		System.out.println(y);
		
		//Question 16
		y = -2;
		y = Math.pow((Math.pow(y, 2) / b), 0.33333);
		System.out.println(y);
		
		//Question 17
		y = b / g;
		z = y + name;
		System.out.println(z);
			
		//Question 18
		z = name;
		z = (b / g) + z;
		System.out.println(z);
		
		//Question 19
		y = -2.3;
		y = (a * Math.pow(y, 2)) + (b * y) + c;
		System.out.println(y);
		
		//Question 20
		//y = y - Math.pow((a - b),(Math.pow((b - c), (c - d))));
		//Doesn't work as final power involves subtraction of a boolean
	
	}
	
}
