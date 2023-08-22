
/**
 * fruitsIntoBasket
 */
public class fruitsIntoBasket {
public static void main(String[] args) {
    int[] fruits = {1,2,3,2,2};
    //This variable keeps track of the longestFruitPick
        int MaxFruitPick = 0;
        //this are pointers
            //This is the left pointer, it serves as left boundary
            int left = 0;
            //This is the right pointer, it serves as right boundary
            int right = 0;
        
        //This baskets are used to contain two diverse fruits
        int FruitInBasket1 = fruits[0];
        int FruitInBasket2 = fruits[0];

        // this iterative block is used to make sure the right wall doesnt exceed the lastIndex.
        while (right < fruits.length) {
            //Assign fruits on the right wall to currentFruit container
            int currentFruit = fruits[right];

            //we use this decision block to increment the right wall as long as the current Fruit exitst in either of the baskets.
            if ( FruitInBasket1 != currentFruit &&  FruitInBasket2 != currentFruit) {
                //we use this decision block to assign currentFruit to Second basket if the two baskets contain  similar fruits.
                if ( FruitInBasket1 == FruitInBasket2) FruitInBasket1 = currentFruit;
                //this else block triggers if fruits in either baskets are not similar.
                else {
                    //first we get the largest pick
                    MaxFruitPick = Math.max(right - left, MaxFruitPick);
                    // we want to remove the fruit in firstbasket and assign the currentFruit to it
                    FruitInBasket1 = currentFruit;
                    // then we collapse the walls by moving the left wall to the index before the right wall
                    left = right - 1;
                    //we also want to assign the fruit before the currentfruit to basketTwo
                    FruitInBasket2 = fruits[left];
                    //iterative block runs as long as left wall doesnt go beyond the first index
                    //To get the latest L-R
                    while (left >= 0) {
                        //this decision block is used to keep opening the left wall as long as fruit in left is in either baskets.
                        if (fruits[left] != FruitInBasket1 && fruits[left] != FruitInBasket2) {
                            left++;
                            break;
                        }
                        left--;
                    }
                }
            }
            right++; 
        }
        MaxFruitPick = Math.max(right - left, MaxFruitPick);
        System.out.println(MaxFruitPick);
}
    
}


