import java.util.List;

class Assignment1 {
    public static void main(String args[]) {



        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
            System.out.println(array[i]);
            }

        MultiThreadedMergeSort merger = new MultiThreadedMergeSort(array, 0, array.length- 1);
        Thread main = new Thread(merger);
        main.start();


        try {
            main.join();
        }catch (InterruptedException exception){
            System.out.println("Error");
        }









        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
//            worker.start();



        }
    }
