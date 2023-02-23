package java_practice.practice.productorder;

public class Practice implements Practice2 {

    public static void sum (int x , int y)
    {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
     //   Practice pra = new Practice();
      
      //System.out.println(pra.add(10, 30));

      Practice2 inter = (a,b)->System.out.println(" "+ (a+b));
      inter.add(10, 20);

      


    }

    @Override
    public void add(int a, int b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
    
}







