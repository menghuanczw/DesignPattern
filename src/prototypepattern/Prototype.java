package prototypepattern;

import javax.crypto.Mac;

/**
 * 实现 Cloneable 空接口，只为能够复制对象
 * Object 的 clone是浅拷贝，新对象是新地址，对象里的其他对象引用是不变的。
 */
public class Prototype implements Cloneable{
    private String name;
    private MacBook macBook;

    public Prototype(String name, MacBook macBook) {
        this.name = name;
        this.macBook = macBook;
    }

    public MacBook getMacBook() {
        return macBook;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", macBook=" + macBook +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MacBook mac = new MacBook("Pro");
        Prototype p = new Prototype("czw",mac);
        Prototype pc = (Prototype) p.clone();
        System.out.println(p.hashCode()+"--"+p);
        System.out.println(pc.hashCode()+"---"+pc);
        //796684896--Prototype{name='czw', macBook=prototypepattern.MacBook@246ae04d}
        //1644443712---Prototype{name='czw', macBook=prototypepattern.MacBook@246ae04d}

    }
}
