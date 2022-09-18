/* Budget Shopping
Helen's school has provided her with a budget for purchasing the math notebooks her students will need. There are several stores that sell bundles 
of notebooks at various prices. She wants to purchase full bundles. She wants to purchase as many notebooks as she can within her budget.

Determine the maximum number of notebooks Helen can purchase with the amount she is given.

For example, Helen has n = $50 and there are m = 2stores. The first sells bundle of 20notebooks for cost $12each, and the second sells bundles of only 1notebok for $2each
She can buy 4 bundles of 20 for $48 leaving her with $2. She can then go to the second store and purchase 1 more notebook for $2 for a total of 81 notebooks.

Function Description
Complete the function budgetShopping in the editor below. The function must return an integer that denotes the maximum number of notebooks she can bu with n dollars.

Budgetshopping has the following parameter(s):
n: integer, the number of dollars in Helen's notebook budget
bundleCosts: Integer array, the cost of bundle of notebooks at shop[i]. */

public static int budgetShopping(int n,List<Integer> bundleQuantities,List<Integer> bundleCosts){
        	if (    n <= 0 || bundleCosts == null || bundleQuantities == null
    				|| bundleCosts.size() == 0 || bundleQuantities.size() == 0
    				|| bundleCosts.size() != bundleQuantities.size()) {
	        	return 0;
	        }

	        final int[] max = {0};

	        calculateRecursive(n, bundleCosts, bundleQuantities, max, 0, 0);

	        return max[0];
    }
    public	static void calculateRecursive(int n, List<Integer> cost, List<Integer> quantity, int[] max, int position, int count) {
	        if (n == 0 || position == cost.size()) {
                if (count>max[0]) {
                    max[0] = count;
                }
	            return;
	        }
	        for (int i = 0; i <= n/cost.get(position); i++) {
	            calculateRecursive(n - i * cost.get(position), cost, quantity, max, position + 1, count + i * quantity.get(position));
	        }
	    }
