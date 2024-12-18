import java.util.Iterator;
import java.util.TreeMap;

public class Dictionnaire implements Iterable<String> {
    TreeMap<String,String> dictionnaire;
    public Dictionnaire(){
        dictionnaire = new TreeMap<String,String>();
    }
    public boolean ajouter(String mot,String definition){
        if (mot == null || dictionnaire.keySet().contains(mot)) {
            return false;
        }
        dictionnaire.put(mot, definition);
        return true;
    }
    public String enlever(String mot){
        if(mot==null || !dictionnaire.keySet().contains(mot)) return null;
        return dictionnaire.get(mot);
    }
    public boolean modifier(String mot,String difinition){
        if(mot == null || ! dictionnaire.keySet().contains(mot)){
            return false;
        }
        dictionnaire.put(mot, difinition);
        return true;
    }

    @Override
    public Iterator<String> iterator(){
        return dictionnaire.keySet().iterator();
    }
}