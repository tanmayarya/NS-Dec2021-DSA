package Arrays;

import java.util.*;

public class MinJumps {
	public static int giveMinJumps(int arr[], int i, boolean visited[], int dp[]) {
        if(i < 0 || i >= arr.length || visited[i]) return -1;
        if(i == arr.length - 1) return 0;
        if(dp[i] != 0) return dp[i];
        visited[i] = true;
        int l = giveMinJumps(arr, i - arr[i], visited, dp);
        int r = giveMinJumps(arr, i + arr[i], visited, dp);
        int ans;
        if(l == -1 && r == -1) ans = -1;
        else if(l == -1) ans = 1 + r;
        else if(r == -1) ans = 1 + l;
        else ans = 1 + Math.min(l,r);
        dp[i] = ans;
        return ans;
    }

    public static void printMinJumps(int arr[]) {
    	int dp[] = new int[arr.length];
        boolean visited[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++) {
            Arrays.fill(visited, false);
            System.out.print(giveMinJumps(arr, i , visited, dp) + " ");
        }
    }

	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printMinJumps(a);
        
	}
}
