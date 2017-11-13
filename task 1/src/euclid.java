public class euclid {

    public int gcd (int a, int b){
        if ((b==0)||(a==0)) return a+b;
        else if (Math.abs(a)>Math.abs(b)) return gcd(a%b, b); else return gcd(a, b%a);
    }

    public int gcdFloorMod (int a, int b){
        if ((b==0)||(a==0)) return a+b;
        else if (Math.abs(a)>Math.abs(b)) return gcd(Math.floorMod(a,b), b); else return gcd(a, Math.floorMod(b,a));
    }

    public int gcdFloorRem (int a, int b){
        if ((b==0)||(a==0)) return a+b;
        else if (Math.abs(a)>Math.abs(b)) return gcd(rem(a,b), b); else return gcd(a, rem(a,b));
    }

     public int rem(int a,int b){
        int q = a/b;
      return a-q*b;
     }


}
