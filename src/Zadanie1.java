import java.util.Scanner;
public class Zadanie1 {

    public static void main(String[]args){
    Kadra kadra=new Kadra();
    kadra.jcinicjuj1();
    kadra.jcdrukuj1();
    }
}


     class Osoba{
        String nazwisko;
        String imie;
        String ulica;
        String kod;
        String miasto;
        public void jcinicjuj(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj nazwisko:");
            nazwisko=sc.nextLine();
            System.out.println("Podaj imię:");
            imie=sc.nextLine();
            System.out.println("Podaj ulicę:");
            ulica=sc.nextLine();
            System.out.println("Podaj kod:");
            kod=sc.nextLine();
            System.out.println("Podaj miasto:");
            miasto=sc.nextLine();


        }
        public void jcdrukuj(){
            System.out.println("Nazwisko:"+nazwisko);
            System.out.println("\nImie:"+imie);
            System.out.println("\nUlica:"+ulica);
            System.out.println("\nkod:"+kod);
            System.out.println("\nMiasto:"+miasto);

        }
    }

    class  Kadra extends Osoba implements Salary{

        public String wyksztalcenie;
         public String stanowisko;

         public void jcinicjuj1() {
            super.jcinicjuj();
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj wyksztalcenie:");
            wyksztalcenie = sc.nextLine();
            System.out.println("Podaj stanowisko:");
            stanowisko = sc.nextLine();
//             System.out.println("Podaj wynagrodzenie pierwsze:");
//             latadoswiadczenia = sc.nextLine();
        }
         public void jcdrukuj1(){
            super.jcdrukuj();
            System.out.println("\nkod:"+wyksztalcenie);
            System.out.println("\nMiasto:"+stanowisko);
            System.out.println("\nWynagrodzenie do zapłacenia:"+jcSalarytoPay(40,60));
            System.out.println("\nNadgodziny do zapłacenia:"+salaryForOvertime(400,1200));
            System.out.println("\nCzy staż jest wystarczający,aby przyznać premię:"+Premia(5));




        }

        public float jcSalarytoPay(float stawkagodzinowa, float iloscgodzin) {return stawkagodzinowa*iloscgodzin;}
        @Override
        public float salaryForOvertime(float premiazanadgodziny1,float premiazanadgodziny2){return premiazanadgodziny1+premiazanadgodziny2;}

        public static boolean Premia(int  latadoswiadczenia){return  latadoswiadczenia>3;}





    }



