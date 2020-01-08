public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i,j,k;
   String Array1[]={"Aaa", "shiii", "aaapp"};
   String Array2[]=new String[3];
   
    Array2[0]="Aaa";
    Array2[1]="Shiii";
    Array2[2]="aaapp";
    
    for(i=0; i<3;i++)
    {
           System.out.println(Array2[i]);
    System.out.println("for bentuk kedua");
        for(j=0; j<3; j++)
            
            System.out.println(Array2[j]);
        
        System.out.println("For Bentuk ke 3 dgn length");
        for(k=0;k<Array2.length;k++)
            System.out.println(Array2[k]);
    }
    
    }
    
    
}
