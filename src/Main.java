import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    Random rand=new Random();
    int number=rand.nextInt(100);
    int right=0;
    int selected;
        System.out.println("Random sayi: "+number);
  while (right<5){
    System.out.print("Lütfen bir sayi giriniz: ");
    selected=input.nextInt();

    if(selected<0 || selected>100){
        System.out.println("Lütfen 0 100 arasında bir değer giriniz.");
        continue;
        }
    if(selected==number){
        System.out.println("Tebrikler doğru tahmin.Girmiş olduğunuz sayi :"+number);
        break;
    }else{
        right++;
        System.out.println("Hatalı bir değer girdiniz.");
        if(selected>number){
            System.out.println("Girdiğiniz sayi gizli sayidan büyüktür.");
        }else{
            System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür");
        }
        System.out.println("Kalan hakkınız: "+(5-right));

    }

}



        System.out.println(number);
    }
}