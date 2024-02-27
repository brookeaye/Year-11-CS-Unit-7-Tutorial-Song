import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList<>();
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int howMany(ArrayList <String> listeners){
        int newListeners = 0;
        for (String listener : listeners) {
            listener = listener.toLowerCase();
            if (!this.listeners.isEmpty() && this.listeners.contains(listener)) {
                continue;
            }
            this.listeners.add(listener);
            newListeners++;
        }
        return newListeners;
    }
}
