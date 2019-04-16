

public class MultiThreadedMergeSort<AnyType extends Comparable<? super AnyType>> implements Runnable {

    private int[] v;
    private int left;
    private int right;
    private int[] answer;

    public MultiThreadedMergeSort(int[] v, int left, int right) {
        this.v = v;
        this.left = left;
        this.right = right;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }


public void sorted(){
    // System.out.println("Im a thread");
    if(left == right && left >= 0) {
        this.answer = new int[]{v[left]};
        return;
    }
    if( left > right) return;


    int firsthalf = this.left + (right - left) / 2;
    int secondhalf = firsthalf + 1;

    MultiThreadedMergeSort oneT = new MultiThreadedMergeSort(v,left,firsthalf);
    MultiThreadedMergeSort twoT = new MultiThreadedMergeSort(v,secondhalf,right);
    Thread one = new Thread(oneT);
    one.start();
    Thread two = new Thread(twoT);
    two.start();

    try {
        one.join();
        two.join();
    }
    catch (InterruptedException exception){
        System.out.println("Error Joining");
    }

    merge(oneT.answer,twoT.answer);


}
    @Override
    public void run() {
       sorted();


    }
    public int[] merge(int[] subArray1, int[] subArray2) {

        answer = new int[subArray1.length + subArray2.length];

        int i = 0,j = 0,k = 0;

        while(i< subArray1.length && j < subArray2.length){
            if(i< subArray1.length && j < subArray2.length && subArray1[i] < subArray2[j]) {
                answer[k++] = subArray1[i++];

            }
            else if(i < subArray1.length && j < subArray2.length && subArray2[i] < subArray1[j]){
                answer[k++] = subArray2[j++];


            }

        }
        while( i < subArray1.length){
            answer[k++] = subArray1[i++];
        }

        while(j < subArray2.length){
            answer[k++] = subArray2[j++];

        }

        return answer;
    }





}

