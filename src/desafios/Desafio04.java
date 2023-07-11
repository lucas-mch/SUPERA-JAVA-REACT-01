package desafios;

import java.util.Arrays;

public class Desafio04 {

    public static void unscrambleString(String toUnscramble) {
        Integer middleIndex = getMiddleStringIndex(toUnscramble);
        String partOne = toUnscramble.substring(0, middleIndex);
        String partTwo = toUnscramble.substring(middleIndex);

        StringBuilder sb = new StringBuilder();
        sb.append(partTwo);
        sb.append(partOne);
        sb.reverse();

        System.out.println(sb.toString());

    }

    public static Integer getMiddleStringIndex(String toGetIndex){
        return Math.abs(toGetIndex.length() / 2);
    }

}
