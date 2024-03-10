class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        Map<Character,Integer> mapMagazine = new HashMap<>();

        boolean check = true;

        for(int i = 0; i < magazine.length(); i++){
            if(mapMagazine.containsKey(magazine.charAt(i))){
                int temp = mapMagazine.get(magazine.charAt(i));
                temp++;
                mapMagazine.replace(magazine.charAt(i), temp);
            }else{
                mapMagazine.put(magazine.charAt(i), 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            if(mapMagazine.containsKey(ransomNote.charAt(i))){
                int temp = mapMagazine.get(ransomNote.charAt(i));
                temp--;
                if(temp!=0){
                    mapMagazine.replace(ransomNote.charAt(i), temp);
                }else{
                    mapMagazine.remove(ransomNote.charAt(i));
                }
            }else{
                check = false;
            }
        }

        return check;
    }
}