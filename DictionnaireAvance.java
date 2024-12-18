public class DictionnaireAvance extends Dictionnaire {
    public DictionnaireAvance(){
        super();
    }
    public int taille(){
        return super.dictionnaire.size();
    }
    public String difinition(String mot){
        if (mot == null) {
            return null;
        }
        return super.dictionnaire.get(mot);
    }
    public boolean contient(String mot){
        return super.dictionnaire.containsKey(mot);
    }

}
