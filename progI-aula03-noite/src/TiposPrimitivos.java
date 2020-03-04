
public class TiposPrimitivos {
    public static void main(String args[]){
        int i1 = 1000000000;
        long l1 = 1000000000;
        float f1 = 10.0000009f;
        double d1 = 10.0000009;
              
        System.out.println("i1: " + i1);
        System.out.println("l1: " + l1);
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);
        
        char c1 = 'p';
        char c2 = 'b';
        char c3 = '\n';
        char c4 = '\'';
        
        System.out.println("Soma de chars : " + (c1+c2));
        
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        
        System.out.println("\"Java\"");
        
        int i2 = 5;
        float f2 = 5.f;
        double d2 = 5.;
        
        //Conversao implicita
        double d3 = i2;
        
        float f3 = (float) d2;
        
        byte b2 = 127;
        int i4 = 129;
        
        byte b3 = (byte) i4;
        
        System.out.println("B2: " + b2);
        
        System.out.println("B3: " + b3);
        
        int x1 = 10;
        System.out.println("X1: " + ++x1);
        
        int x2 = 10;
        System.out.println("X2: " + (x2++ + x2));
        
        
        System.out.println("============");
        
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
        
        int x3 = 5;
        int x4 = (x3 > 5)?2:3;
        
        System.out.println("X4: " + x4);
        
        int y3 = 5;
        
        int y4;
        
        if(y3 > 5){
            y4 = 2;
        }else{
            y4 = 3;
        }
        
        int x5 = 10;
        
        if(x5 == 10){
            int x6 = 7;
        }
        int x6 = 5;
        System.out.println(x6);
    }
}
