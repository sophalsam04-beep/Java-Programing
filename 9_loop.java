public class Main {
    public static void main(String[] args) {

        System.out.println("-------For loop------");
            // store data
           for (int a=1;a<=100;a++){
               System.out.println("Data is storing...!");
           }

           for(int x=1;x<=10;x++){
               for (int y=1;y<=20;y++){
                   for (int z=1;z<=10;z++){
                            System.out.println("Value is number...!");
                   }
               }
           }


            System.out.println("----- While loop------");

           int f = 1;
                while ( f<=10 ){
                    System.out.println(f);
                    f++;
            }


                System.out.println("-----While loop-----");
                int g = 1;
                while (g<10){
                    System.out.println(g);
                        g++;
                }



           int r = 1;

                do {
                    System.out.println(r);
                    r++;
                }while (r<=10);


             int w =100;
             do {
                    // code execute
                 System.out.println(w);
                 w++;
             }while (g<=200);

    }


}
