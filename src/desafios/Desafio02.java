package desafios;

import helper.Utils;

import java.math.BigDecimal;

public class Desafio02 {
    public static void quantidadeDeNotasPara(BigDecimal valorEmReais) {
        Integer notasDeCem = 0;
        Integer notasDeCinquenta = 0;
        Integer notasDeVinte = 0;
        Integer notasDeDez = 0;
        Integer notasDeCinco = 0;
        Integer notasDeDois = 0;

        Integer moedasDeUmReal = 0;
        Integer moedasDeCinquenta = 0;
        Integer moedasDeVinteCinco = 0;
        Integer moedasDeDez = 0;
        Integer moedasDeCinco = 0;
        Integer moedasDeUmCentavo = 0;

        BigDecimal resto = new BigDecimal(0);

        if (valorEmReais.compareTo(Utils.CEM_REAIS) >= 0) {
            notasDeCem = valorEmReais.divide(Utils.CEM_REAIS).intValue();
            resto = valorEmReais.subtract(BigDecimal.valueOf(notasDeCem * 100.00));
        } else if (valorEmReais.compareTo(Utils.CINQUENTA_REAIS) >= 0) {
            notasDeCinquenta = valorEmReais.divide(Utils.CINQUENTA_REAIS).intValue();
            resto = valorEmReais.subtract(BigDecimal.valueOf(notasDeCinquenta * 50.00));
        } else if (valorEmReais.compareTo(BigDecimal.valueOf(20.00)) >= 0) {
            notasDeVinte = valorEmReais.divide(BigDecimal.valueOf(20.00)).intValue();
            resto = valorEmReais.subtract(BigDecimal.valueOf(notasDeVinte * 20.00));
        } else if (valorEmReais.compareTo(BigDecimal.valueOf(10.00)) >= 0) {
            notasDeDez = valorEmReais.divide(BigDecimal.valueOf(10.00)).intValue();
            resto = valorEmReais.subtract(BigDecimal.valueOf(notasDeDez * 10.00));
        } else if (valorEmReais.compareTo(BigDecimal.valueOf(5.00)) >= 0) {
            notasDeCinco = valorEmReais.divide(BigDecimal.valueOf(5.00)).intValue();
            resto = valorEmReais.subtract(BigDecimal.valueOf(notasDeCinco * 5.00));
        } else if (valorEmReais.compareTo(BigDecimal.valueOf(2.00)) >= 0) {
            notasDeDois = valorEmReais.divide(BigDecimal.valueOf(2.00)).intValue();
            resto = valorEmReais.subtract(BigDecimal.valueOf(notasDeDois * 2.00));
        }

        while (resto.compareTo(BigDecimal.valueOf(0)) > 0) {
            if (resto.compareTo(BigDecimal.valueOf(50.00)) >= 0) {
                notasDeCinquenta = resto.divide(BigDecimal.valueOf(50.00)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(notasDeCinquenta * 50));
            } else if (resto.compareTo(BigDecimal.valueOf(20.00)) >= 0) {
                notasDeVinte = resto.divide(BigDecimal.valueOf(20.00)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(notasDeVinte * 20.00));
            } else if (resto.compareTo(BigDecimal.valueOf(10.00)) >= 0) {
                notasDeDez = resto.divide(BigDecimal.valueOf(10.00)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(notasDeDez * 10.00));
            } else if (resto.compareTo(BigDecimal.valueOf(5.00)) >= 0) {
                notasDeCinco = resto.divide(BigDecimal.valueOf(5.00)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(notasDeCinco * 5.00));
            } else if (resto.compareTo(BigDecimal.valueOf(2.00)) >= 0) {
                notasDeDois = resto.divide(BigDecimal.valueOf(2.00)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(notasDeDois * 2.00));
            } else if (resto.compareTo(BigDecimal.valueOf(1.00)) >= 0) {
                moedasDeUmReal = resto.divide(BigDecimal.valueOf(1.00)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(moedasDeUmReal * 1.00));
            } else if (resto.compareTo(BigDecimal.valueOf(0.50)) >= 0) {
                moedasDeCinquenta = resto.divide(BigDecimal.valueOf(0.50)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(moedasDeCinquenta * 0.50));
            } else if (resto.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
                moedasDeVinteCinco = resto.divide(BigDecimal.valueOf(0.25)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(moedasDeVinteCinco * 0.25));
            } else if (resto.compareTo(BigDecimal.valueOf(0.10)) >= 0) {
                moedasDeDez = resto.divide(BigDecimal.valueOf(0.10)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(moedasDeDez * 0.10));
            } else if (resto.compareTo(BigDecimal.valueOf(0.05)) >= 0) {
                moedasDeCinco = resto.divide(BigDecimal.valueOf(0.05)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(moedasDeCinco * 0.05));
            } else if (resto.compareTo(BigDecimal.valueOf(0.01)) >= 0) {
                moedasDeUmCentavo = resto.divide(BigDecimal.valueOf(0.01)).intValue();
                resto = resto.subtract(BigDecimal.valueOf(moedasDeUmCentavo * 0.01));
            }
        }


        System.out.println("Notas:");
        System.out.println(notasDeCem + " nota(s) de R$ 100.00");
        System.out.println(notasDeCinquenta + " nota(s) de R$ 50.00");
        System.out.println(notasDeVinte + " nota(s) de R$ 20.00");
        System.out.println(notasDeDez + " nota(s) de R$ 10.00");
        System.out.println(notasDeCinco + " nota(s) de R$ 5.00");
        System.out.println(notasDeDois + " nota(s) de R$ 2.00");
        System.out.println("Moedas:");
        System.out.println(moedasDeUmReal + " moeda(s) de R$ 1.00");
        System.out.println(moedasDeCinquenta + " moeda(s) de R$ 0.50");
        System.out.println(moedasDeVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(moedasDeDez + " moeda(s) de R$ 0.10");
        System.out.println(moedasDeCinco + " moeda(s) de R$ 0.05");
        System.out.println(moedasDeUmCentavo + " moeda(s) de R$ 0.01");


    }

}
