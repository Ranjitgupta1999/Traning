public class Array_5_D {
    public static void main(String[] args) {
        int arr [][][][][]={{{{{50,70,80,90,30}}}},{{{{20,55,65,75,72}}}}};
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                for (int k=0;k<arr[i][j].length;k++){
                    for(int l=0;l<arr[i][j][k].length;l++){
                        for (int m=0;m<arr[i][j][k][l].length;m++){
                            System.out.println("arr["+i+"]["+j+"]["+k+"]["+l+"]["+m+"] = "+arr[i][j][k][l][m]);
                        }
                    }
                }
            }
        }
        for (int i[][][][]:arr){
            for (int j[][][]:i){
                for (int k[][]:j){
                    for (int l[]:k){
                        for (int m:l){
                            System.out.println(m);
                        }
                    }
                }
            }
        }
    }
}