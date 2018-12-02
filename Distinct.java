
public static int[]Distinct(int[] data){
       Hashtable table = new Hashtable();
       ArrayList<int> arrayList= new ArrayList<int>(Arrays.asList(array));
       for(int i = 0; i < data.length; i++){
           if(table.containsKey(arrayList.get(i)){
          arrayList.remove(i);
      }else{
          table.put(arrayList.get(i),true);
      }
  }
  return arrayList.toArray();
