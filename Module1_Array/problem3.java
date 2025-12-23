public static void main(String[] args) {
        int[] n=new int[10];
        int cz=0;
        for(int i=0;i<5;i++){
            n[i]=i+1;
        }
        cz=5;
        System.out.println(n.length);
     System.out.println(" currect size "+ cz);
     for(int i=0;i<n.length;i++){
            System.out.println(i+" index "+n[i]);
        }
    // oparation -1 Append 
    int apVal=100;
    n[cz]=apVal;
    cz++;
    System.out.println("after append oparation");
    System.out.println(" currect size "+ cz);
     for(int i=0;i<n.length;i++){
            System.out.println(i+" index "+n[i]);
        }
}
}
