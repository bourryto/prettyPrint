package de.purryto.javalib.fungi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Unit test for simple App.
 */
public class PrettyPrintTest
{
    private final PrettyPrint prettyPrint = new PrettyPrint();
    @Test
    public void multiplications() {
        String correct = "0 | 0 |  0 |  0 |  0 |  0 |  0 |  0\n0 | 1 |  2 |  3 |  4 |  5 |  6 |  7\n0 | 2 |  4 |  6 |  8 | 10 | 12 | 14\n0 | 3 |  6 |  9 | 12 | 15 | 18 | 21\n0 | 4 |  8 | 12 | 16 | 20 | 24 | 28\n0 | 5 | 10 | 15 | 20 | 25 | 30 | 35\n0 | 6 | 12 | 18 | 24 | 30 | 36 | 42\n0 | 7 | 14 | 21 | 28 | 35 | 42 | 49\n0 | 8 | 16 | 24 | 32 | 40 | 48 | 56\n0 | 9 | 18 | 27 | 36 | 45 | 54 | 63\n";
        Integer[][] table = new Integer[10][8];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                table[i][j] = i*j;
            }
        }
        assertThat(prettyPrint.get2DArrayAsString(table)).isEqualTo(correct);
    }
}
