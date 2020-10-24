package com.class30;

public class SpecificToGeneral {

	public static void main(String[] args) {
		
		int num1=10; int num2=0;
		int result;
		
		try {
			result=num1/num2;//new ArithmeticException();
			System.out.println(result);
			Thread.sleep(5000);//new InterruptedException();
			
//		}catch (Exception e) {CE: unreachable code   //Exception e -->genel olarak hepsini karsilar.Basa yazdigimiz zaman
			// diger catch ler specific olacagi icin bunu yazmamiz yeterli olacaktir.fakat bu genel exception olacaktir.
//			System.out.println("Catching all types of exception");
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}