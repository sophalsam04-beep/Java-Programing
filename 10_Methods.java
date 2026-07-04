public class Main {
        // methods return types
            static int add(int a, int b){

                return (a+b);
            }

            static int sub(int a,int b,int c){
                    return (a-b);
            }

            static double mul(double a, double b, double c){
                    return (a*b*c);
                }

                static double div(double a, double b, double c){
                    return (a/b+c);
                }



    public static void main(String[] args) {
            // Methods call
        int result_add = add(10,50);
        int result_sub = sub(4,5,6);
        int result_mul = (int)mul(4,5,50);
        int result_div = (int) div(4,4,5);

        System.out.println(result_add);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);


    }



}
