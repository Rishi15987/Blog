public class powXN {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -3;
        System.out.println(myPow(x, n));
    }
    public  static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        return (n%2==0)?myPow(x*x, n/2):x*myPow(x*x, n/2);
    }
}
// Step 5
/*Summary of problem


Approach (in your own words)
// Damn simple just reduce it to half x*x can be used

"What I learned"
Sme in approach

“When to apply”*/