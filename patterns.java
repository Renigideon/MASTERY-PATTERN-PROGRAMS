package dsa_array;

public class patterns {
    public static void main(String[] args) {
        pattern(5);
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("____________________________________________");
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }
    static void pattern4(int n){
        int print=1;
        for(int i=1;i<=n;i++){
            print=i%2==0?1:0;
            for(int j=1;j<=i;j++){
                System.out.print(print+" ");
                print=print==0?1:0;
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }
    static void pattern5(int n){
        int print=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(print+++" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
    }
    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-(row-1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }
    static void pattern7(int n){
        int print=n;
        for(int row=1;row<=n;row++){
            int printv=print--;
            for(int col=1;col<=n-(row-1);col++){
                System.out.print(printv+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }
    static void pattern8(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-(row-1);col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }
    static void pattern9(int n){
        for(int row=1;row<=n*2-1;row++){
            int rowchange=(row>n) ? (n*2)-row:row;
            for(int col=1;col<=rowchange;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }
    static void pattern10(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++) {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
    static void pattern11(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-(row-1);col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }
    static void pattern12(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=(row*2)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }
    static void pattern13(int n){
        for(int i=n;i>=1;i--){
            for(int space = 1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int col=1;col<=i*2-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
    }
    static void pattern14(int n){
        for(int row=1;row<=(n*2)-1;row++){
            int rowchange=(row>n)?(n*2)-row:row;
            for(int space=1;space<=n-rowchange;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=rowchange*2-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }
    static void pattern15(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
        }
            for(int col=1;col<=(row*2)-1;col++){
                if(col==1 || col==(row*2)-1 || row==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
