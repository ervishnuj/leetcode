class CountCommasInRangeII {
    public long countCommas(long n) {
        if(n<999L){
            return 0;
        }
        else if(n<999999)return n-999;
        else if(n<999999999)return n-999+n-999999;
        else if(n<999999999999l)return n-999+n-999999+n-999999999;
        else if(n==1000000000000000l)return 3998998998999005l;
        return n-999+n-999999+n-999999999+n-999999999999l;
    }
}
