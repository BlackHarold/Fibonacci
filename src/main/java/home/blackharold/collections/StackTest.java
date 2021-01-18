package home.blackharold.collections;


//Задание 15, страница 343
public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
//
//		for (String s : "My dog has fleas".split(" "))
//			stack.push(s);
//		while (!stack.empty())
//			System.out.print(stack.pop() + " ");

		for (String string : "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---".split("")) {
//			myList.add(string);
			if (string.equals("+")) {
				stack.push(string);
				stack.pop();
			}

			else if (string.equals("-")) {
				System.out.print(stack.peek());
				stack.pop();

			} else {
				stack.push(string);
			}

		}
		
//		System.out.println(stack);
	}
}


//cnUtreaiytn ursel
