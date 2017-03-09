package com.theironyard;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * For this exercise you will write a simple main() method that prints out the
 * following text:
 * <p>
 * 1
 * 2 2
 * 4 4 4 4
 * 5 5
 * 6 6 6 6 6 6
 * <p>
 * Note the following facts:
 * <p>
 * - 3 is not output at all
 * - 5 is only output twice
 * - You are required use nested for loops (not while loops)
 * - You will need to use both the "break" and continue "keywords"
 * - Each number is followed by a space. EG: 2_2_, not 2_2.
 * <p>
 * The test is picky about formatting so make sure you get it right. Ask
 * questions if something is unclear.
 */
public class Main {

    public static void main(String[] args) {

        /* Output the following text:
            1
            2 2
            4 4 4 4
            5 5
            6 6 6 6 6 6
         */
        // todo: output the expected text

        for (int x = 1; x <= 6; x++) {
            if (x == 3) {
                continue;

            }
            if (x != 1) {
                System.out.println();
            }

            for (int y = 1; y <= x; y++) {
                if (y > 2 && x == 5) {
                    break;
                }
                System.out.print(x + " ");
            }
        }

        System.out.println();
    }

}
