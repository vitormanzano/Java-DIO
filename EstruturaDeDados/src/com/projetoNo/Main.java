package com.projetoNo;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No("Conteúdo No1");

        No<String> no2 = new No("Conteúdo No2");

        no1.setProximoNo(no2);

        No<String> no3 = new No("Conteúdo No3");
        no2.setProximoNo(no3);

        No<Integer> no4 = new No(2);

        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null

        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no4.getProximoNo());
    }
}
