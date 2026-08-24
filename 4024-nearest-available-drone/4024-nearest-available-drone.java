class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int tx = target[0],ty = target[1];
        int bIndex =-1, bDist = Integer.MAX_VALUE;
        for(int i =0;i<drones.length;i++){
            int x =drones[i][0],y = drones[i][1],range =drones[i][2];
            int dist =Math.abs(x - tx) + Math.abs(y - ty);
            if(dist <= range){
                if(dist < bDist || (dist ==bDist && i< bIndex)){
                    bDist = dist;
                    bIndex =i;
                }
            }
        }
        return bIndex;
    }
}