package com.adapter.client;


import com.adapter.adaptee.M4DataLine;
import com.adapter.adapter.M5DataLineAdapter;

public class AdapterMain {

    public static void main(String[] args) {
        //创建需要被适配的对象
        M4DataLine m4DataLine = new M4DataLine();
        //创建客户端需要被调用的对象
        M5DataLineAdapter adapter = new M5DataLineAdapter(m4DataLine);
        //请求处理
        adapter.connection();
    }
}
