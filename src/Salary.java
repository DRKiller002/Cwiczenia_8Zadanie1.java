public interface Salary {
float jcSalarytoPay(float stawkagodzinowa, float iloscgodzin);
static boolean Premia(int  latadoswiadczenia){return  latadoswiadczenia>3;}
default float salaryForOvertime(float premiazanadgodziny1,float premiazanadgodziny2){return premiazanadgodziny1+premiazanadgodziny2;}
}
