class ShuffleString {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> map=new HashMap<>();
        int n= indices.length;
        for(int i=0;i<n;i++){
            map.put(indices[i],s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(map.get(i));
        }
        return sb.toString();
    }
}
