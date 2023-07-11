package desafios;

import java.util.*;
import java.util.stream.Collectors;

public class Desafio01 {
    private static Scanner sc = new Scanner(System.in);

    public static void listaOrdenadaDeNumeros() {
        List<Integer> inteiros = new ArrayList<>();
        Integer entradas = null;

        System.out.println("Digite o número de linhas de entrada.");

        while (entradas == null) {
            try {
                entradas = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Entrada deve ser um inteiro, por favor tente novamente!");
            }
        }

        for (int i = 0; i < entradas; i++) {
            Integer toAddInList = null;
            while (toAddInList == null) {
                try {
                    System.out.println("Por favor, adicione a próxima entrada. Restantes: " + (entradas - i));
                    toAddInList = sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.println("Entrada deve ser um inteiro, por favor tente novamente!");
                }
            }
            inteiros.add(toAddInList);
        }

        ordenaListaPrintResult(inteiros);
    }

    public static void ordenaListaPrintResult(List<Integer> listaParaOrdenar) {

        List<Integer> numerosPares = listaParaOrdenar.stream().filter(inteiro -> inteiro % 2 == 0).collect(Collectors.toList());
        List<Integer> numerosImpares = listaParaOrdenar.stream().filter(inteiro -> inteiro % 2 != 0).collect(Collectors.toList());

        Collections.sort(numerosPares);
        numerosImpares.sort(Collections.reverseOrder());

        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(numerosPares);
        mergedList.addAll(numerosImpares);

        for (Integer i : mergedList) {
            System.out.println(i);
        }
    }

}
