class Solution {
    public List<String> letterCombinations(String digits) {
        
        HashMap<Character,String> digitsMap = new HashMap<Character,String>();
        digitsMap.put('2',"abc");digitsMap.put('3',"def");digitsMap.put('4',"ghi");
        digitsMap.put('5',"jkl");digitsMap.put('6',"mno");digitsMap.put('7',"pqrs");
        digitsMap.put('8',"tuv");digitsMap.put('9',"wxyz");
        
        List<String> result = new ArrayList<String>();
        String current = "";
        backTrack(digits,0,digitsMap,current,result);
        return result;
    }
    
    public void backTrack(String digits,int index,HashMap<Character,String> map,
                          String current,List<String> result){
        
        if(index == digits.length()){
            result.add(current);
            return;
            
        }
        
        String letters = map.get(digits.charAt(index));
        
        for(int i=0;i<letters.length();i++){
         backTrack(digits,index+1,map,current+letters.charAt(i),result);   
        }
        
    }
}
