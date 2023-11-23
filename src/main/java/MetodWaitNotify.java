//import java.util.ArrayList;
//import java.util.Random;
//
//public class MetodWaitNotify {
//    public static void main(String[] args) {
//        DataBuffer buffer = new DataBuffer();
//
//        Thread producerThread = new Thread(new Producer(buffer));
//        Thread consumerThread = new Thread(new Consumer(buffer));
//
//        producerThread.start();
//        consumerThread.start();
//    }
//}
//
//class DataBuffer {
//    private int data;
//    private boolean available = false;
//
//    public synchronized void produce(int newData) {
//        while (available) {
//            try {
//                wait(); // Ожидание доступности данных
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        data = newData;
//        available = true;
//        notify(); // Уведомление о доступности данных
//    }
//
//    public synchronized int consume() {
//        while (!available) {
//            try {
//                wait(); // Ожидание доступности данных
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        available = false;
//        notify(); // Уведомление о получении данных
//        return data;
//    }
//}
//
//class Producer implements Runnable {
//    private DataBuffer buffer;
//
//    public Producer(DataBuffer buffer) {
//        this.buffer = buffer;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            buffer.produce(i);
//            System.out.println("Производитель сгенерировал число: " + i);
//        }
//    }
//}
//
//class Consumer implements Runnable {
//    private DataBuffer buffer;
//
//    public Consumer(DataBuffer buffer) {
//        this.buffer = buffer;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            int data = buffer.consume();
//            System.out.println("Потребитель получил число: " + data);
//            int result = data * data;
//            System.out.println("Результат обработки числа " + data + ": " + result);
//        }
//    }
//}
