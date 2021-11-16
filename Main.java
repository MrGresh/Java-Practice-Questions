
package com.company;

class Bank
{


    String name = "Dinesh" ;
    String Bank = "SHGB" ;
    int pin = 1234;
    int Balance = 5678;

    Bank(String h ,String m , int d , int j)
    {
        String name = h;
        String Bank = m;
        int pin = d;
        int Balance = j;
        Balance();
        System.out.println("Name : " + name + " , Bank : " + Bank + " , Pin : " + pin);
        System.out.println("Balance - "+Balance);
    }
    void Balance()
    {

        System.out.println("Name : " + name + " , Bank : " + Bank + " , Pin : " + pin);
        System.out.println("Balance - "+Balance);

    }


}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Bank y = new Bank("Gresh" , "SBI" , 9876 , 5432);


    }
}