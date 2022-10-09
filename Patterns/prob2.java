import java.io.*;

/* Title: Hollow Rectangle Pattern

****
*  *
*  *
*  *
****

Rows: 5, Columns: 4;

*/
class prob2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = m - 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m-1) {
                    System.out.print("* ");
                }
                else if (j == 0 || j == n-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
