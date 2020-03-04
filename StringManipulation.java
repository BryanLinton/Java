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
    public String concatSubString(String wordE, int n1, int n2, String wordF){
        String subString2 = wordE.substring(n1, n2);
        return wordF.concat(subString2); 
    }

}