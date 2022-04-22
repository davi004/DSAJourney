class Solution {

   public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        

        int count=0;
        Map<Integer ,Integer> map=new HashMap<>();
        Iterator<Integer> i=head1.iterator();
        while(i.hasNext()){
            int n=i.next();
            map.put(x-n,n);
        }
        Iterator<Integer> i2=head2.iterator();
        while(i2.hasNext()){
            if(map.containsKey(i2.next())){
                count++;
            }
        }
        return count;
        
   }
}
