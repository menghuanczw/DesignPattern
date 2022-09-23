package threadpattern.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer_1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("服务端等待链接...");
            Socket socket = serverSocket.accept();
            System.out.println("服务端链接完成...");
            InputStream intputStream = socket.getInputStream();
            byte[] bytes = intputStream.readAllBytes();
            String s = new String(bytes,"utf-8");
            System.out.println("接受的数据是：" + s);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("服务端接受数据成功，返回成功信息。".getBytes());
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
