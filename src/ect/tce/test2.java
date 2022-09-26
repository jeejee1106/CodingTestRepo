package ect.tce;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'findLargestSquareSize' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY samples as parameter.
     */

    public static int findLargestSquareSize(List<List<Integer>> samples) {
        // Write your code here
        int result = 0;

        for (int i = samples.size() - 1; i <= 0; i--) {
            for (int j = samples.size() - 1; j <= 0; j--) {

            }
        }
        System.out.println(samples.size());
        return result;

    }

}


public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int samplesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int samplesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> samples = new ArrayList<>();

        for (int i = 0; i < samplesRows; i++) {
            String[] samplesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> samplesRowItems = new ArrayList<>();

            for (int j = 0; j < samplesColumns; j++) {
                int samplesItem = Integer.parseInt(samplesRowTempItems[j]);
                samplesRowItems.add(samplesItem);
            }

            samples.add(samplesRowItems);
        }

        int result = Result2.findLargestSquareSize(samples);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();

    }
}