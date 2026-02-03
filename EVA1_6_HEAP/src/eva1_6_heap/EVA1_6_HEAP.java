
package eva1_6_heap;


public class EVA1_6_HEAP {

    
    public static void main(String[] args) {//objeto
        // TODO code application logic here
        int i=100;
        Object obj =new Object(); //objeto
        System.out.println(obj);
        EVA1_6_HEAP memory =new EVA1_6_HEAP(); //objeto
        memory.foo(obj);
        
    }
    public void foo(Object param){
        String str=param.toString(); //objeto
        System.out.println(str);
    }
    
}
