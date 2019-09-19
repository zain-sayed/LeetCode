class Solution {
    public int maxArea(int[] height) {
        int side1 = 0;
        int side2 = 0;
        int width = 0;
        int h = 0;
        int maxArea = 0;
        int area = 0;
        for(int i=0;i<height.length;i++){
            for(int j =0;j<height.length;j++){
                side1=height[i];
                side2 = height[j];
                width = Math.max(j,i)-Math.min(i,j);
                h =  Math.min(side1,side2);
                area = width*h;
                if(area>maxArea){
                    maxArea=area;
                }
                
            }
        }
        return maxArea;
    }
}
