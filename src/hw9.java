public class hw9 {
    public static void main(String[] args){
        Integer[] Arr = new Integer[] {1,2,3,4,5};

        fUnk func  = (int x, int y) -> x + y;
        map(Arr, func);
    }
    public static void map(Integer[] a, fUnk f){
        int x = a[0];
        int y = a[1];
        for (int i = 1; i< a.length; i++){
            y = a[i];
            //System.out.println("x- "+x);
            System.out.println(f.reduce(x, y));
                x = x + a[i];

           // System.out.println("x- "+x);


        }
    }
}
