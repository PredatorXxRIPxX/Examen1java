import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DictionnaireEvolue extends DictionnaireAvance {
    Iterator<String> trieIterator(){
        List<String> mots = new LinkedList<String>(super.dictionnaire.keySet());
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String m1,String m2){
                if(m1.length() == m2.length()){
                    return m1.compareTo(m2);
                }
                return Integer.compare(m1.length(), m2.length());
            }
        };
        mots.sort(comp);
        return mots.iterator();
    }
}
