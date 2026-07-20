public String reformatDate(String date) {
        String[] month=date.split(" ");
        System.out.println(month);
        String[] arr={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int m=0;
        for(int i=0;i<12;i++){
            System.out.println(arr[i]);
            if(arr[i].equals(month[1])){
                break;
            }
            m++;
        }
        m++;
        String s = month[0].charAt(0) + ""
                + ((month[0].length()>1 &&
                    month[0].charAt(1)>='0' &&
                    month[0].charAt(1)<='9')
                    ? month[0].charAt(1)
                    : "");
                    if(s.length()==1)
            s="0"+s;
            String mon = (m<10) ? "0"+m : ""+m;
        return (month[2] + "-" + mon + "-" + s).trim();

    }
