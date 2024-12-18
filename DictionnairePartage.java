import java.util.TreeMap;

public class DictionnairePartage{
    TreeMap<String,String> dictionnaire;
    public DictionnairePartage(){
        dictionnaire = new TreeMap<String,String>();
    }
    public synchronized boolean ajouter(String mot,String definition) throws Exception { 
        if (mot == null || dictionnaire.keySet().contains(mot)) {
            return false;
        }
        while (dictionnaire.size()>=1000) {
            wait();
        }
        dictionnaire.put(mot, definition);
        return true;
    }
    public synchronized String enlever(String mot) throws Exception{
        if(mot==null || !dictionnaire.keySet().contains(mot)) return null;
        while (dictionnaire.size()<=1) {
            wait();
        }
        return dictionnaire.get(mot);
    }
    public synchronized boolean modifier(String mot,String difinition){
        if(mot == null || ! dictionnaire.keySet().contains(mot)){
            return false;
        }
        dictionnaire.put(mot, difinition);
        return true;
    }
}
