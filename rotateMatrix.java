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
        //The HashMap stores the positions we have swapped their values
        HashMap<String,Integer> elementsSwapped = new HashMap<>();
        //we use these Iterative blocks to transverse the 2D Array
        for (int row=0; row< matrix.length; row++){
            //a decrementing counter
            int k = matrix.length;
            for (int col=0; col<matrix.length; col++){
                k--;
                //I only add a position to the map if I haven't swapped it.
                if(matrix[row][col]!=Integer.MIN_VALUE){
                    elementsSwapped.put(row+"-"+col,matrix[row][col]);
                }
                //This gets the former value of a position if we already swapped its value.
                // if its not null that means it exists.
                if(elementsSwapped.get(k+"-"+row)!=null){
                    matrix[row][col] = elementsSwapped.get(k+"-"+row);
                    elementsSwapped.remove(k+"-"+row);
                }
                //if it doesnt that means it doesn't exist.
                else {
                    // if we haven't swapped the position before we'd just swap it.
                    matrix[row][col] = matrix[k][row];
                    //I make the element in this position to be minValue to indicate that I have swapped it.
                    matrix[k][row]=Integer.MIN_VALUE;
                }
            }
        }
    }
}

