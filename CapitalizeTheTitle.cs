using System;
using System.Text;
public class CapitalizeTheTitle {
    public string CapitalizeTitle(string title) {
        // bool space=true;
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<title.Length;i++){
        //     if(space){
        //         Console.WriteLine((char)(title[i]-32));
        //         // title[i]=(char)(title[i]-('a'-'A'));
        //        if(title[i]>'Z')sb.Append((char)(title[i]-32));
        //        else sb.Append(title[i]);
        //         space=false;
        //     }else if(title[i]==' '){
        //         space=true;
        //         sb.Append(title[i]);
        //     }else if(title[i]>='A'&&title[i]<='Z'){
        //         // title[i]=(char)((int)title[i]+32);
        //         sb.Append((char)(title[i]+32));
        //     }else{
        //         sb.Append(title[i]);
        //     }
        // }
        // return sb.ToString();
        string[] words = title.Split(' ');

        for (int i = 0; i < words.Length; i++) {
            string w = words[i].ToLower();

            if (w.Length > 2) {
                // Capitalize first letter, keep remaining lowercase
                words[i] = char.ToUpper(w[0]) + w.Substring(1);
            } else {
                // Length <= 2 words must be fully lowercase
                words[i] = w;
            }
        }

        return string.Join(" ", words);
    }
}
