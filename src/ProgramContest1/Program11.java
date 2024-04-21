package ProgramContest1;
/*11) Given an array health[] where health[i] is the health of the ith player in a game, any
player can attack any other player in the game. The health of the player being attacked
will be reduced by the amount of health the attacking player has. The task is to find the
minimum possible health of the winning player. (PS- Always the player with lower health
will attack the player with higher health)
Sample 1 - Input: health[] = {4, 6, 8}
Output: 2*/
public class Program11 {
    public static void main(String[] args) {
        int []health={3,57,90};
        int factor=health[0];
        for(int i=0;i<health.length;i++) {
            if (factor < health[i]) {
                factor = health[i];
            }
        }
           //System.out.println(factor);
            int j;
            while(factor>1){
                for(j=0;j<health.length;j++) {
                    if (health[j] % factor != 0) {
                        break;
                    }
                }
                    if(j==health.length){
                        break;
                    }

                factor--;
            }

        System.out.println(factor);
    }
}
