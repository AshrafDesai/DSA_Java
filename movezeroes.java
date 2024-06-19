
public class movezeroes {
    public static void main(String[] args){
        int [] arr = {1,3,5,0,6,0,7,0};
        int len = arr.length;
        int cnt = 0;
        
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                arr[cnt++] = arr[i];
            }
        }
        while(cnt<len){
            arr[cnt++] = 0;
        }
        for(int i = 0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }
}