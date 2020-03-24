import java.util.Arrays;
import java.util.Scanner;

public class A {

    // A problem
    static Scanner keyboard = new Scanner(System.in);
    //

    static void solve(){
        int n = keyboard.nextInt();
        int b = keyboard.nextInt();
        keyboard.nextLine();

        /*
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<n;i++){

        }
        */
        int[] a = Arrays.stream(keyboard.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);

        int ans = 0;
        for(int i = 0;i<n;i++){
            if(b>=a[i]){
                b-=a[i];
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t, i = 1;
        t = keyboard.nextInt();
        keyboard.nextLine();
        while (t-->0){
            System.out.print("Case #");
            System.out.print(i);
            System.out.print(": ");
            solve();
            i++;
        }
    }
}
