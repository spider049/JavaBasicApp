



public class ExampleClassMethod {
    public static void main(String[] args) {    // Method Main:
        
        int Total = SumTotal(10,20);    // ส่งค่าให้ Method SumTotal
        int Total2 = SumTotal2(1,11,2); // ส่งค่าให้ Method SumTotal2
        System.out.println("Total = "+ Total); // แสดงผลทางหน้าจอ
        System.out.println("Total = "+ Total2); // แสดงผลทางหน้าจอ
    }
    
    public static int SumTotal(int A, int B){ // Method SumTotal:
        
        return A+B; // ส่งค่า A+B กลับไป
    }
    
    public static int SumTotal2(int A, int B, int C){ // Method SumTotal:
        
        return A+B+C; // ส่งค่า A+B กลับไป
    }
}


