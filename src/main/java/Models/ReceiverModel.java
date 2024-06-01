package Models;

public class Receiver {
    final String id;
    final String title;

    Receiver(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Receiver1{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
