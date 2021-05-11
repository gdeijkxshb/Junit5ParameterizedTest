package com.jkx.Junit5ParameterizedTest;

public class App 
{
	public int foo(int X, int A,int B,int C) {
		while(X++<10)
		{
			if((A>1)||(B==0))
				C=C/A;
		   else
		   		if((C<0)&&(X>1))
					X=X+1;
			A=B+C;
		}
        return X;
    }
}
