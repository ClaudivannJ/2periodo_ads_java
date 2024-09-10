import java.util.ArrayList;

public class task3 {

    public static void task3_1(){
        int number = 1;
        while( number <= 50){
            System.out.print(number + " ");
            number++;
        }
    }

    public static void task3_2(){
        for(int i = 1; i <= 50; i++ ) {
            System.out.print(i + " ");
        }
    }

    public static void task3_3(){
        for(int i = 1; i <= 50; i++ ) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task3_4(){
        int number = 1;
        while(number <=50) {
            if(number % 2 != 0) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    public static void task3_5(){
        int[] arr = {1, 2, 3, 4, 5, 4, 7, 9, 6, 9};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 3) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void task3_6(){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("talles");
        nomes.add("ana");
        nomes.add("maria");
        nomes.add("joao");
        nomes.add("jhonny");

        System.out.println(nomes);

        nomes.remove(1);

        System.out.println("após remover o segundo nome" + nomes);

        if(nomes.getFirst().equals("talles")){
            System.out.println("o primeiro nome é talles " + nomes);
        }else{
            System.out.println("o primeiro nome não é talles " + nomes);
        }
    }



    public static void main(String[] args){
        System.out.println("numeros de 1 a 50 com while ");
        task3_1();
        System.out.println(" ");
        System.out.println("numeros de 1 a 50 com for ");
        task3_2();
        System.out.println(" ");
        System.out.println("numeros pares ");
        task3_3();
        System.out.println(" ");
        System.out.println("numeros impares ");
        task3_4();
        System.out.println(" ");
        System.out.println("numeros maior que 3 no vetor ");
        task3_5();
        System.out.println(" ");

        System.out.println("verifica se o primeiro elemento do array de nomes é talles ");
        System.out.println(" ");
        task3_6();
        System.out.println(" ");
    }

}