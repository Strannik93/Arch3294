package Domain;

/**
 * Оценка фильма. 
 */
public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    /**
    * Конструктор с названием, реитингом и оценкой
    */
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    /**
    * Переопределние метода toString для удобного вывода 
    */
    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}