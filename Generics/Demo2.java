public class Demo2 {
 public static void main(String[] args) {
     Box b2 = new Box("Akkal Dhami");
     Box b1 = new Box(100);
     Box b3 = new Box(true);

     System.out.println(b1.getValue());
     
     Integer i1 = (Integer) b1.getValue();
     System.out.println(i1 + 100);

     String s1 = (String) b2.getValue();
     System.out.println(s1 + " Dhami");

     Boolean b4 = (Boolean) b3.getValue();
     System.out.println(b4);
 }   
}

class Box {
    private Object value;

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}