



public class OverloadingMethod {
    
    void name(String a){
        System.out.println("ชื่อ = "+a);
    }
    
    void name(String a, String b){
        System.out.println("ชื่อ = "+a+", นามสกุล = "+b);
    }
    int name(int a, int b){
        int sum=a+b;
        return sum;
    }
    
    
    public static void main(String[] args) {
        OverloadingMethod x = new OverloadingMethod();
        x.name("Payom");
        x.name("Payomm", " Deemed");
        int sum = x.name(1500, 200);
        System.out.println(sum);
    }
}
