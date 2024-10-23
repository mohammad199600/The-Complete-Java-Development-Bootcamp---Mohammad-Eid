import java.lang.reflect.Array;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
String word = words[(int) (Math.random()*words.length)];
String wordCount="Word:\t";
char[] wordShown=new char[word.length()];
String misses="Misses:\t";
int miss=0;
String guess="Guess:\t";
String guessed="";
int remaining=word.length();
boolean found=false;
String toShow="";
for (int i=0;i<word.length();i++)
wordShown[i]='-';
while(remaining>0&&miss<6){
    found=false;
    toShow="";
    System.out.println(gallows[miss]);
    for(int i=0;i<wordShown.length;i++){
        toShow+=wordShown[i];
    }
    System.out.println(wordCount+toShow);
    System.out.println(misses);
System.out.println(guess+guessed);
guessed=scan.nextLine();
for(int i=0;i<word.length();i++){
    if(guessed.charAt(0)==word.charAt(i)){
        wordShown[i]=guessed.charAt(0);
        remaining--;
        found=true;
    }
}
if(!found){
    miss++;
    misses+=guessed;
}

}
System.out.println(gallows[miss]);
toShow="";
for(int i=0;i<wordShown.length;i++){
    toShow+=wordShown[i];
}
System.out.println(wordCount+toShow);
System.out.println(misses);
System.out.println(guess+guessed);
if(miss==6){
    System.out.println("You lose!");

}
else{
    System.out.println("You Win!");
}
scan.close();;






    }

}





