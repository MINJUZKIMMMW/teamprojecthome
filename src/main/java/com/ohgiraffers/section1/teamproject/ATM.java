package com.ohgiraffers.section1.teamproject;


public class ATM {


    private boolean isOn; //초기에는 ATM에겐 카드가 없다
    private int money;
    private int deposit;
    private int withdraw;

    public void plug() {
        if (isOn) {
            System.out.println("카드를 넣어주세요");
        } else {
            this.isOn = true;
            System.out.println("카드가 확인 되었습니다");
        }
    }

    public void deposit() {
        if (isOn) {
            System.out.println("입금버튼을 누르셨습니다.");{
            this.deposit += 10;}
            System.out.println("현재 입금하실 금액을 말하시오");
        }

    }

    public void withdraw() {
        if (isOn) {
            if (this.withdraw > 0) {
                this.withdraw = 0;//
                System.out.println("출금버튼을 누르셨습니다.");
            } else {
                System.out.println("현재 출금하실 금액을 말하시오");
            }
        }
    }


    public void exist() {
        if (isOn) {
            this.exist();
            System.out.println("삽입된 카드는 뽑을 수 없습니다.");
        }else {
            System.out.println("카드가 이미 삽입되어 있습니다.");
        }

        }
    }


