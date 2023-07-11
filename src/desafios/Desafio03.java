package desafios;

public class Desafio03 {
    public static void countArrayKeysThan(Integer target, Integer[] numbers) {
        Integer countOccurency = 0;
        if (numbers.length >= 1) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 1; j < numbers.length; j++) {
                    if (numbers[j] - numbers[i] == target) {
                        countOccurency++;
                    }
                }
            }
        }
        System.out.println(countOccurency);
    }
}
