public class vivo1 {
    public static void main(String[] args) {
        play(6,3);
    }

    private static boolean same(int[] person,int l,int n) {
        for (int i=0; i<l; i++) {
            if(person[i] == n)
                return true;
        }
        return false;
    }

    public static void play(int playerNum, int step ) {
        int[] person = new int[playerNum];
        int counter = 1;
        while(true) {
            if(counter > playerNum*step) {
                break;
            }
            for(int i=1;i<=playerNum;i++) {
                while(true) {
                    if(same(person,playerNum,i) == false) {
                        break;
                    }else {
                        i = i+1;
                    }
                }
                if(i > playerNum) {
                    break;
                }
                if(counter%step == 0) {
                    System.out.println(i+" ");
                    person[counter/step -1] = i;
                }
                counter +=1;
            }
        }
        System.out.println();
    }
}