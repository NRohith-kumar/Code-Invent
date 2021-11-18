package com.tcs.day6;

public class wrapper {
	public static void main(String[] args)
	{
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;
		
		System.out.println("Primitive byte b >>>"+b);
		Byte B = b;
		System.out.println("Primitive --> Byte class B >>>"+B);
		byte b1 = B;
		System.out.println("Wrapper Class --> primitive b1 >>>"+b1);
		System.out.println();
		
		System.out.println("Primitive short s >>>"+s);
		Short S = s;
		System.out.println("Primitive --> Short class S >>>"+S);
		short s1 = S;
		System.out.println("Wrapper Class --> Primitive s1 >>>"+s1);
		System.out.println();
		
		System.out.println("Primitive int i >>>"+i);
		Integer I = i;
		System.out.println("Primitive --> Integer Class I >>>"+I);
		int i1 = I;
		System.out.println("Wrapper Class --> Primitive i1 >>>"+i1);
		System.out.println();
		
		System.out.println("Primitive long l >>>"+l);
		Long L = l;
		System.out.println("Primitive --> Long Class L >>>"+L);
		long l1 = L;
		System.out.println("Wrapper Class --> Primitive l1 >>>"+l1);
		System.out.println();
		
		System.out.println("Primitive float f >>>"+f);
		Float F = f;
		System.out.println("Primitive --> Float class F >>>"+F);
		float f1 =F;
		System.out.println("Wrapper Class --> Primitive f1 >>>"+f1);
		System.out.println();
		
		System.out.println("Primitive double d >>>"+d);
		Double D = d;
		System.out.println("Primitive --> Double Class D >>>"+D);
		double d1 = D;
		System.out.println("Wrapper Class -->> Primitive d1 >>>"+d1);
		System.out.println();
		
		System.out.println("Primitive char c >>>"+c);
		Character C = c;
		System.out.println("Primitive --> Character Class C >>>"+C);
		char c1 =C;
		System.out.println("Wrapperr Class --> Primitive c1 >>>"+c1);
		System.out.println();
		
		System.out.println("Primitive boolean b2 >>>"+b2);
		Boolean B2 = b2;
		System.out.println("Primitive --> Boolean Class B2 >>>"+B2);
		boolean bool =B2;
		System.out.println("Wrapper Class --> Primitive bool >>>"+bool);
		

		
		
	}

}
