class Solution {
    public String countAndSay(int n) {
        StringBuilder s=new StringBuilder();
        s.append('1');
        for(int i=2;i<=n;i++){
            StringBuilder str=new StringBuilder();
            int count=1;
            int len =s.length();
            for(int j=0;j<len-1;j++){
                if(s.charAt(j)==s.charAt(j+1))
                count++;
                else{
                    str.append(count+""+s.charAt(j));
                    count =1;
                }
            }
              str.append(count+""+s.charAt(len-1));
            s=str;
        }
          return s.toString();

    }
}