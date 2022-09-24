package threadpattern.bio;

import java.io.*;
import java.net.Socket;

public class SocketClient_2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",9999);

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            String sendInfo = "客户端发送数据：你好，服务端";
            int sendLenth = sendInfo.getBytes().length;
            objectOutputStream.writeInt(sendLenth);
            objectOutputStream.flush();
            objectOutputStream.write(sendInfo.getBytes());
            objectOutputStream.flush();

            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            int bytelength = objectInputStream.readInt();
            byte[] bytes = new byte[bytelength];
            objectInputStream.readFully(bytes);
            String s = new String(bytes);
            System.out.println("第一次接受：" + s);
            objectInputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
