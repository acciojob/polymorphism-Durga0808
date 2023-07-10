package com.driver;

import java.io.*;
import java.util.*;

public class Main {
    class Product{
        Product(){

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
    Product p=new Product();
    int x=5;
    int y=6;
    int a1=p.product(x,y);
    System.out.println(a1);
    int a2=p.product(x,y,8);
    System.out.println(a2);
    double d1=p.product(2.0,5.0);
    System.out.println(d1);
    double d2=p.product(2.0,4.0,6.0);
    System.out.println(d2);
}
}