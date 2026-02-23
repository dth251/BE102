package bai1;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void input(){
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                System.out.println("Nhap so nguyen a ");
                int a = Integer.parseInt(sc.nextLine());
                if(a <= 0) {
                    System.err.println("nhap so nguyen lon hon 0");
                    a = Integer.parseInt(sc.nextLine());
                }
                if(ktrasnt(a)){
                    System.out.println("day la so nguyen to");
                }
                else{
                    System.out.println("day khong phai la so nguyen to");
                }
                break;
            }catch(NumberFormatException e){
                System.err.println("vui long nhap so nguyen a : ");
            }

        }
    }
    public static boolean ktrasnt(int n){
        if(n < 2)
            return false;
        for(int i= 2;i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        input();
        System.out.println("ket thuc");
    }
}
