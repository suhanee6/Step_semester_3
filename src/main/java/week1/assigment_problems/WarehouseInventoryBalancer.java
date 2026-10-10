package week1.assigment_problems;
public class WarehouseInventoryBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if(sectionA.length!=sectionB.length) throw new IllegalArgumentException("Arrays must have equal length");
        int totalA=0,totalB=0,max=Integer.MIN_VALUE,section=0,index=-1;
        for(int i=0;i<sectionA.length;i++) {
            totalA+=sectionA[i]; totalB+=sectionB[i];
            if(sectionA[i]>max){max=sectionA[i];section=1;index=i;}
            if(sectionB[i]>max){max=sectionB[i];section=2;index=i;}
        }
        String location=section==1?"Section A":"Section B";
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
          totalA,totalB,totalA==totalB?"Balanced":"Not Balanced",max,location,index+1);
    }
    public static void main(String[] args) { analyzeInventory(new int[]{20,15,30},new int[]{25,10,30}); }
}