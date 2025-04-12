package lessons;

public class Lesson23Arrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Mary" ;
        names[1] = "Naruto" ;
        names[2] = "Joseph" ;

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}