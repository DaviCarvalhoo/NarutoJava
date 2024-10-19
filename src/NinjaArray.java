public class NinjaArray {
    public static void main(String[] args) {
        String[] ninjas = new String[4];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";
        for(String nomeNinja : ninjas){
            Ninja ninja = new Ninja();
            ninja.setNome(nomeNinja);
            System.out.println(ninja.getNome());
        }
    }
}
