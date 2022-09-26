package ect.tce;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isPangram' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY pangram as parameter.
     */

    public static String isPangram(List<String> pangram) {
        // Write your code here
        String result = "";
        int count = 0;
        for (String str : pangram) {
            String str2 = str.replace(" ", "");

            for(String c : "abcdefghijklnmopqrstuvwxyz".split("")){
                if (str2.contains(c)) {
                    count++;
                }
            }
            if (count == 26) {
                result += 1;
            } else {
                result += 0;
            }
        }
        return result;
    }

}


public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int pangramCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> pangram = IntStream.range(0, pangramCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        String result = Result.isPangram(pangram);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}