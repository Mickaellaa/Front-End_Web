public class tabuada {
    public static void main(String[] args){
        System.out.println("==== Tabuada do 5 ====");
        int num = 5;
        int i = 1;
        int total;

        while (i <= 10){
            total = num * i;
            System.out.println(num + " * " + i + " = " + total);
            i++;
        }
    }
}
