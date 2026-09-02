package HashMap;

public class KarpRabin {

    private static final int PRIME = 101 ;

    private long calculateHash(String str){
        long hash = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            hash = (long) (hash + str.charAt(i) * Math.pow(PRIME, i));
        }
        return hash ;
    }

    // rolling hash
    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength){
        long newHash = (prevHash - oldChar)/PRIME ;
        newHash = (long) (newHash + newChar * Math.pow(PRIME, patternLength - 1 ));

        return newHash ;
    }

    public void search(String text, String pattern){
        int patternLen = pattern.length() ;
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0, patternLen));

        for(int i = 0 ; i <= text.length()-patternLen ; i++){
            if(textHash == patternHash){
                if(text.substring(i, i + patternLen).equals(pattern)) {
                    System.out.println("found");
                }
            }

            if( i < text.length() - patternLen){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i+ patternLen), patternLen);
            }
        }
    }

    static void main() {

        KarpRabin kr = new KarpRabin();

        kr.search("apporvkunalrahul", "kual");

    }
}
