package y2021.d01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day01 {
    public static void main(String[] args) throws IOException {
        var depths = Files.readAllLines(Paths.get("run/2021/d01.txt")).stream().mapToInt(Integer::parseInt).toArray();
        int last = Integer.MAX_VALUE;
        int count = 0;
        for (int d : depths) {
            if (d > last) {
                count++;
            }
            last = d;
        }
        System.out.println(count);

        int[] d2 = new int[depths.length - 2];

        for (int i = 0; i < depths.length - 2; i++) {
            d2[i] = depths[i] + depths[i+1] + depths[i+2];
        }

        last = Integer.MAX_VALUE;
        count = 0;
        for (int d : d2) {
            if (d > last) {
                count++;
            }
            last = d;
        }
        System.out.println(count);
    }
}
