
import bankmanagersystem.Account;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class tester2 {
    public static void main(String[] args) {
        Account a=new Account(1000);
        Account b=new Account();
        
        //muon sua balance cua c=5000;
        //setter la ham nam trong lop cua ban chi de muon sua cai field ban
        //con lai giu nguyen trong khi constructor sua all
        //getter de tra ve field balance cho nguoi dung
        //getBalance lay balance cho nguoi dung khac vs xuat ra man hinh
        a.setBalance(5000);
        //lay balance cua object a
        double kq=a.getBalance();
        if(kq>=5000) System.out.println("giau qua");
        else System.out.println("dang tren con duong lam giau");
    }
}
