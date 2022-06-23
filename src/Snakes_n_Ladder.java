import java.util.*;

public class Snakes_n_Ladder {
    private static final Dice d1 = new Dice(6);
    private static final Dice d2 = new Dice(6);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player 1 name, and hit enter: ");
        String name1 = sc.nextLine();
        System.out.print("Enter player 2 name, and hit enter: ");
        String name2 = sc.nextLine();
        System.out.println("The game setup is ready");
        Player p1 = new Player(name1,-1);
        Player p2 = new Player(name2, -1);

        Floor[] floor_array = new Floor[101];
        floor_array[0] = new Empty_Floor();
        floor_array[1] = new Empty_Floor(); ///
        floor_array[2] = new Normal_Ladder_Floor(); ///
        floor_array[3] = new Empty_Floor();
        floor_array[4] = new Empty_Floor();
        floor_array[5] = new Stair_Floor(); ///
        floor_array[6] = new Empty_Floor();
        floor_array[7] = new Empty_Floor();
        floor_array[8] = new Empty_Floor();
        floor_array[9] = new Stair_Floor();  ///
        floor_array[10] = new Elevator_Floor(); ///
        floor_array[11] = new Empty_Floor();
        floor_array[12] = new Normal_Snake_Floor(); ////
        floor_array[13] = new Empty_Floor();
        floor_array[14] = new Empty_Floor();
        floor_array[15] = new Empty_Floor();
        floor_array[16] = new Empty_Floor();
        floor_array[17] = new Empty_Floor();
        floor_array[18] = new Normal_Ladder_Floor();  ///
        floor_array[19] = new Empty_Floor();
        floor_array[20] = new Stair_Floor();  ///
        floor_array[21] = new Normal_Snake_Floor(); ////
        floor_array[22] = new Elevator_Floor(); ///
        floor_array[23] = new Empty_Floor();
        floor_array[24] = new King_Cobra_Floor(); ////
        floor_array[25] = new Empty_Floor();
        floor_array[26] = new Empty_Floor();
        floor_array[27] = new Empty_Floor();
        floor_array[28] = new Empty_Floor();
        floor_array[29] = new Stair_Floor();  ///
        floor_array[30] = new Empty_Floor();
        floor_array[31] = new Empty_Floor();
        floor_array[32] = new Empty_Floor();
        floor_array[33] = new Stair_Floor();  ///
        floor_array[34] = new Empty_Floor();
        floor_array[35] = new Empty_Floor();
        floor_array[36] = new Empty_Floor();
        floor_array[37] = new Normal_Snake_Floor(); ////
        floor_array[38] = new Empty_Floor();
        floor_array[39] = new Empty_Floor();
        floor_array[40] = new Empty_Floor();
        floor_array[41] = new King_Cobra_Floor(); ////
        floor_array[42] = new Empty_Floor();
        floor_array[43] = new Empty_Floor();
        floor_array[44] = new Empty_Floor();
        floor_array[45] = new Empty_Floor();
        floor_array[46] = new Empty_Floor();
        floor_array[47] = new Empty_Floor();
        floor_array[48] = new Stair_Floor();///
        floor_array[49] = new Empty_Floor();
        floor_array[50] = new Anaconda_Floor(); ////
        floor_array[51] = new Normal_Ladder_Floor(); ///
        floor_array[52] = new Empty_Floor();
        floor_array[53] = new Empty_Floor();
        floor_array[54] = new Empty_Floor();
        floor_array[55] = new Empty_Floor();
        floor_array[56] = new Elevator_Floor();   ///
        floor_array[57] = new Empty_Floor();
        floor_array[58] = new Empty_Floor();
        floor_array[59] = new King_Cobra_Floor();  ////
        floor_array[60] = new Empty_Floor();
        floor_array[61] = new Empty_Floor();
        floor_array[62] = new Empty_Floor();
        floor_array[63] = new Empty_Floor();
        floor_array[64] = new Empty_Floor();
        floor_array[65] = new Empty_Floor();
        floor_array[66] = new Normal_Snake_Floor(); ////
        floor_array[67] = new Empty_Floor();
        floor_array[68] = new Empty_Floor();
        floor_array[69] = new Empty_Floor();
        floor_array[70] = new Anaconda_Floor();  ////
        floor_array[71] = new Stair_Floor(); ///
        floor_array[72] = new Empty_Floor();
        floor_array[73] = new Empty_Floor();
        floor_array[74] = new Empty_Floor();
        floor_array[75] = new Empty_Floor();
        floor_array[76] = new Normal_Ladder_Floor();  ///
        floor_array[77] = new Empty_Floor();
        floor_array[78] = new King_Cobra_Floor();  ////
        floor_array[79] = new Empty_Floor();
        floor_array[80] = new Normal_Snake_Floor();  ////
        floor_array[81] = new Empty_Floor();
        floor_array[82] = new Empty_Floor();
        floor_array[83] = new Empty_Floor();
        floor_array[84] = new Empty_Floor();
        floor_array[85] = new Empty_Floor();
        floor_array[86] = new Empty_Floor();
        floor_array[87] = new Empty_Floor();
        floor_array[88] = new Empty_Floor();
        floor_array[89] = new Empty_Floor();
        floor_array[90] = new Empty_Floor();
        floor_array[91] = new Empty_Floor();
        floor_array[92] = new Empty_Floor();
        floor_array[93] = new Empty_Floor();
        floor_array[94] = new Empty_Floor();
        floor_array[95] = new Empty_Floor();
        floor_array[96] = new Empty_Floor();
        floor_array[97] = new Empty_Floor();
        floor_array[98] = new Empty_Floor();
        floor_array[99] = new Anaconda_Floor();  ////
        floor_array[100] = new Empty_Floor();
        boolean to_or_inverse_p1 = false;
        boolean to_or_inverse_p2 = false;
        int count_p1 = 0;
        int count_p2 = 0;
        HashSet<Integer> square_numbers = new HashSet<>();
        func_to_add_squares(square_numbers);

        HashSet<Integer> primes = new HashSet<>();
        func_to_add_primes(primes);
        boolean p1_started = false;
        boolean p2_started = false;

        boolean p1_square = false;
        boolean p2_square = false;

        boolean t = false;
        boolean spacing = false;
        while(true){

            System.out.print(" Hit enter to roll the dice");
            sc.nextLine();

            d1.roll();

            d2.roll();

            System.out.println(" Player 1                                                   | Player 2                                                   ");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println(" "+d1+"                                                | "+d2);
            if(!p1_started){
                if(d1.getFace()!=1){
                    System.out.print(" Game cannot start until you get 1                          | ");
                }
                else{
                    System.out.print(" Game started                                               | ");
                    p1_started=true;
                    if(p2_started){
                        spacing=true;
                    }
                }
            }
            else if(!p2_started){
                System.out.print("                                                            | ");
            }
            if(!p2_started){
                if(d2.getFace()!=1){
                    System.out.println("Game cannot start until you get 1");
                }
                else{
                    System.out.println("Game started");
                    if(!p1_started)
                        System.out.print("                                                            | ");
                    p2_started=true;
                }
            }
            if(p1_started || p2_started){
                if(spacing){
                    p2.setLevel(d2.getFace()+p2.getLevel());

                    if(p2.getLevel()>=100){
                        System.out.printf("%s is on level %d (%s)\n", name2, 100,floor_array[100]);
                        System.out.println(" "+ name2 +" has won the game.");
                        break;
                    }
                    else if(p2.getLevel()>10){
                        System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                    }
                    else{
                        System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                    }
                    p1.setLevel(0);
                    System.out.printf(" "+ name1 +" is on level 0 (%s)                | ",floor_array[0]);
                    if(square_numbers.contains(p2.getLevel())){
                        int temp = p1.getLevel();
                        p1.setLevel(p2.getLevel());
                        p2.setLevel(temp);

                        System.out.print(" Level swapped with " + name2 +"                                    | ");
                        System.out.printf("%s reached a perfect square, level swapped with %s\n", name2, name1);

                        int len = floor_array[p1.getLevel()].getLength_string();
                        if(p1.getLevel()>10){
                            System.out.printf(" %s is on level %d (%s)", name1,p1.getLevel(),floor_array[p1.getLevel()]);
                            for(int i =0;i<23-len;i++){
                                System.out.print(" ");
                            }
                            System.out.print("| ");
                        }
                        else{
                            System.out.printf(" %s is on level %d (%s)", name1, p1.getLevel(),floor_array[p1.getLevel()]);
                            for(int i =0;i<24-len;i++){
                                System.out.print(" ");
                            }
                            System.out.print("| ");
                        }
                        System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                    }
                    else{
                        System.out.println("");
                    }
                    spacing = false;
                }
                else{
                    if(p1_started){
                        if(p1.getLevel()==-1){
                            p1.setLevel(0);
                            System.out.printf(" "+ name1 +" is on level 0 (%s)                | ",floor_array[0]);
                        }
                        else{
                            p1.setLevel(d1.getFace()+p1.getLevel());
                            int len = 0;
                            if(p1.getLevel()<=100){
                                len = floor_array[p1.getLevel()].getLength_string();
                            }

                            if(p1.getLevel()>=100){
                                System.out.printf(" %s is on level %d (%s)\n", name1, 100,floor_array[100]);
                                System.out.println(" "+ name1 +" has won the game.");
                                break;
                            }
                            else if(p1.getLevel()>10){
                                System.out.printf(" %s is on level %d (%s)", name1, p1.getLevel(),floor_array[p1.getLevel()]);
                                for(int i =0;i<23-len;i++){
                                    System.out.print(" ");
                                }
                                System.out.print("| ");
                            }
                            else{
                                System.out.printf(" %s is on level %d (%s)", name1, p1.getLevel(),floor_array[p1.getLevel()]);
                                for(int i =0;i<24-len;i++){
                                    System.out.print(" ");
                                }
                                System.out.print("| ");
                            }

                            if(square_numbers.contains(p1.getLevel())&&p2_started){
                                int temp = p1.getLevel();
                                p1.setLevel(p2.getLevel()+d2.getFace());
                                p2.setLevel(temp);

                                p1_square = true;
                            }
                        }
                    }


                    if(p2_started){
                        if(p2.getLevel()==-1){
                            p2.setLevel(0);
                            System.out.printf(name2 +" is on level 0 (%s)\n",floor_array[0]);

                        }
                        else{
                            if(p1_square){
                                System.out.printf("%s is on level %d (%s)\n", name2, p1.getLevel(),floor_array[p1.getLevel()]);

                                System.out.printf(" %s reached a perfect square, level swapped with %s     |", name1, name2);
                                System.out.println(" Level swapped with " + name1);



                                int len = 0;
                                len = floor_array[p1.getLevel()].getLength_string();
                                if(p1.getLevel()>=100){
                                    System.out.printf("%s is on level %d (%s)\n", name1,100,floor_array[100]);
                                    System.out.println(" "+ name1 +" has won the game.");
                                    break;
                                }
                                else if(p1.getLevel()>10){
                                    System.out.printf(" %s is on level %d (%s)", name1,p1.getLevel(),floor_array[p1.getLevel()]);
                                    for(int i =0;i<23-len;i++){
                                        System.out.print(" ");
                                    }
                                    System.out.print("| ");
                                }
                                else{
                                    System.out.printf(" %s is on level %d (%s)", name1,p1.getLevel(),floor_array[p1.getLevel()]);
                                    for(int i =0;i<24-len;i++){
                                        System.out.print(" ");
                                    }
                                    System.out.print("| ");
                                }
                                p1_square = false;
                                System.out.printf("%s is on level %d (%s)\n", name2,p2.getLevel(),floor_array[p2.getLevel()]);
                            }
                            else{
                                p2.setLevel(p2.getLevel()+ d2.getFace());
                                if(p2.getLevel()>=100){
                                    System.out.printf("%s is on level %d (%s)\n", name2, 100,floor_array[100]);
                                    System.out.println(" "+ name2 +" has won the game.");
                                    break;
                                }
                                else if(p2.getLevel()>10){
                                    System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                                }
                                else{
                                    System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                                }
                                if(square_numbers.contains(p2.getLevel()) && p1_started){
                                    int temp = p1.getLevel();
                                    p1.setLevel(p2.getLevel());
                                    p2.setLevel(temp);

                                    System.out.print(" Level swapped with " + name2 +"                                    | ");
                                    System.out.printf("%s reached a perfect square, level swapped with %s\n", name2, name1);

                                    int len = floor_array[p1.getLevel()].getLength_string();
                                    if(p1.getLevel()>10){
                                        System.out.printf(" %s is on level %d (%s)", name1, p1.getLevel(),floor_array[p1.getLevel()]);
                                        for(int i =0;i<23-len;i++){
                                            System.out.print(" ");
                                        }
                                        System.out.print("| ");
                                    }
                                    else{
                                        System.out.printf(" %s is on level %d (%s)", name1, p1.getLevel(),floor_array[p1.getLevel()]);
                                        for(int i =0;i<24-len;i++){
                                            System.out.print(" ");
                                        }
                                        System.out.print("| ");
                                    }
                                    System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                                }
                            }
                        }
                    }
                    else{
                        t = true;
                        System.out.println("");
                    }
                }
                boolean temp =false;
//                System.out.println("");
                if(p1.getLevel()<0 || floor_array[p1.getLevel()].getTo_level()==1){

                }
                else{
                    t = false;
                    temp = true;
                    p1.setLevel(p1.getLevel() +floor_array[p1.getLevel()].getTo_level());
                    int len = 0;
                    if(p1.getLevel()<=100){
                        len = floor_array[p1.getLevel()].getLength_string();
                    }
                    if(p1.getLevel()>=100){
                        System.out.printf("%s is on level %d (%s)\n", name1,100,floor_array[100]);
                        System.out.println(" "+ name1 +" has won the game.");
                        break;
                    }
                    else if(p1.getLevel()>10){
                        System.out.printf(" %s is on level %d (%s)", name1,p1.getLevel(),floor_array[p1.getLevel()]);
                        for(int i =0;i<23-len;i++){
                            System.out.print(" ");
                        }
                        System.out.print("| ");
                    }
                    else{
                        System.out.printf(" %s is on level %d (%s)", name1,p1.getLevel(),floor_array[p1.getLevel()]);
                        for(int i =0;i<24-len;i++){
                            System.out.print(" ");
                        }
                        System.out.print("| ");
                    }
                }
                if(p2.getLevel()<0 || floor_array[p2.getLevel()].getTo_level()==1){
                    if(!t)System.out.println("");

                }
                else{
                    p2.setLevel(p2.getLevel() + floor_array[p2.getLevel()].getTo_level());

                    if(!temp) System.out.print("                                                            | ");
                    System.out.printf("%s is on level %d (%s)\n", name2, p2.getLevel(),floor_array[p2.getLevel()]);
                }
//                Pair p1 = level_p1>=0 ? floor_array[level_p1].getPair():new Pair(1,1);
//                Pair p2 = level_p2>=0 ? floor_array[level_p2].getPair():new Pair(1,1);
//                int new_level_p1 = p1.to_level;
//                int new_level_p2 = p2.to_level;
//                if(square_numbers.contains(level_p1)){
//                    if(primes.contains(level_p1)&& !to_or_inverse_p2){
//                        to_or_inverse_p1 = true;
//                        new_level_p1 = p1.inverse_level;
//                        System.out.println("");
//                        count_p1=0;
//                    }
//                    else if(primes.contains(level_p1)){
//                        if(count_p1>2){
//                            count_p1 = 0;
//                            to_or_inverse_p1 = false;
//                        }
//                        else{
//                            new_level_p1 = p1.inverse_level;
//                            System.out.println("");
//                            count_p1++;
//                        }
//                    }
//                }
//                else if(square_numbers.contains(level_p2)){
//                    if(primes.contains(level_p2)&& !to_or_inverse_p2){
//                        to_or_inverse_p2 = true;
//                        new_level_p2 = p2.inverse_level;
//                        System.out.println("");
//                        count_p2=0;
//                    }
//                    else if(primes.contains(level_p2)){
//                        if(count_p2>2){
//                            count_p2 = 0;
//                            to_or_inverse_p2 = false;
//                        }
//                        else{
//                            new_level_p2 = p2.inverse_level;
//                            System.out.println("");
//                            count_p2++;
//                        }
//                    }
//                }
//                else{
//                    if(!to_or_inverse_p1){
//                        if(primes.contains(level_p1)){
//                            to_or_inverse_p1 = true;
//                            count_p1 = 0;
//                        }
//                    }
//                    if(!to_or_inverse_p2){
//                        if(primes.contains(level_p2)){
//                            to_or_inverse_p2 = true;
//                            count_p2 = 0;
//                        }
//                    }
//
//                    if(count_p1>2){
//                        count_p1 = 0;
//                        to_or_inverse_p1 = false;
//                    }
//                    else{
//                        new_level_p1 = p1.inverse_level;
//                        System.out.println("");
//                        count_p1++;
//                    }
//                    if(count_p2>2){
//                        count_p2 = 0;
//                        to_or_inverse_p2 = false;
//                    }
//                    else{
//                        new_level_p2 = p2.inverse_level;
//                        System.out.println("");
//                        count_p2++;
//                    }
//                }
//                if(new_level_p1==1 && new_level_p2==1){
//
//                }
//                else if(new_level_p1==1){
//                    System.out.print("                                                            | ");
//                    level_p2 += new_level_p2;
//                    System.out.printf("%s is on level %d (%s)\n",name2, level_p2,floor_array[level_p2]);
//                }
//                else if(new_level_p2==1){
//                    level_p1 += new_level_p1;
//                    int len = 0;
//                    if(level_p1<=100){
//                        len = floor_array[level_p1].getLength_string();
//                    }
//                    if(level_p1>=100){
//                        System.out.printf("%s is on level %d (%s)\n",name1,100,floor_array[100]);
//                        System.out.println(" "+name1+" has won the game.");
//                        break;
//                    }
//                    else if(level_p1>10){
//                        System.out.printf(" %s is on level %d (%s)",name1,level_p1,floor_array[level_p1]);
//                        for(int i =0;i<23-len;i++){
//                            System.out.print(" ");
//                        }
//                        System.out.println("| ");
//                    }
//                    else{
//                        System.out.printf(" %s is on level %d (%s)",name1,level_p1,floor_array[level_p1]);
//                        for(int i =0;i<24-len;i++){
//                            System.out.print(" ");
//                        }
//                        System.out.println("| ");
//                    }
//                }
//                else{
//                    level_p1 += new_level_p1;
//                    level_p2 += new_level_p2;
//                    int len = 0;
//                    if(level_p1<=100){
//                        len = floor_array[level_p1].getLength_string();
//                    }
//                    if(level_p1>=100){
//                        System.out.printf("%s is on level %d (%s)\n",name1,100,floor_array[100]);
//                        System.out.println(" "+name1+" has won the game.");
//                        break;
//                    }
//                    else if(level_p1>10){
//                        System.out.printf(" %s is on level %d (%s)",name1,level_p1,floor_array[level_p1]);
//                        for(int i =0;i<23-len;i++){
//                            System.out.print(" ");
//                        }
//                        System.out.print("| ");
//                    }
//                    else{
//                        System.out.printf(" %s is on level %d (%s)",name1,level_p1,floor_array[level_p1]);
//                        for(int i =0;i<24-len;i++){
//                            System.out.print(" ");
//                        }
//                        System.out.print("| ");
//                        System.out.printf("%s is on level %d (%s)\n",name2, level_p2,floor_array[level_p2]);
//                    }
//                }







            }
        }

    }


    public static void func_to_add_squares(HashSet<Integer> square_numbers){
        square_numbers.add(1);
        square_numbers.add(4);
        square_numbers.add(9);
        square_numbers.add(16);
        square_numbers.add(25);
        square_numbers.add(36);
        square_numbers.add(49);
        square_numbers.add(64);
        square_numbers.add(81);
    }

    public static void func_to_add_primes(HashSet<Integer> primes){
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        primes.add(23);
        primes.add(29);
        primes.add(31);
        primes.add(37);
        primes.add(41);
        primes.add(43);
        primes.add(47);
        primes.add(53);
        primes.add(59);
        primes.add(61);
        primes.add(67);
        primes.add(71);
        primes.add(73);
        primes.add(79);
        primes.add(83);
        primes.add(89);
        primes.add(97);
    }
}

class Player{
    private final String name;
    private int level;

    public Player(String name, int level){
        this.name = name;
        this.level = level;

    }
    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }
    public void setLevel(int level){
        this.level = level;
    }
}
class Pair{
    int to_level,inverse_level;
    public Pair(int to_level, int inverse_level){
        this.to_level = to_level;
        this.inverse_level = inverse_level;
    }
}
abstract class Floor{
    private final int to_level;
    private final int inverse_level;
    private final int length_string;
    public Floor(int to_level, int inverse_level, int length_string){
        this.to_level = to_level;
        this.inverse_level = inverse_level;
        this.length_string = length_string;
    }
    public abstract String toString();
    protected Pair getPair(){
        return new Pair(this.to_level,this.inverse_level);
    }
    protected int getLength_string(){
        return this.length_string;
    }
    protected int getInverse_level(){
        return this.inverse_level;
    }

    protected int getTo_level(){
        return to_level;
    }
}

class Empty_Floor extends Floor{
    public Empty_Floor(){
        super(1,1,8);

    }

    public String toString(){
        return "reached an Empty Floor";
    }

}

abstract class Snake_Floor extends Floor{
    public Snake_Floor(int to_level, int down_level, int string_length){
        super(to_level, down_level,string_length);
    }
    public abstract String toString();
}

abstract class Ladder_Floor extends Floor{
    public Ladder_Floor(int to_level, int down_level, int string_length){
        super(to_level, down_level,string_length);
    }
    public abstract String toString();
}
class Stair_Floor extends Ladder_Floor{
    public Stair_Floor(){
        super(6,-8,7);
    }
    public String toString(){
        return "reached a Stair Floor";
    }
}

class Normal_Ladder_Floor extends Ladder_Floor{
    public Normal_Ladder_Floor(){
        super(14,-16,8);

    }
    public String toString(){
        return "reached a Ladder Floor";
    }
}

class Elevator_Floor extends Ladder_Floor{
    public Elevator_Floor(){
        super(35,-47,11);

    }
    public String toString(){
        return "reached an Elevator Floor";
    }
}

class Normal_Snake_Floor extends Snake_Floor{
    public Normal_Snake_Floor(){
        super(-8,6,14);

    }
    public String toString(){
        return "reached a Normal Snake Floor";
    }
}
class King_Cobra_Floor extends Snake_Floor{
    public King_Cobra_Floor(){
        super(-16,14,12);
    }
    public String toString(){
        return "reached a King Cobra Floor";
    }
}

class Anaconda_Floor extends Snake_Floor{
    public Anaconda_Floor(){
        super(-47,35,11);
    }
    public String toString(){
        return "reached an Anaconda Floor";
    }
}


class Dice{
    private final int num_faces;
    private int curr_face;

    public Dice(int num_faces){
        this.num_faces = num_faces;
    }
    public void roll(){
        int curr_face = 1 + (int)(Math.random()*this.num_faces) ;
        setFace(curr_face);
    }
    public void setFace(int curr_face){
        this.curr_face = curr_face;
    }
    public int getFace(){
        return this.curr_face;
    }
    public String toString(){
        return "Dice gave "+this.curr_face;
    }
}