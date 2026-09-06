class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strs.size(); i++) { 
            sb.append(strs.get(i).length()); 
            sb.append("#"); 
            sb.append(strs.get(i)); 
        } 
        System.out.println("sb : " + sb); 
        return sb.toString(); 
    }


    // "5#Hello5#World"
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>(); 
        int i=0, j=0; 
        while(j<str.length()) {
            while(str.charAt(j)!='#') j++; 
            int len = Integer.parseInt(str.substring(i, j)); 
            System.out.println("len: " + len + ", i: " + i + " ,j: " + j);
            list.add(str.substring(j+1, j+len+1)); 
            i = len + j + 1;
            j = i;  
        }
        return list; 
    }
}
