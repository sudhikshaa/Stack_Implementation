import javax.crypto.Cipher;

public class Main {
    public static void main(String[] args) throws StackException{

        DynamicStack stack = new DynamicStack();
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}