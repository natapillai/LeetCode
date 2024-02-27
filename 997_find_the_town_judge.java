class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> truster = new HashSet<>();
        HashSet<Integer> all = new HashSet<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        if(n == 1 && trust.length == 0){
            return 1;
        }

        int sol = -1;

        for(int i = 0; i < trust.length; i++){
            if(!truster.contains(trust[i][0])){
                truster.add(trust[i][0]);
            }
            if(!all.contains(trust[i][0])){
                all.add(trust[i][0]);
            }
            if(!all.contains(trust[i][1])){
                all.add(trust[i][1]);
            }

            if(map.containsKey(trust[i][0])){
                map.get(trust[i][0]).add(trust[i][1]);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(trust[i][1]);
                map.put(trust[i][0], list);
            }
        }

        int count = 0;
        for(Integer keys: all){
            if(truster.contains(keys)){
                continue;
            }else if(!truster.contains(keys)){
                count++;
                sol = keys;
            }
        }

        for(int i = 0; i < map.size(); i++){
            if(!map.get(trust[i][0]).contains(sol)){
                return -1;
            }
        }

        if(count>1){
            sol = -1;
        }

        return sol;
    }
}