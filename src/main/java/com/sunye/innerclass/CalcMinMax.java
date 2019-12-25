package com.sunye.innerclass;

public class CalcMinMax {

	public  int[] calc(int... numbs) {
		 Integer min = null;
		 Integer max = null;
		 
		 for (int numb : numbs) {
			 if (min == null || min > numb) {
				 min = numb;
			 }
			 if (max == null || max < numb) {
				 max = numb;
			 }
		 }
		 return new int[]{min, max};
	}
	
	public  Pair calc2(int... numbs) {
		 Integer min = null;
		 Integer max = null;
		 
		 for (int numb : numbs) {
			 if (min == null || min > numb) {
				 min = numb;
			 }
			 if (max == null || max < numb) {
				 max = numb;
			 }
		 }
		 return new Pair(min, max);
	}
	
	 class Pair {
		
		private Integer min;
		private Integer max;
		
		public Pair(Integer min, Integer max) {
			
			this.min = min;
			this.max = max;
		}
		
		public Integer getMin() {
			return min;
		}
		public void setMin(Integer min) {
			this.min = min;
		}
		public Integer getMax() {
			return max;
		}
		public void setMax(Integer max) {
			this.max = max;
		}
		
	}
}
