package Concurrency;
import java.time.LocalDateTime;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Document {
    private String name;
    private String content;

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}

class PrintTask implements Runnable {
    private Printer printer;
    private Document document;

    public PrintTask(Printer printer, Document document) {
        this.printer = printer;
        this.document = document;
    }

    @Override
    public void run() {
        System.out.printf("%s: Sending a document to the printer \n",
                Thread.currentThread().getName());
        printer.print(document);
    }
}

class Printer {
    private final Lock printerLock = new ReentrantLock();

    public void print(Document document) {
        printerLock.lock();
        try {
            Long printDuration = (long) (Math.random() * 5000);
            System.out.println(Thread.currentThread().getName() + ": " +
                    "Printer: Printing Duration " + (printDuration / 1000) +
                    " seconds :: Time - " + LocalDateTime.now() + " Document" +
                    " Name: " + document.getName() + " Document" +
                    " Content: " + document.getContent());
            Thread.sleep(printDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s: Completed\n",
                    Thread.currentThread().getName());
            printerLock.unlock();
        }
    }
}

public class ReEntrantLock {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread[] = new Thread[5];

        for (int i = 0; i < 5; i++) {
            thread[i] = new Thread(new PrintTask(printer,
                    new Document("My_Document_" + i, "My Content " + i)),
                    "Thread " + i);
        }

        for (int i = 0; i < 5; i++) {
            thread[i].start();
        }
    }
}
