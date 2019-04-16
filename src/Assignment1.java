import java.util.List;

class Assignment1 {
    public static void main(String args[]) {



        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
            System.out.println(array[i]);
            }

        int[] left = new int[array.length/2];
        for (int i = 0; i < left.length; i++) {
            System.out.println(left[i] + "This is part of the left");

        }
        int[] right = new int[array.length - array.length/2];
        Thread one = new Thread(new MultiThreadedMergeSort(left));
        Thread two = new Thread(new MultiThreadedMergeSort(right));

        one.start();
        two.start();
        try {
            one.join();
            two.join();

        } catch (InterruptedException ie) {
            System.out.println("Error Joining");
            System.out.println("Do this");


        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
//            worker.start();



        }
    }
