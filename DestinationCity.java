import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        int m=paths.get(0).size();
        int n=paths.size();
        
        HashSet<String> source=new HashSet<>();
        for(List<String> s:paths){
            source.add(s.get(0));
        }
        for(List<String> s:paths){
            if(!source.contains(s.get(1)))return s.get(1);
        }
        return paths.get(n-1).get(m-1);
        
    }
}
