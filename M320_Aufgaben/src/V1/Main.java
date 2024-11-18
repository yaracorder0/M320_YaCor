package V1;



public class Main {
    public static void main(String[] args) {
        StackTest<Integer> stack = new StackTest<>();

        stack.push(20);
        stack.push(30);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
