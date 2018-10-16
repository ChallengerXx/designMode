package com.prototype;

import com.prototype.interfaces.Product;
import com.prototype.interfaces.impl.MessageBox;
import com.prototype.interfaces.impl.UnderLinePen;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen underLinePen = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');

        underLinePen.use("hello world");
        messageBox.use("hello world");
        messageBox1.use("hello world");
        System.out.println("============================");

        manager.register("Strong message", underLinePen);
        manager.register("Waring Box", messageBox);
        manager.register("Slash Box", messageBox1);

        Product product = manager.create("Strong message");
        product.use("hello world");
        Product product1 = manager.create("Waring Box");
        product1.use("hello world");
        Product product2 = manager.create("Slash Box");
        product2.use("hello world");

        System.out.println("============================");
        System.out.println(underLinePen == product);
        System.out.println(messageBox == product1);
        System.out.println(messageBox1 == product2);
    }
}
