import java.util.HashMap;

/**
 * rotateMatrix
 */
public class rotateMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
           {1,2,3},
           {4,5,6},
           {7,8,9}};
        HashMap<String,Integer> map = new HashMap<>();
        for (int row=0; row< matrix.length; row++){
            int k = matrix.length;
            for (int col=0; col<matrix.length; col++){
                k--;
                map.put(row+"-"+col,matrix[row][col]);
                Integer val= map.get(k+"-"+row);
                if(val!=null){
                    matrix[row][col] = map.get(k+"-"+row);
                    map.remove(k+"-"+row);
                }
                else{
                    matrix[row][col] = matrix[k][row];
                }
                    
                
            }
        }
    }
}

