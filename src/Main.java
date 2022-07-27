import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner t=new Scanner(System.in);

        int numeroif=0;


        System.out.println("Ingrese el Número:");
        numeroif=t.nextInt();

        if(numeroif >0){
            System.out.println("Número Positivo");
        }else if (numeroif<0){
            System.out.println("Número Negativoo");
        }else{
            System.out.println("El Número es 0");
        }

        //Parte 2: While

        System.out.println("****WHILE*******");

        int numerowhile=0;
        while(numerowhile<3){
            System.out.println(numerowhile);
            numerowhile=numerowhile+1;

        }

        //Parte 3:Do While

        System.out.println("****DO WHILE*******");

        int numeroDowhile=3;
        do{
            System.out.println(numeroDowhile);
            numeroDowhile++;
        }while (numeroDowhile<3);


        //Parte 3: For

        System.out.println("****FOR*******");
        int numeroFor=0;
        for (; numeroFor<=3;numeroFor++ ){
            System.out.println(numeroFor);

        }

        //Parte 4: Switch

        System.out.println("******SWITCH*****");
        String estacion="primavera";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;

            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;

            default:
                System.out.println(estacion);
        }



    }
}