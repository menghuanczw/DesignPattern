package threadpattern.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
            InputStreamReader inputStreamReader = new InputStreamReader(intputStream,"utf-8");
            char[] chars = new char[128];
            int length = 0;
            while ((length = inputStreamReader.read(chars)) != -1){
                String s = new String(chars,0,length);
                System.out.println("接受客户端发送端数据：" + s);
            }
            intputStream.close();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("服务端接受数据成功，返回成功信息。".getBytes());
            outputStream.flush();
            System.out.println("发送数据完成");

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
