package HashMap;

import Heaps.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoding {

    private final HashMap<String, String> encoder;
    private final HashMap<String, String> decoder;

    class Node implements Comparable<Node>{

        Character data;
        int cost ;
        Node left ;
        Node right ;

        public Node(Character data, int cost){
            this.data = data ;
            this.cost = cost ;
            this.left = null ;
            this.right = null ;
        }

         @Override
         public int compareTo(Node o) {
             return 0;
         }
     }

    public HuffmanCoding(String feeder) throws Exception{

        HashMap<Character, Integer> fmap = new HashMap<>();

        for(int i = 0 ; i < feeder.length() ; i++) {
            char cc = feeder.charAt(i);

            if(fmap.containsKey(cc)){
                int ov = fmap.get(cc);
                ov += 1 ;
                fmap.put(cc, ov) ;     // original value
            }
            else{
                fmap.put(cc, 1) ;
            }
        }

        Heaps<Node> minHeap = new Heaps<Node>() ;
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet() ;

        for( Map.Entry<Character, Integer> entry : entrySet){
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while(minHeap.size() != 1){
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first ;
            newNode.right = second ;

            minHeap.insert(newNode);
        }

        Node ft = minHeap.remove();

        this.encoder = new HashMap<>() ;
        this.decoder = new HashMap<>() ;

        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node ft, String osf){

         if(ft == null){
             return ;
         }

         if( ft.left == null && ft.right == null){
             this.encoder.put(String.valueOf(ft.data), osf);
             this.decoder.put(String.valueOf(ft.data), osf);
         }
         initEncoderDecoder(ft.left, osf + '\0');
         initEncoderDecoder(ft.right, osf + '\0');
    }

    public String encode(String msg){

         String ans = "" ;

         for(int i = 0 ; i < msg.length() ; i++) {
             ans = ans +  encoder.get(msg.charAt(i));
         }

         return ans ;
    }

    public String decode(String msg){

        String key = "" ;
        String ans = "" ;

        for(int i = 0 ; i < msg.length() ; i++) {
            key += msg.charAt(i) ;

            if(decoder.containsKey(key)){
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans ;
    }

    static void main() throws Exception {

        String str = "aabbccded" ;

        HuffmanCoding hc = new HuffmanCoding(str) ;

        String cs = hc.encode(str);
        System.out.println(cs);

        String dc = hc.decode(cs) ;

        System.out.println(dc);


    }
}
