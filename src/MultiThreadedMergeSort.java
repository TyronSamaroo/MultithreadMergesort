public class MultiThreadedMergeSort<AnyType extends Comparable<? super AnyType>> implements Runnable {

    private AnyType[] v;
    private Thread t;

    public MultiThreadedMergeSort(AnyType[] v){
        this.v = v;
    }

    public AnyType[] getV() {
        return v;
    }

    public void setV(AnyType[] v) {
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

    public void mutiThreadMergeSort(AnyType[] array){

    }
    @Override
    public void run() {
        System.out.println("Im a thread");

    }


}

