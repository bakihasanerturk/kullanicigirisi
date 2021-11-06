package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName,userPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();

        System.out.print("Lütfen Kullanıcı Şifrenizi Giriniz : ");
        userPassword = input.nextLine();


        if (userName.equals("User") && userPassword.equals("1234")){

            System.out.println("Giriş Başarılı");

        }else{
            System.out.println("Kullanıcı Adınızı veya Şifrenizi Hatalı Girdiniz.");
        }
    }
}
