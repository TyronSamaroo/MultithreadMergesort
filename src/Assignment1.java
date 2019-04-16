import java.util.List;

class Assignment1 {
    public static void main(String args[]) {



        Integer[] array = new Integer[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
            System.out.println(array[i]);
            }

//            Thread worker = new Thread(new MultiThreadedMergeSort<Integer>(array));
//            worker.start();
//
//            try {
//                worker.join();
//
//            } catch (InterruptedException ie) {
//                System.out.println("Error Joining");
//                System.out.println("Do this");
//
//
//            }

        }
    }
