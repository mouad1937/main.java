public class Main {
    public static void main(String[] args) {

       int distance = 20;
       // 0-4 =$2
        //5-15 =$5
        //16-25 =$10
        //26-50 = $15
        //>50 = $20

        if (distance > 0 && distance <4) {
            System.out.println("run 0-4 miles , the fee is $2 .");}
        if (distance > 5 && distance <15) {
            System.out.println("run 5-15 miles , the fee is $5 .");}
       if (distance > 16 && distance <25) {
            System.out.println("run 16-25 miles , the fee is $10 .");}
        if (distance > 26 && distance <50) {
            System.out.println("run 26-50 miles , the fee is $15 .");}
        if (distance >= 50) {
            System.out.println("run over 50 miles , the fee is $20 .");}




    }
}