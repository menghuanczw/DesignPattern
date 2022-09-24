package threadpattern.bio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer_2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            int bytelength = objectInputStream.readInt();
            byte[] bytes = new byte[bytelength];
            objectInputStream.readFully(bytes);
            String s = new String(bytes);
            System.out.println("第一次接受：" + s);

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            String sendInfo = "服务端发送数据：你好，客户端";
            int sendLenth = sendInfo.getBytes().length;
            objectOutputStream.writeInt(sendLenth);
            objectOutputStream.flush();
            objectOutputStream.write(sendInfo.getBytes());
            objectOutputStream.flush();
            inputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
