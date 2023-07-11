import desafios.Desafio02;
import desafios.Desafio03;
import desafios.Desafio01;
import desafios.Desafio04;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Desafio01.listaOrdenadaDeNumeros();
        Desafio02.quantidadeDeNotasPara(BigDecimal.valueOf(576.73));
        Desafio03.countArrayKeysThan(2, new Integer[]{1,5,3,4,2});
        Desafio04.unscrambleString("I ENIL SIHTHSIREBBIG S");
        Desafio04.unscrambleString("LEVELKAYAK");
        Desafio04.unscrambleString("H YPPAHSYADILO");
        Desafio04.unscrambleString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        Desafio04.unscrambleString("VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE");
    }


}