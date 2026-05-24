
import bankmanagersystem.Account;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class tester {
    public static void main(String[] args) {
       Account acc=new Account();
       acc.inputAccount();
       if(acc.deposit(200)==true){
           System.out.println("done!!!");
       }else{
           System.out.println("can not deposit");
       }
       acc.displayBalance();
       if(acc.withdraw(5000)==true) {
           System.out.println("done!!!");
         
       }else{
           System.out.println("can not withdraw");
       }
       acc.displayBalance();
    }
    
    }
