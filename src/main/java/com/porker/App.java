package com.porker;

import com.porker.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @Aurher:Porker_ZHU
 * @Date:2022/5/1 - 05 - 01 - 21:05
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //求最大公约数
        while(true){
            if (a>b){
                int c=a%b;
                if (c==0){
                    System.out.print(b);
                    break;
                }
                if (b>c){
                    a=b;
                    b=c;
                }else if (b<c){
                    a=c;
                }else{
                    System.out.println(b);
                    break;
                }
            }else if (a<b){
                int c=b%a;
                if (c==0){
                    System.out.print(a);
                    break;
                }
                if (a>c){
                    b=c;
                }else if (a<c){
                    b=a;
                    a=c;
                }else {
                    System.out.println(a);
                    break;
                }

            }else{
                System.out.print(a);
                break;
            }
        }
        //最大公倍数
        System.out.println(a*b);
    }
}
