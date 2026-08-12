public class JogoVelha{
    public static void main(String[] args){
        String[][] velha = new String[3][3];
        int l = 0;
        for(int c = 0; c <= 3; c++){
                    velha[c][l] = "[ ]";
        }
        System.out.print(velha);
    }
}