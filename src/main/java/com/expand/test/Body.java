package com.expand.test;

public class Body implements Cloneable {

    public Head head;

    public Body() {
    }

    public Body(Head head) {
        this.head = head;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body body = (Body) super.clone();
        body.head = (Head) head.clone();
        return body;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Body body = new Body(new Head(new Face()));
        Body body1 = (Body) body.clone();
        System.out.println("body == body1 : " + (body == body1));
        System.out.println("body.head == body1.head : " + (body.head == body1.head));
        System.out.println("body.head.face == body1.head.face : " + (body.head.face == body1.head.face));
    }
}

class Head implements Cloneable {
    public Face face;

    public Head() {
    }

    public Head(Face face) {
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Face {
}