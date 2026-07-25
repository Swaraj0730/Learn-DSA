public class CanReach {

    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] visited = new boolean[n];
        return dfs(s, 0, minJump, maxJump, visited);
    }
    private boolean dfs(String s, int index, int minJump, int maxJump, boolean[] visited) {
        if (index == s.length() - 1) {
            return true;    
        }
        if (index >= s.length()) {
            return false;   
    }
        if (s.charAt(index) == '1' || visited[index]) {
            return false;    
        }
        visited[index] = true ;
        for (int jump = minJump; jump <= maxJump; jump++) { 
            if (dfs(s, index + jump, minJump, maxJump, visited)) {
                return true;    
            }
        }
        return false;       
    }                 

    public static void main(String[] args) {
        CanReach canReach = new CanReach();
        int minJump = 1;
        int maxJump = 1;
        boolean result = canReach.canReach("01", minJump, maxJump);
        System.out.println(result); 
    }
}
