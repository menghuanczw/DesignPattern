package facadepattern;

public class Computer {
    private CUP cup;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cup = new CUP();
        memory = new Memory();
        disk = new Disk();
    }

    private void start(){
        System.out.println("computer start begin...");
        cup.start();
        disk.start();
        memory.start();
        System.out.println("computer start end...");
    }

    public void shutDown(){
        System.out.println("computer shutDoen begin...");
        cup.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("computer shutDown end...");
    }
}
