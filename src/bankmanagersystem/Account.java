package bankmanagersystem;


import java.util.Date;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Account {
    //declare field
    private double balance;
    //declare methods
    public Account() {
        this.balance=100;
    }
    //constructer with input parameter (linh động hơn ko bị lun là 100).
    public Account(double money) {
        this.balance=money;
    }
    /*
    ham nay de gui them mot so tien (amount) vao balance tra voi true/false
    validation: amount >= 0
    */
    //chuyen dia chi
    public Account(Account acc){
        this.balance=acc.balance;
    }
    
    //nhom ham setter
    public void setBalance(double money){
        if(money>=0){
            this.balance=money;
        }
    }
    
    public boolean deposit(double amount) {
        if(amount>=0){
            balance += amount;
            return true;
        }
    return false;
}
 /* ham nay de rut bot mot so tien(amount) tu balance
    tra ve true/false
    validation: amount<=balance
    */  
    public boolean withdraw(double amount) {
        if(amount >=0 && amount<=balance) {
            balance -= amount;
            return true;
            
        }
        return false;
    }
    /*
    ham nay de tra ve balance cho user su dung phan mem
    
    */
    public double getBalance() {
        return balance;
    }
    /* ham nay de nhap thong tin Account.
    nghia lA nhap balance tu ban phim
    huong dan lam trong Java su dung thu vien Scanner de nhap tu ban phim
    muon sd Scanner ta can import file thu vien: java.util.Scanner
    */
    public void inputAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance:");
        balance=sc.nextDouble();
    }
    /*
    ham nay de xuat ra man hinh bien balance
    
    */
    public void displayBalance() {
        //Lay dong ho may tinh hien hanh
        Date d=new Date();
        System.out.println("Ngan hang: FPT");
        System.out.println("Ngay sao ke"+ d.toString());
        System.out.println("Thong tin so du cua ban:"+ balance + " VND");
        
    }
}