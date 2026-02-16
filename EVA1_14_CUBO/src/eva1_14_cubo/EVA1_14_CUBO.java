
package eva1_14_cubo;


public class EVA1_14_CUBO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] cubo=new int [3][5][2];
        for(int i=0; i<cubo.length;i++){ //primer dimension
            for(int j=0;j<cubo[i].length;j++){
                for(int k=0; k<cubo[i][j].length;k++){
                    cubo[i][j][k]=(int)(Math.random()*100);
                    
                }
            }
        }
    }
    
}
