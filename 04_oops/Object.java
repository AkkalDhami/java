//! There is no call by reference in java

public class Object {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num);
        addTen(num);
        System.out.println(num);

        Random r1 = new Random(5);
        System.out.println(r1.num);
        randomAddTen(r1);
        System.out.println(r1.num);
    }

    static void randomAddTen(Random r1) {
        r1.addTen();
    }

    static void addTen(int num) {
        num += 10;
    }
}

 class Random {
     int num;

     Random(int num) {
         this.num = num;
     }
     
     void addTen() {
         num += 10;
     }
    
}
