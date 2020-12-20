package sample;

public class Game {
    public String name;
    public int rating;
    public String questionSet;
    public int creatorName;

    public Game(String name, String questionSet, int creatorName) {
        this.name = name;
        this.questionSet = questionSet;
        this.creatorName = creatorName;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getQuestionSet() {
        return questionSet;
    }

    public int getCreatorName() {
        return creatorName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
