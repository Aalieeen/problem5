package com.company;

public class Main {

	public static void main(String[] args) {
		int w = 20;
		while (true)
		{
			if ((w%1==0)&& (w%2==0)&& (w%3==0)&& (w%4==0)&&
					(w%5==0)&& (w%6==0)&& (w%7==0)&& (w%8==0)&& (w%9==0)&&
					(w%10==0)&&(w%11==0)&&(w%12==0)&&(w%13==0)&&(w%14==0)&&
					(w%15==0)&&(w%16==0)&&(w%17==0)&&(w%18==0)&&(w%19==0)&&(w%20==0)){
				break;} w+=20;
		}
		System.out.println(w);
	}}



