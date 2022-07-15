public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore ("Michal", 500);
        System.out.println("New score is " + newScore);
        int unnamedScore = calculateScore('a',5);
        System.out.println("Unnamed score is " + unnamedScore);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(char playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    //overload działa tylko jak zmieni się ilość parametrów lub zmienić typy parametrów
}