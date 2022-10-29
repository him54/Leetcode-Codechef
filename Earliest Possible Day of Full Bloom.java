class Solution {
    private class Seed{
        int plantTime;
        int growTime;
        
        public Seed(int p, int g){
            this.plantTime = p;
            this.growTime = g;
        }
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        ArrayList<Seed> list = new ArrayList<>();
        for(int i = 0; i<plantTime.length; i++){
            list.add(new Seed(plantTime[i], growTime[i]));
        }
        Collections.sort(list, (a,b) -> (b.growTime - a.growTime));// we are using lambda expression
        int time = 0;
        int max = 0;
        for(int i = 0; i<plantTime.length; i++){
            time += list.get(i).plantTime;
            max = Math.max(max, time+list.get(i).growTime);
        }
        return max;     
    }
}
