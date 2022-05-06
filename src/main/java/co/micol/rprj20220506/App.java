package co.micol.rprj20220506;

import java.io.*;

//import co.micol.rprj20220506.stack.StackExample;
//import co.micol.rprj20220506.stack.StackTest;

public class App {
	public static void main(String[] args) {
		/*
		 * StackExample stack = new StackExample(); stack.ArrayStack(10);
		 * stack.push(50); stack.push(10); stack.push(30); System.out.println();
		 * stack.pop();
		 */

//		StackTest stackTest = new StackTest();
//		stackTest.push(10);
//		stackTest.push(20);
//		stackTest.push(30);
//		System.out.println("==========");
//		
//		stackTest.pop();
//		stackTest.pop();
//		stackTest.pop();

		try {
			Writer os = new FileWriter("c:\\temp\\a.txt");

			String str = "abcdef";

			os.write(str);

			os.flush();
			os.close();
//			
//			Reader reader = new FileReader("c:\\temp\\a.txt");
//			String rstr = reader.toString();
//			System.out.println(rstr);
			Reader reader = new FileReader("c:\\temp\\a.txt");
			char[] buffer = new char[100];

			while (true) {
				int readCharNum = reader.read(buffer);
				if (readCharNum == -1)
					break;
				for (int i = 0; i < readCharNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
