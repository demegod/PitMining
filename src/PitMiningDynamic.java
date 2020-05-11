
public class PitMiningDynamic {
	public int maxSubSum(int[] a, int left, int right){
		// what's the best we can do if we must dig at a[i]?
		int n = right - left + 1;
		int[] max = new int[n];
		int best = a[0];
		max[0] = a[0];
		for (int i = 1; i < n; i++){
			//don't keep stuff to the left
			if (max[i-1] < 0){
				max[i] = a[i];
			}
			//keep stuff to the left
			else{
				max[i] = max[i-1] + a[i];
			}
			if (max[i] > best){
				best = max[i];
			}
		}
		return best;
		
//		int profit = 0;
//		int profitLoss = 0;
//		
//		for (int i = 0; i < a.length; i++){
//			if (a[i] >= 0){
//				profit = profit + a[i];
//			}
//			else if (a[i] < 0){
//				profitLoss = profitLoss + a[i];
//			}
//		}
//		int totalProfit = profit + profitLoss;
//		
//		return totalProfit;
	}
}
