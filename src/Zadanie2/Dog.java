package Zadanie2;

public class Dog extends Mammal{
    private String breed;

    Dog(){
        super();
        breed="NN";
    }
    public Dog(String name,int age,int weight,String rzad,String breed){
        //super(name, age, weight, rzad);
        this.breed=breed;
    }
    public Dog(int age,String rzad,String breed){
        //super(age,rzad);
        this.breed=breed;
    }
    public void aport(){System.out.println("Pies aportuje");}

   // @Override
    public void drinkMilk(){System.out.println("Pies pije mleko");}

    //@Override
    public void getVoice(){System.out.println("Pies szczeka");}

   // @Override
    public void eat(String jedzenie){System.out.println("Pies je"+jedzenie);}

    public String getBreed(){return breed;}
    public void setBreed(String breed){this.breed=breed;}
}
