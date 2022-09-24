package threadpattern.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class SocketClient_1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("第一次发送数据，请接受客户端的数据信息。".getBytes("utf-8"));
            outputStream.flush();
            System.out.println("发送数据完成...");

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
            char[] chars = new char[128];
            int length = 0;
            while((length = inputStreamReader.read(chars)) != -1){
                String s = new String(chars,0,length);
                System.out.println("接受服务端返回端数据：" + s);
            }
            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
