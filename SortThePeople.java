class SortThePeople {
    public String[] sortPeople(String[] names, int[] height) {
        HashMap<Integer,String> map=new HashMap<>();
        int n=names.length;
        // ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(height[i],names[i]);
            // al.add(height[i]);
        }
        // Collections.sort(al);
        Arrays.sort(height);
        String[] name=new String[n];
        int k=n-1;
        for(Integer i:height){
            name[k--]=map.get(i);
        }
        return name;
    }
}
