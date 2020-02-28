package com.epam.calculator;

public class Division {
	float a;
	float b;
	public Division(float a,float b) {
		this.a=a;
		this.b=b;
	}
	public String divi(){
		if(b==0) return "zero division exception...denominator cannot be zero";
		return Float.toString(this.a/this.b);
	}
}
