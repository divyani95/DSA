public class TOH {
    public static void towerOfHanoi(int n, char src, char aux, char dest) { 
        if (n == 1) { 
            System.out.println("Move disk " + n + " from rod "+ src + " to rod " + dest);
            return;
        } 
        towerOfHanoi(n - 1, src, dest, aux);
        System.out.println("Move disk " + n + " from rod "+ src + " to rod " + dest);
        towerOfHanoi(n - 1, aux, src, dest); 
    }
    public static void main(String args[]) { 
        int N = 4;
        towerOfHanoi(N, 'A', 'B', 'C'); 
    }
}









