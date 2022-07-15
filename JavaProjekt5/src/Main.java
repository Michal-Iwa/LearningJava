public class Main {

    public static void main(String[] args) {
        boolean isCar = false;
        if (isCar) {
            System.out.println("It is not a car");
        }
        isCar = true;
        boolean wasCar = (isCar) ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        int score = 0;
        score = calculateScore(score);
        int score2 = 5;
        score2 = calculateScore(score2);

        System.out.println(score + " " + score2);
    }

    public static int calculateScore(int score) {
        score++;
        return score;
    }
}