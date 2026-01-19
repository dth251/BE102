public class SoSanhHieuSuat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        long startTime, endTime;
        long loopCount = 1000000000;
        startTime = System.currentTimeMillis();
        for(long i = 0; i <loopCount; i++){
            s1 += s2;
        }
        endTime = System.currentTimeMillis();
        System.out.printf("thoi gian thuc hien voi String: %dms \n",(endTime-startTime));

        StringBuilder sb1 = new StringBuilder(s1);
        startTime = System.currentTimeMillis();
        for(long i = 0; i <loopCount; i++){
            sb1.append(s2);
        }
        endTime = System.currentTimeMillis();
        System.out.printf("thoi gian thuc hien voi StringBuilder: %dms \n",(endTime-startTime));

        StringBuffer sb2 = new StringBuffer(s1);
        startTime = System.currentTimeMillis();
        for(long i = 0; i <loopCount; i++){
            sb2.append(s2);
        }
        endTime = System.currentTimeMillis();
        System.out.printf("thoi gian thuc hien voi StringBuffer: %dms \n",(endTime-startTime));

        System.out.println("1. String: Chậm nhất vì tạo ra quá nhiều đối tượng rác trong bộ nhớ.");
        System.out.println("2. StringBuilder: Nhanh nhất vì nó sửa đổi trực tiếp trên một vùng nhớ, không đồng bộ hóa.");
        System.out.println("3. StringBuffer: Nhanh tương đương StringBuilder nhưng thường chậm hơn một xíu do tính năng 'Thread-safe' (an toàn đa luồng).");
    }
}
