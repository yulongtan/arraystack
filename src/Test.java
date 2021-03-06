/**
 * Created by Yulong on 6/24/2016.
 */

public class Test {

    public static void main(String[] stuff) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(2);
        stack.push(7);
        stack.push(5);
        System.out.println("Stack: " + stack.toString()); // b[2, 7, 5]t
        System.out.println("Size: " + stack.size()); // 3
        int removal = stack.pop();  // 5
        System.out.println("Just removed: " + removal);
        System.out.println("Stack after removal: " + stack.toString()); //b[2, 7]
        System.out.println("Size: " + stack.size()); // 2
        for (int i = 0; i < 11; i++) {
            stack.push(i);
        }
        System.out.println("Stack: " + stack.toString());
        System.out.println("Size: " + stack.size());

        // Equality test
        ArrayStack<Integer> s1 = new ArrayStack<>();
        ArrayStack<Integer> s2 = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            s1.push(i);
            s2.push(i);
        }
        System.out.println("s1: " + s1.toString());
        System.out.println("s2: " + s2.toString());
        System.out.println("s1 == s2: " + s1.equals(s2)); // true
        s2.push(6);
        System.out.println("Added 5 to s2");
        System.out.println("s1: " + s1.toString());
        System.out.println("s2: " + s2.toString());
        System.out.println("s1 == s2: " + s1.equals(s2)); // false

        // Sorting
        ArrayStack<Integer> s3 = new ArrayStack<>();
        s3.push(4);
        s3.push(3);
        s3.push(7);
        s3.push(8);
        s3.push(1);
        s3.push(12);
        s3.push(5);
        System.out.println("Stack: " + s3.toString());
        s3.mergeSort();
        System.out.println("After sort: " + s3.toString());
    }
}
