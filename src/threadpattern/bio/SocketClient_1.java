package threadpattern.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class SocketClient_1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("第一次发送数据，请接受客户端的数据信息。".getBytes("utf-8"));
            outputStream.flush();
            TimeUnit.SECONDS.sleep(3);
            byte[] bytes = inputStream.readAllBytes();
            String s = new String(bytes,"utf-8");
            System.out.println("接受服务端返回端信息：" + s);
            outputStream.flush();
            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
