
public class Cal implements presentation {


	public int a;
	public int b;
	public void add(int a,int b) {
		// TODO Auto-generated method stub
		this.a=a;
		this.b=b;
		System.out.println("Addition value is"+" "+(a+b));
	}

	@Override
	public void sub(int a,int b) {
		// TODO Auto-generated method stub
		this.a=a;
		this.b=b;
		System.out.println("Subtraction value is"+" "+(a-b));

	}

	@Override
	public void mul(int a,int b) {
		// TODO Auto-generated method stub
		this.a=a;
		this.b=b;
		System.out.println("Multiplication value is"+" "+(a*b));

	}
	public void div(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Division value is"+" "+(a/b));
	}

	

	}


