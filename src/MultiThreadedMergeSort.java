

public class MultiThreadedMergeSort<AnyType extends Comparable<? super AnyType>> implements Runnable {

    private int[] v;
    private Thread t;

    public MultiThreadedMergeSort(int[] v){
        this.v = v;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

//    public Integer<AnyType> multiThreadMergeSort(List<AnyType> list){
//
//        int middle = list.size()/2;
//        MultiThreadedMergeSort left = new MultiThreadedMergeSort(list.subList(0,middle));
//        MultiThreadedMergeSort right = new MultiThreadedMergeSort(list.subList(middle,list.size()));
//
//
//
//        return list;
//    }

    public int[] mutiThreadMergeSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 2;

        }
    return array;
    }


    @Override
    public void run() {
        System.out.println("Im a thread");
        mutiThreadMergeSort(v);


    }






}

