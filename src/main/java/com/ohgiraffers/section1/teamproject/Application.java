package com.ohgiraffers.section1.teamproject;

import javax.swing.border.Border;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        ManyPeople people = new ManyPeople();
        System.out.println();
        while (true) {
            System.out.println("========ATM 프로그램=======");
            System.out.println("1.입금버튼을 누르셨습니다.");
            System.out.println("2.출금버튼을 누르셨습니다.");
            System.out.println("3.카드를 넣어주세요.");
            System.out.println("4.이미 삽입된 카드가 있습니다.");

            Scanner sc = new Scanner(System.in);
            String atmProgram = sc.nextLine();
            int price = 0;
            String choose = "";

            switch (price) {
                case 1: people.deposit(); //입금
                    break;
                case 2: people.withdraw(); //출금
                    break;
                case 3: people.plug(); //카드를 꽂다
                    break;
                case 4: people.exist(); //카드가 존재하다
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                default:
                    System.out.println("이미 삽입된 카드가 있습니다.");

            }
            System.out.println();
            if (price == 5) {
                break;
            }
        }

        }


    }



