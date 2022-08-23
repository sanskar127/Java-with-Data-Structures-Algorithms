package Java_DSA.Array;

import java.io.*;
// Reverse An Array

class prob1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        int[] rev = new int[n];
        int k = n-1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            rev[i] = arr[k];
            k--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }

    }
}