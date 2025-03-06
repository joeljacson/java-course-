
class Fruits {
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        System.out.println(f1.equals(f2));  // Compares content, will print true
        System.out.println(f1 == f2);       // Compares references, will print false
    }
}
