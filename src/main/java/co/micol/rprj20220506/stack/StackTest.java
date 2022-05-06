package co.micol.rprj20220506.stack;

public class StackTest {
	
	private int[] stack = new int[10]; // 정수형 스택배열
	private int top = 0;
	
	public void push(int n) {
		if(top == stack.length) {
			System.out.println("스택이 모두 찼습니다.");
		}else {
			stack[top] = n;
			top++;
		}
	}
	
	public void pop() {
		if (top < 0) {
			System.out.println("스택이 비어있습니다.");
			top = 0;
		} else {
			top--;
			System.out.println(stack[top]);
		}
	}
}
