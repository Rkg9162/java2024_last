public class logicalOprators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=15;
        System.out.println(a>b && b>c && c>a);
        //false because 1 true and 2 false output false
        System.out.println(a>b || b>c || c>a);
        //false because 1 true and 2 false output true
    }
    
}
