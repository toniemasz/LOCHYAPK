import java.util.Date;

public class Pig {

    private int id;

    private Date date;

    private int number;


    public Pig(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", date=" + date +
                ", number=" + number +
                '}';
    }
}
