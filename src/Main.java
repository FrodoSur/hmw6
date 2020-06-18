public class Main {
    public static void main(String[] args) {
        twoTest();
    }
    public static int[] two(int[] a){
        int y = -1;
        boolean b =false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==4){
                y=i;
                b = true;
            }
        }
        int[] mas = new int[0];
        if(!b){
            throw new RuntimeException();
        }
        mas = new int[a.length-y-1];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=a[i+y+1];
            System.out.print(mas[i]+" ");
        }
        System.out.println(" ");
        return(mas);
    }
    public static void twoTest(){
        int a[] = new int[]{1,4,3,2,5,4,1,2,3};
        try {
            int b[] = two(a);
        }
        catch(RuntimeException e){
            System.out.println("Нет четвёрок");
        }
        int c[] = new int[]{1,2,3};
        try {
            int d[] = two(c);
        }
        catch(RuntimeException e){
            System.out.println("Нет четвёрок");
        }
        int v[] = new int[]{4};
        try {
            int f[] = two(v);
        }
        catch(RuntimeException e){
            System.out.println("Нет четвёрок");
        };
        int g[] = new int[]{4,-1,-4,23,16};
        try {
            int h[] = two(g);
        }
        catch(RuntimeException e){
            System.out.println("Нет четвёрок");
        };
        System.out.println(three(a));
        System.out.println(three(c));
        System.out.println(three(v));
        System.out.println(three(g));
    }
    public static boolean three(int[] mas){
        for (int i = 0; i < mas.length; i++) {
             if(mas[i]==4||mas[i] == 1){
                 return(true);
             }
        }
        return(false);
    }
}
