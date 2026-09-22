package org.tnsif.acc.c2tc.lambdaexpdemo;

interface Drawable
{
	public void draw();
}
class Test implements Drawable
{
    int width=10;
	@Override
	public void draw() {
		
		System.out.println("Drawing a width "+width);
	}
}

public class WithOutLambdaExp {

	public static void main(String[] args) {
		Test test=new Test();
		test.draw();
		// TODO Auto-generated method stub

	}

}
