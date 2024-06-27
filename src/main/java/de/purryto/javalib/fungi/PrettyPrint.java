package de.purryto.javalib.fungi;

import java.util.Arrays;

public class PrettyPrint {

    public static  <E> String get2DArrayAsString(E[][] array){
        Integer[] colLengths = new Integer[array[0].length];
        Arrays.fill(colLengths, 0);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                colLengths[j] = Math.max(colLengths[j], array[i][j].toString().length());
            }
        }
        String output = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String cell = array[i][j].toString();
                output += String.format("%" + colLengths[j] + "s | ", cell);
            }
            output = output.substring(0, output.length() - 3);
            output += "\n";
        }
        return output;
    }
}
