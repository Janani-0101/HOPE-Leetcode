import java.util.*;
public class Main{
  public static void main(String[] args){
    String str = "Hi Hello Good";
    for(int i=0;i<str.length();i++){
     if(str.charAt(i)==str.charAt(j)){
       flag = true;
       break;
     }
    }
    if(flag)
      continue;
    int count=1;
    for(int k=i+1;k<str.length();k++){
      if(str.charAt(k)==str.charAt(i)){
        count++;
      }
    }
    if(str.charAt(i)==' '){
      System.out.print(" "+" : "+count);
    }
    else{
      System.out.print(str.charAt(i)+" : "+count);
    }
  }
}
