public class Test {
    public static void main(String[] args) {
        int min = minValue(5,9,2,13);
        System.out.println(min);

    }
    private static int minValue(int a,int b, int c, int d){
        int tmp = a;
        if(tmp>=b)tmp=b;
        if(tmp>=c)tmp=c;
        if(tmp>=d)tmp=d;
        return tmp;
    }
}
