package com.driver;

import java.io.*;

public class Main {
    public static class Product{
       public  Product(){
        }
        public int product(int x,int y){
            return x*y;
        }
        public int product (int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
        public double product(double x,double y,double z){
            return x*y*z;
        }
    }


    public static void main (String []args)throws IOException{
    Product p= new Product();

    int a1=p.product(5,6);
    System.out.println(a1);
    int a2=p.product(9,10,8);
    System.out.println(a2);
    double d1=p.product(2.0,5.0);
    System.out.println(d1);
    double d2=p.product(2.0,4.0,6.0);
    System.out.println(d2);
}
}