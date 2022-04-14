class Minimum_Domino_Rotations_For_Equal_Row {
    public static void main(String[] args) {
        int[] tops = {5,2,6,2,3,2};
        int[] bottoms = {2,1,2,4,2,2};
        System.out.println(minDominoRotations(tops,bottoms));
    }

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        if(findTheSameNumber(tops,bottoms)!=-1){
            return findTheSameNumber(tops,bottoms);
        }else if(findTheSameNumber(bottoms,tops)!=-1){
            return findTheSameNumber(bottoms,tops);
        }else{
            return -1;
        }
    }
    
    public static int findTheSameNumber(int[] a, int[] b) {
        for(int i=1 ; i<a.length ; i++){
            if(a[i] != a[i-1]){
                if(a[i-1] == b[i]){
                    a[i] = b[i];
                }else{
                    return -1;
                }
            }
        }
        return a[0];
    } 
}