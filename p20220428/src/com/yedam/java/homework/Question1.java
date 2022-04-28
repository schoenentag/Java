package com.yedam.java.homework;

public class Question1 {

	public static void main(String[] args) {
		
				String[] strArray = { "10" , "2a" };
				int value = 0;
				for(int i = 0; i <= 2; i++ ){
					
					try{
	            	value = Integer.parseInt(strArray[i]);
	            } catch(NumberFormatException e){
	            	System.out.println("숫자로 변환 할 수 없습니다.");
	            } catch (Exception e) {
	            	System.out.println("다시 실행해주세요.");
				} finally {
	            	System.out.println(value);
	            }
	        }System.out.println("프로그램을 종료합니다.");

	}

}
