public class StringManipulation{
    public String trimAndConcat(String wordA, String wordB){
        return wordA.trim().concat(wordB.trim());
    }
    public Integer getIndexOrNull(String wordC, char a){
        if(wordC.indexOf(a) < 0){
            return null;
        }
        return wordC.indexOf(a);
    }
    public Integer getIndexOrNull2(String wordD, String substring){
        if(wordD.indexOf(substring) < 0){
            return null;
        }
        return wordD.indexOf(substring);
    }
}