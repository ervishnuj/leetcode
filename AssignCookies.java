class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int childIndex=0;
        int cookiesIndex=0;
        while(childIndex<g.length&&cookiesIndex<s.length){
            if(g[childIndex]<=s[cookiesIndex]){
                childIndex++;
            }
            cookiesIndex++;
        }
        return childIndex;
        // if(s.length>=g.length)return g.length;
        // // return s.length;
        // return (int)(Math.ceil(s.length/g.length))+1;
    }
}
