import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Trial By Error", "Gonna keep pounding my head against this keyboard");
        trackList.put("Won't stop beeping", "Why is their a construction vehicle always beeping beind my house?");
        trackList.put("Garlic Breath", "I ate too many chips and now my breath smeels like garlic whaaaaa whoooo");
        trackList.put("Tiny Tim", "Spirit, said Scrooge, with an interest he had never felt before, tell me if Tiny Tim will live.");

        RetrieveTrack(trackList);
}
        public static void RetrieveTrack(HashMap<String, String> trackList){
            Set<String> keys = trackList.keySet(); 
            System.out.println(trackList.get("Garlic Breath"));
            for(String key : keys){
                    System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
                }
            }   
}

