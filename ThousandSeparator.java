class ThousandSeparator{
  public String thousandSeparator(int n) {
        // return (n+"").replace(".","");
        if(n==0)return "0";
        StringBuilder sb=new StringBuilder();
        for(int i=0;n>0;i++){
            if(i%3==0&&i!=0)sb.append('.');
            sb.append(n%10);
            n/=10;
        }
        return sb.reverse().toString();
    }
}
