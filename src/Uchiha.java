public class Uchiha extends Ninja{
    String nivelSharingan = "Sharingan nivel 2";
    public void sharinganAtivado(){
        System.out.println("Sharingan ativado com sucesso.");
    }
    @Override
    public void ataqueBase(){
        System.out.println("Eu sou Uchiha e taquei uma Kunai do elemento FOGO.");
    }
    public void ataqueBase(int nivelDeChacra){
        if (nivelDeChacra > 2 ){
            System.out.println("Susano ativado.");
        } else if (nivelDeChacra < 2){
            System.out.println("Eu só consegui ativar o Sharigan.");
        }else {
            System.out.println("Eu to sem chacra.");
        }
    }
}
