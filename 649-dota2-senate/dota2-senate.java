class Solution {
    public String predictPartyVictory(String senate) {
      Queue<Integer> r=new LinkedList<>();
      Queue<Integer> d=new LinkedList<>();
      for(int i=0;i<senate.length();i++){
          if(senate.charAt(i)=='R'){
              r.add(i);
          }
          if(senate.charAt(i)=='D'){
              d.add(i);
          }
      }
      while (!r.isEmpty() && !d.isEmpty()){
          int rVote=r.poll();
          int dVote=d.poll();

          if(rVote<dVote)
              r.add(rVote+senate.length());

          else
              d.add(dVote+senate.length());

      }
      return r.isEmpty()?"Dire":"Radiant";
    }
}